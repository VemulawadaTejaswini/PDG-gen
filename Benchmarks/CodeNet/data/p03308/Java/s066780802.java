import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] A = new int[N];
		A[0] = stdIn.nextInt();
		int min = A[0];
		int max = A[0];
		for(int i = 1; i < N; i++) {
			A[i] = stdIn.nextInt();
			if(A[i] < min) {
				min = A[i];
			}
			else if(A[i] > max) {
				max = A[i];
			}
		}
		System.out.println(max-min);

	}

}