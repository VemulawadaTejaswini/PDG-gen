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
			//Arrays.sort(trs, new MyComparator());
			//printTRS(trs,n);
			//i番目までを使ってwの重さの時の最大の価値を入れる
			int[][] dp = new int[n + 1][w + 1];
			//Arrays.fill(dp, IMPOSSIBLE);
			
			for(int i = 1; i <= n; i++){
				int wg = trs[i - 1][WEIGHT];
				for(int j = 1; j <= w; j++){
					if(wg <= j){
						dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - wg] + trs[i - 1][VALUE]);
					}
					else{
						dp[i][j] = dp[i - 1][j];
					}
				}
			}
			int[] d = dp[n];
			//print(dp[1]);
			int mw = 0;
			for(int i = 1; i <= w; i++ ){
				if(d[mw] < d[i]){
					mw = i;
				}
			}
			System.out.printf("Case %d:\n%d\n%d\n", numOfData, d[mw], mw);

			w = sc.nextInt();
		}
	}
	
	public static void print(int[] ar){
		int len = ar.length;
		for(int i = 0; i < len; i++){
			System.out.println(i + " : " + ar[i]);
		}
	}

	public static void printTRS(int[][] trs, int n){
		for(int i = 0; i < n; i++){
			System.out.println(i + " : value = " + trs[i][VALUE] + ", weight = " + trs[i][WEIGHT]);
		}
	}

}