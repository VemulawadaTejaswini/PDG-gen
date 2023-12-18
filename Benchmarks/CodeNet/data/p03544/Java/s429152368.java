import java.util.*;

public class Main {
	public static void main(String[] orgs) {
		Scanner sc = new Scanner(System.in);
		Int N = sc.next();
		long L[] = new long[N+1];
		L[0] = 2;
		L[1] = 1;
		for(Int i = 0; i<N; i++){
			L[N] = L[N-1] + L[N-2];
		}
		System.out.println(L[N]);
	}
}
	
