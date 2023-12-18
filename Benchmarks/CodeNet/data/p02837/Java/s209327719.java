
import java.util.Scanner;
public class Main {
	
	static int n;
	static int a;
	static int [][]x;
	static int []y;	
	static int []honest;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		x = new int [n][n];
		y = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			for(int j = 0 ; j < n ;j++) {
				x[i][j] = -1;               //初期化
			}
		}
		
		for(int i = 0 ;i < n ;i++) {
			int a = sc.nextInt();
			for(int j = 0 ; j < a ;j++) {
				int p = sc.nextInt();
				x[i][p-1] = sc.nextInt();   //i番目の人の証言でp番目の人が正直者かどうか
			}
		}

		solve();
	}
	
	static void solve() {
		int N = (int)Math.pow(2, n);
		int max = 0;
		
		for(int i = 0 ;i < N ;i++) {
			boolean flag = true;
			honest = new int [n];
			
	       for(int j = 0 ; j < n ;j++) {
				honest[j] = (1 & (i >> j));
			}
			
		point:for(int k = 0 ; k < n; k++) {  //証言者を全探査
			if(honest[k] == 0) {               //信頼できない人は飛ばす
				continue;
			}
			
				for(int l = 0 ; l < n ;l++) { //証言されている人を全探査
					if(x[k][l] == -1) {       
						continue;
					}
					
					else {
						if(honest[l] != x[k][l]) { //証言が正しいか
							flag = false;
							break point;
						}
						
					}
				}
			}
			if(flag) {
				int cnt = Integer.bitCount(i);
				
				max = Math.max(cnt, max);
			}
		}
		System.out.println(max);
	}

}
