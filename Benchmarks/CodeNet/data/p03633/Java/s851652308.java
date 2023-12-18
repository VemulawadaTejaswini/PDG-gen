
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long t[] = new long[n];
		for(int i=0; i<n; i++) {
			t[i]=sc.nextLong();
		}
		long ans = t[0];
		for(int i=1; i<n; i++) {
			ans = lcm(ans, t[i]);
		}
		System.out.println(ans);

		sc.close();
	}

	public long gcd(long a, long b) {
		if(b==0) return a;
		return gcd(b, a%b);
	}

	public long lcm(long a, long b) {
		return a / gcd(a,b) * b;
	}



}
