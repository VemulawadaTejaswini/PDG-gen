import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		int N = nextInt();
		int BScnt=0,AEcnt=0;//Bで始まる文字列を数える,Aで終わる文字列を数える
		String[] S = new String[N];
		for(int i=0;i<N;i++)S[i]=sc.next();

		long sum = 0;
		for(int l=0;l<N;l++) {
			int Slen=S[l].length();
			if(S[l].substring(0,1).equals("B"))BScnt++;
			if(S[l].substring(Slen-1,Slen).equals("A"))AEcnt++;

			S[l]=S[l].replaceAll("AB", "-");
			sum += (Slen - S[l].length());
		}

		int addAB = min(BScnt,AEcnt);
		if(addAB==N)addAB--;
		sum += addAB;
		//out.println(sum + " B:" + BScnt + " A:"+AEcnt);
		out.println(sum);

	}
	@SuppressWarnings("unused")
	private int min(int a, int b) {
		return Math.min(a, b);
	}
	@SuppressWarnings("unused")
	private int nextInt() {
		return Integer.parseInt(next());
	}
	@SuppressWarnings("unused")
	private long nextLong() {
		return Long.parseLong(next());
	}
	private String next() {
		return sc.next();
	}
}