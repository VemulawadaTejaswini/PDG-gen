import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		
		int scc = Math.min(N, M/2);
		int c = Math.max(M - (2 * N) , 0);
		
		scc += c/4;
		System.out.println(scc);
		sc.close();
	}

}
