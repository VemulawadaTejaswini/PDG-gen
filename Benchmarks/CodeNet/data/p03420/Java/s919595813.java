import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
		int k = sc.nextInt();


		System.out.println(solve(n,k));
	}
	
	long solve(long n, long k){
		
		if(k == 0){
			return n*n;
		}
		

		long sum = ((long) n - k) * ((long) n - k + 1);

		for( long i = k+1; i <=n;i++){
			long a = n%i;
			long b = n/i;
			
			sum -= b * k;
			if(a < k){
				sum += (k - 1 - a );
			}
		}
		return sum;
	}
}
