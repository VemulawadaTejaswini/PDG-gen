import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		new Main(new Scanner(System.in), System.out, System.err).exec();
	}
	private final Scanner sc;
	private final PrintStream out, err;
	public Main(final Scanner sc, final PrintStream out, final PrintStream err) {
		this.sc = sc;
		this.out = out;
		this.err = err;
	}

	public void exec() throws Exception{
		final int N = sc.nextInt();
		String S = sc.next();

		int sum = 0;
		char last = S.charAt(0);
		for(int i=1;i<N;i++) {
			char next = S.charAt(i);
			if(last != next) {
				last = next;
				sum++;
			}
		}
		sum++;
		out.println(sum);
	}
}
