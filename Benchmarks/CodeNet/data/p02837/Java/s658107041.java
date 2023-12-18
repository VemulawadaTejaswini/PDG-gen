import java.util.Scanner;

public class Main {

	public static int times(int x, int n) {
		int num = 1;
		for(int i = 0; i < n; i++) {
			num = num*x;
		}
		return num;
	}
	public static void digits(int x, int r, int[] d) {
		int digits = 1;
		//String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
				d[digits++] = (x % r);
				x /= r;

		}while(x != 0);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		int x[][] = new int[n+1][n+1];
		int y[][] = new int[n+1][n];
		int ai[] = new int[n+1];
		for(int i = 1; i < n+1; i++) {
			ai[i] = sca.nextInt();
			for(int j = 1; j < ai[i] + 1; j++) {
				x[i][j] = sca.nextInt();
				y[i][j] = sca.nextInt();
			}
		}
		int big = 0;
		int digi[] = new int[n+1];
		for(int i = 1; i < n+1; i++) {
			digi[i] = 0;
		}
		int count;
		for(count = 0; count < times(2, n); count++) {
			digits(count, 2, digi);
			boolean flag = true;
			for(int i = 1; i < n+1; i++) {
				if(flag == false) {
					break;
				}
				for(int j = 1; j < ai[i] + 1; j++) {
					if (digi[x[i][j]] == y[i][j] && digi[i] == 1) {
						// ループを続ける
					}
					//else if(digi[x[i][j]] != y[i][j] && digi[i] == 1 || digi[x[i][j]] == y[i][j] && digi[i] == 0){
					else if(digi[x[i][j]] != y[i][j] && digi[i] == 1){
						flag = false;
						break;
					}
				}
			}
			if(flag == true) {
				int big_t = 0;
				for(int i = 1; i < n+1; i++) {
					if(digi[i] == 1) {
						big_t++;
					}
				}
				if(big < big_t) {
					big = big_t;
				}
			}
		}
		System.out.println(big);
		sca.close();
	}
}