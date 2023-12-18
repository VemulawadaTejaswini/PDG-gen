import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
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
		String S = next();
		long K = nextLong();
		int N = S.length();
		char[] C = (S.substring(N-1,N)+S).toCharArray();

		if(N == 1) {
			out.println(K/2);
			return;
		}

		List<Integer> cntList = new ArrayList<Integer>();
		long sum = 0;
		int cnt = 0;
		for(int i=1;i<=N;i++) {
			if(C[i-1] == C[i]){
				cnt++;
				if(cnt % 2 == 0) {
					sum++;
				}
			}else if(C[i-1] != C[i]) {
				if(cnt!=0) {
					cntList.add(cnt);
				}
				cnt = 1;
			}
		}
		if(cnt!=0) {
			cntList.add(cnt);
		}

		boolean f = false;
		if(K >= 2) {
			if(C[1]==C[N]) {
				int a = cntList.get(0);
				int b = cntList.get(cntList.size()-1);
				if(a % 2 == 1 && b % 2 == 1) {
					f = true;
				}
			}
		}

		sum *= K;
		if(f)sum--;
		out.println(sum);
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