import java.util.*;

public class Main {

	public static void main(String[] args) {
		int scc = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		if (N < M/2) {
			M -= N*2;
			scc += N + M/4;
		}
		
		else {
			scc += M/2;
		}
		
		System.out.print(scc);
	}

}
