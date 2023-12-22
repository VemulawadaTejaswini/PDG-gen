import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static final int VALUE = 0;
	public static final int WEIGHT = 1;
	
	public static final int IMPOSSIBLE = -1;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		doIt();
	}

	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int numOfData = 0;
		while(w != 0){
			numOfData++;
			int n = sc.nextInt();
			int[][] trs = new int[n][2];
			for(int i = 0; i < n; i++){
				String str = sc.next();
				String[] s = str.split(",");
				trs[i][VALUE] = Integer.parseInt(s[0]);
				trs[i][WEIGHT] = Integer.parseInt(s[1]);
			}
			//print(trs,n);
			//ソートしてみる
			Arrays.sort(trs, new MyComparator());
			//printTRS(trs,n);
			int[] dp = new int[w + 1];
			Arrays.fill(dp, IMPOSSIBLE);
			dp[0] = 0;
			boolean[][] used = new boolean[w + 1][n];
			int maxID = 0;

			for(int i = 1; i <= w; i++){
				//その重さでの最大の価値を求める
				for(int j = 0; j < n; j++){
					int wg = trs[j][WEIGHT];
					if(wg > i){
						//重さが既に超えていたら
						break;
					}
					else if(wg < i){
						int ind = i - wg;
						if(dp[ind] != IMPOSSIBLE && used[ind][j] == false){
							if(dp[ind] + trs[j][VALUE] > dp[i]){
								dp[i] = dp[ind] + trs[j][VALUE];
								for(int k = 0; k < n; k++){
									used[i][k] = used[ind][k];
								}
								used[i][j] = true;
							}
						}
					}
					//i == wg
					else{
						if(trs[j][VALUE] > dp[i]){
							dp[i] = trs[j][VALUE];
							Arrays.fill(used[i], false);
							used[i][j] = true;
						}
					}
				}
				if(dp[maxID] < dp[i]){
					maxID = i;
				}
				System.out.println(i + " : value = " + dp[i]);
			}
//			int maxID = 0;
//			for(int i = 0; i < w; i++){
//				if(dp[maxID] < dp[i]){
//					maxID = i;
//				}
//			}

			//完成？
			System.out.println("Case " + numOfData + ":");
			System.out.println(dp[maxID]);
			System.out.println(maxID);

			w = sc.nextInt();
		}
	}

	public static void printTRS(int[][] trs, int n){
		for(int i = 0; i < n; i++){
			System.out.println(i + " : value = " + trs[i][VALUE] + ", weight = " + trs[i][WEIGHT]);
		}
	}

}

class MyComparator implements Comparator<Object>{
	public MyComparator(){

	}
	public int compare(Object arg0, Object arg1) {
		// TODO 自動生成されたメソッド・スタブ
		int n1 = ((int[])arg0)[1];
		int n2 = ((int[])arg1)[1];
		return n1 < n2 ? -1 : 1;
	}
}