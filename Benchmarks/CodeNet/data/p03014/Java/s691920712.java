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
		int wmax = 0;
		int hmax = 0;
		for(int i = 0; i < w; i++) {
			int cnt = 0;
			for(int j = 0; j < h; j++) {
				if(f[j][i] == '.')
					cnt++;
				else {
					hmax = (hmax < cnt)?cnt:hmax;
					cnt = 0;
				}
			}
			hmax = (hmax < cnt)?cnt:hmax;
		}
		for(int i = 0; i < h; i++) {
			int cnt = 0;
			for(int j = 0; j < w; j++) {
				if(f[i][j] == '.') {
					cnt++;
				}
				else {
					wmax = (wmax < cnt)?cnt:wmax;
					cnt = 0;
				}
			}
			wmax = (wmax < cnt)?cnt:wmax;
		}
		System.out.println(hmax + wmax - 1);
	}


	public static void main(String[] args) {
		new Main().doIt();
	}
}
