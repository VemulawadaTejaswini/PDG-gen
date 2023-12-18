import java.util.*;

public class Main {
	public static void main(String[] orgs) {
		Scanner sc = new Scanner(System.in);
		Int N = sc.nextInt();
		long L[] = new long[N+1];
		L[0] = 2;
		L[1] = 1;
		for(Int i = 2; i <= N; i++){
			L[i] = L[i-1] + L[i-2];
		}
		System.out.println(L[N]);
	}
}
	
