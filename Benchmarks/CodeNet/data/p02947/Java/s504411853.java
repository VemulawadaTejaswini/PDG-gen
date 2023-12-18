import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		int N = nextInt();
		//int Slen = 10;

		char[][] C = new char[N][10];
		String[] S = new String [N];
		boolean[] f = new boolean [N];//比較済みであり

		for(int i=0;i<N;i++) {
			C[i]=next().toCharArray();
			Arrays.sort(C[i]);
			S[i] = new String(C[i]);
		}
		Arrays.sort(S);

		long sum = 0;
		for(int i=0;i<N-1;i++) {
			if(f[i])continue; // 加算済みであれば次へ飛ばす
			long cnt = 0;
			for(int j=i+1;j<N;j++){
				if(S[i].equals(S[j])) {
					cnt++;
					f[j] = true;
				}else {
					break;
				}
			}
			while(cnt>0) {
				sum+=cnt;
				cnt--;
			}
		}
		out.println(sum);
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

}