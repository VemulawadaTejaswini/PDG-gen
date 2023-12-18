import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;

	int max3(int a, int b, int c) {
		int max = ((a < b) ? b : a);
		return (max < c)? c : max;
	}

	void doIt() {
		int h = sc.nextInt();
		int w = sc.nextInt();
		char f[][] = new char[h][];
		for(int i = 0; i < h; i++) {
			f[i] = sc.next().toCharArray();
		}
		int num[][] = new int[h][w];
		for(int i = 0; i < h; i++) Arrays.fill(num[i], -1);

		for(int i = 0; i < w; i++) {
			int cnt = 0;
			int s = 0;
			for(int j = 0; j < h; j++) {
				if(f[j][i] == '.')
					cnt++;
				else {
					for(int k = s; k < j; k++) {
						num[k][i] = cnt;
					}
					cnt = 0;
					s = j + 1;
				}
			}

			for(int k = s; k < h; k++) {
				num[k][i] = cnt;
			}


		}
		

		for(int i = 0; i < h; i++) {
			int cnt = 0;
			int s = 0;
			for(int j = 0; j < w; j++) {
				if(f[i][j] == '.') {
					cnt++;
				}
				else {
					for(int k = s; k < j; k++) {
						num[i][k] += cnt;
					}
					cnt = 0;
					s = j + 1;
				}
			}
			for(int k = s; k < w; k++) {
				num[i][k] += cnt;
			}


		}
		int max = 0;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				int val = num[i][j];
				max = (max < val)?val:max;
			}
		}
		System.out.println(max - 1);
	
		
	}


	public static void main(String[] args) {
		new Main().doIt();
	}
}
