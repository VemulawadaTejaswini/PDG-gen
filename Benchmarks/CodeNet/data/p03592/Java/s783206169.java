import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		
		boolean ok = false;
		for(int i=0; i<=N; i++)
			for(int j=0; j<=M; j++)
				ok |= i*(M-j)+j*(N-i)==K;
		
		System.out.println(ok ? "Yes" : "No");
		
		sc.close();
	}
}
