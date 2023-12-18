import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		long n = sc.nextLong();
		long sum = 0;
		for(long i = 1; i * i < n; i++) {
			if(n % i == 0) {
				long m = n / i - 1;
				if(n / m == n % m) {
					sum += m;
				}
			}			
		}
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
