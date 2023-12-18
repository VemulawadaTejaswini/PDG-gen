import java.util.*;
public class Main {
	
	public static long gcd(long a, long b) {
		return b == 0 ? a: gcd(b, a % b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = gcd(A, B);
		int X = (int)Math.sqrt(C);
		List<Integer> p = new ArrayList<>();
		p.add(1);
		p.add(2);
		p.add(3);
		for(int i = 5; i <= X*2; i += 2) {
			boolean isp = true;
			for(int j = 2; j*j <= i; j++) {
				if(i % j == 0) {
					isp = false;
					break;
				}
			}
			if(isp)
				p.add(i);
		}
		int ans = 0;
		Set<Integer> u = new HashSet<>();
		for(int i : p) {
			if(C % i == 0) {
				C /= i;
				u.add(i);
				ans++;
			}
		}
		boolean isprime = true;
		if(C == 1)
			isprime = false;
		if(C % 2 == 0)
			isprime = false;
		if(C % 3 == 0)
			isprime = false;
		for(int i = 5; i <= Math.sqrt(C); i += 2)
			if(C % i == 0)
				isprime = false;
		if(C < X) {
			if(u.contains((int)C))
					isprime = false;
			
		}
		if(isprime)
			ans++;
		System.out.println(ans);

	}

}
