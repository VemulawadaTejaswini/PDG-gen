import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] array = new long[n];

		for(int i = 0; i < n; i++){
			array[i] = sc.nextLong();
		}

		long ans = array[0];

		for(int i = 0; i < n -1; i++){
			ans = lcm(ans, array[i+1]);
		}

		System.out.println(ans);
	}

	private static long gcd(long m, long n){
		if(n == 0) return m;
		return gcd(n, m % n);
	}

	private static long lcm(long m, long n){
		return m / gcd(m, n) * n;
	}
}