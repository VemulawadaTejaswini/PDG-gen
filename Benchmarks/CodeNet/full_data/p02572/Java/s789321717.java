
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];
		for(int i = 0 ; i < n ; i++){
			a[i] = sc.nextInt();
		}
		int mod = (int)Math.pow(10.0, 9.0)+7;

		long sum = 0;
		for(int i = 0 ; i < n-1; i++){
			int tmp = 0;
			for(int j = i+1 ; j < n ; j ++){
				tmp += a[j];
			}
			sum += (a[i] * tmp);
			sum %= mod;
		}
		System.out.println(sum);
	}
}
