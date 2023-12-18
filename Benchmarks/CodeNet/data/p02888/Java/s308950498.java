import java.io.PrintStream;
import java.util.Arrays;
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
		final int[] L = new int[N];
		for(int i=0;i<N;i++) {
			L[i] = sc.nextInt();
		}
		int sum = 0;
		Arrays.sort(L);
		for(int a=0;a<N-2;a++) {
			for(int b=a+1;b<N-1;b++) {
				int ab = L[a]+L[b];
				for(int c=b+1;c<N;c++) {
					if(L[c]<ab) {
						sum++;
					}else {
						break;
					}
				}
			}
		}
		out.println(sum);
	}
}
