import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long result =0;
		int N = sc.nextInt();
		long A[] = new long[N];
		long sum =0;
		for (int i=0;i<N;i++) {
			A[i]= sc.nextLong();
			sum +=A[i];
		}
		for (int i=0;i<N;i++) {
			sum -=A[i];
			result = (result +(sum%1000000007)*A[i])%1000000007;
		}
		System.out.println(result);
	}
}