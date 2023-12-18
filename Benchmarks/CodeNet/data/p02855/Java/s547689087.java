import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	int H,W,K;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		H = nextInt();
		W = nextInt();
		K = nextInt();

		char[][] cake = new char [H][W];
		int[][] map = new int [H][W];
		for(int i=0;i<H;i++) {
			cake[i] = next().toCharArray();
		}

		int num = 1;
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if(cake[i][j] == '#') {
					map[i][j]=num;
					int _j = j-1;
					while(_j >= 0&&map[i][_j]==0) {
						map[i][_j] = num;
						_j--;
					}
					num++;
				}else if(j == W-1) {
					int _j = j;
					while(_j >= 0&&map[i][_j] == 0) {
						_j--;
					}
					if(_j >= 0) {
						int _num = map[i][_j];
						_j++;
						for(;_j<=j;_j++) {
							map[i][_j] = _num;
						}
					}
				}
			}
		}

		for(int i=0;i<W;i++) {
			for(int j=0;j<H;j++) {
				if(map[j][i] != 0) {
					int _j = j-1;
					num = map[j][i];
					while(_j >= 0&&map[_j][i]==0) {
						map[_j][i] = num;
						_j--;
					}
				}else if(j == H-1 && map[j][i] == 0) {
					int _j = j;
					while(_j >= 0&&map[_j][i] == 0) {
						_j--;
					}
					if(_j >= 0) {
						int _num = map[_j][i];
						_j++;
						for(;_j<=j;_j++) {
							map[_j][i] = _num;
						}
					}
				}
			}
		}


		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if(j != 0)out.print(" ");
				out.print(map[i][j]);
			}
			out.println();
		}

	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)a[i] = nextInt();
		return a;
	}
	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)a[i] = nextLong();
		return a;
	}
	public int nextInt() {
		return Integer.parseInt(next());
	}
	public long nextLong() {
		return Long.parseLong(next());
	}
	public String next() {
		return sc.next();
	}

	long gcd(long m,long n) {
		if (m<n) return gcd(n,m);
		if (n==0)return m;
		return gcd(n,m%n);
	}
}