import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] sum = new int[100001];
		sum[0] = 0;
		for(int i=1; i<=100000; i+=2) {
			if(like2017(i))
				sum[i] = sum[i-1] + 1;
			else
				sum[i] = sum[i-1];

			sum[i+1] = sum[i];
		}

		int Q = sc.nextInt();
		for(int i=0; i<Q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();

			System.out.println(sum[r]-sum[l-1]);
		}

	}

	public static boolean like2017(int n) {
		if(n % 2 == 0)
			return false;

		if(isPrime(n) && isPrime((n+1)/2))
			return true;
		else
			return false;
	}

	//高速な素数判定
	public static boolean isPrime(int n) {
		if(n < 2)
			return false;

		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;
		}

		return true;
	}

}
