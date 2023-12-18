import java.io.PrintStream;
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
		long[] AR = new long[N+2];
		long[] AL = new long[N+2];
		for(int i=1;i<=N;i++) {
			AR[i]=nextLong();
			if(AR[i]>=100000) {
				AL[i] = AR[i]/100000;
				String As = String.valueOf(AR[i]);
				As = As.substring(As.length()-5, As.length());
				AR[i] = Integer.valueOf(As);
			}
		}
		AR[0] = AR[N];
		AL[0] = AL[N];
		AR[N+1] = AR[1];
		AL[N+1] = AL[1];

		String res = "Yes";
		for(int i=1;i<=N;i++) {
			if((AR[i-1]^AR[i+1])!=(AR[i]^0)){
				if((AL[i-1]^AL[i+1])!=(AL[i]^0)) {
					res = "No";
					break;
				}
			}

		}
		out.println(res);
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