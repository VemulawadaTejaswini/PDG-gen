import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final long N = sc.nextInt();
		final long M = sc.nextInt();
		
		long scc = Math.min(N, M/2);
		long c = Math.max(M - (2 * N) , 0);
		
		scc += c/4;
		System.out.println(scc);
		sc.close();
	}

}
