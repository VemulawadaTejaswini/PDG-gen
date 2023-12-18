import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int A[] = new int[N];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt()*N;
			sum +=A[i];
		}
		int balance = sum /N;
		int min = Integer.MAX_VALUE;
		int num =0;
		for (int i=0;i<N;i++) {
			if (Math.abs(A[i]-balance)<min) {
				min = Math.abs(A[i]-balance);
				num =i;
			}
		}
		System.out.println(num);
	}
}