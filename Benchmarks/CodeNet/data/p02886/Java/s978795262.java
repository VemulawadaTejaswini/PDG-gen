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
		final int[] d = new int[N];
		int sum = 0;
		for(int i=0;i<N;i++) {
			d[i] = sc.nextInt();
			sum += d[i];
		}

		long total = 0;
		for(int i=0;i<N;i++) {
			total += (sum - d[i])*d[i];
		}
		out.println(total/2);
	}
}
