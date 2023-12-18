import java.util.*;

public class Main {

	public static void main(String[] args) {
		int scc = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		if (N >= M/2) scc += M/2;
		
		else {
			M -= N*2;
			scc += N + M/4;
		}
		
		System.out.print(scc);
	}

}
