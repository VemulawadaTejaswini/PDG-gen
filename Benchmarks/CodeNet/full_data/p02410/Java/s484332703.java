import java.util.Scanner;
public class Main { 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//データ入力数nとmをここで得る。
		int m =sc.nextInt();
		int n = sc.nextInt();
		//bとAの配列を作る
		int[]b = new int[m];
		int[][]A = new int[n][m];
		//答えを入れておくように箱作っておく
		int[]ans= new int[n];
/*
		//配列bの読み込み
		for(int i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}
		*/
		//配列Aの読み込み,n回掛けたのを足すことをm回足す(　˙-˙　)…？
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
			for(int j=0;j<m;j++) {
				A[i][j] = sc.nextInt();
				ans[i] +=A[i][j]*b[j];
			}
			System.out.println(ans[i]);

			}
		}
	}



