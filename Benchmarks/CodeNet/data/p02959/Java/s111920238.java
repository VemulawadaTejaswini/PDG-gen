import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt(), sum = 0, left = 0;
		int[] A = new int[N + 1];
		for (int i = 0; i <= N; i++) {
			A[i] = sc.nextInt();
			sum += A[i];
		}
		for (int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			if (A[i] < temp) {
				temp -= A[i];
				A[i]=0;
				if(A[i+1]>temp) A[i + 1] -= temp;
				else A[i + 1]=0;
			}
			else {
				A[i] -= temp;
			}
			left += A[i];
		}
		System.out.println(sum-(left+A[N]));
	}
}