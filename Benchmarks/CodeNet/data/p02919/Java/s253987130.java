import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		PrintStream out = null;
		try {
			sc = new Scanner(System.in);
			out = System.out;
			exec(sc, out);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		} finally {
			if(out != null) {
				out.close();
			}
			if(sc != null) {
				sc.close();
			}
		}
		System.exit(0);
	}
	public static void exec(final Scanner sc, final PrintStream out) throws Exception{
		final int N = sc.nextInt();
		final int[] P = new int[N+1];
		for(int i=1;i<=N;i++) {
			P[i] = sc.nextInt();
		}

		long score = 0;
		for(int L=1;L<=N-1;L++) {
			for(int R=L+1;R<=N;R++) {
				int top = 0;
				int second = 0;
				for(int i=L;i<=R;i++) {
					if(top < P[i]) {
						second = top;
						top = P[i];
						continue;
					}
					if(second < P[i]) {
						second = P[i];
						continue;
					}
				}
				score+=second;
			}
		}
		out.println(score);
	}

}
