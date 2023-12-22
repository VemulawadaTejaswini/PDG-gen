import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long ans = 0;
		for(long i = 1; i <= N; i++)
			ans += i * (i + 1) / 2;
		for (int i = 0; i < N-1; i++) {
		    int u = sc.nextInt();
		    int v = sc.nextInt();
		    if(u > v) {
		    	int t = u;
		    	u = v;
		    	v = t;
		    }
		    ans -= (N - v + 1) * u;
		}
		System.out.println(ans);
	}

}