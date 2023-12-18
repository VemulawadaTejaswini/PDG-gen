import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		long[] map = new long[N+1];
		map[N] = X;
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextLong();
		}
		
		Arrays.sort(map);
		
		long[] sa = new long[N];
		for (int i = 1; i <= N; i++) {
			sa[i-1] = map[i] - map[i-1];
		}
		
		long ans = sa[0];
		for (int i = 1; i < N; i++) {
			ans = gcd(ans, sa[i]);
			if(ans == 1) {
				break;
			}
		}
		
		System.out.println(ans);
	}
	
	static long gcd (long a, long b) {
		long temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}
 
}