import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] pattern = new int[n*(n-1)/2][4];//試合結果入力用
		
		int[] tensuu = new int[n];//勝ち得点記録用
		for(int i=0; i<n; i++){//初期化
			tensuu[i] = 0;
		}
		
		int[] rnk = new int[n];//順位用
		for(int i=0; i<n; i++){//初期化
			rnk[i] = 1;
		}
		
		for(int i=0; i<n*(n-1)/2; i++){//試合結果入力
			for(int j=0; j<4; j++){
				pattern[i][j] = s.nextInt();
			}
		}
		
		for(int i=0; i<n*(n-1)/2; i++){//勝ち得点を放り込む
			if(pattern[i][2]==pattern[i][3]){
				tensuu[pattern[i][0]-1]++;
				tensuu[pattern[i][1]-1]++;
			}
			if(pattern[i][2]<pattern[i][3]){
				tensuu[pattern[i][1]-1]+=3;
			}else if(pattern[i][2]>pattern[i][3]){
				tensuu[pattern[i][0]-1]+=3;
			}
		}
		for(int i=0; i<tensuu.length; i++){//順位
			for(int j=0; j<tensuu.length; j++){
				if(tensuu[i]<tensuu[j]){
					rnk[i]++;
				}
			}
		}
		for(int i=0; i<rnk.length; i++){
			System.out.println(rnk[i]);
		}
	}
}