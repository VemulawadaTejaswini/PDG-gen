import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(sc.next());
		}

		sc.close();

		int count = 0;
		for(int i = 0; i < N; i++) {
			long xor = A[i];
			long sum = A[i];
			for(int j = i+1; j < N; j++) {
				xor ^= A[j];
				sum += A[j];

				if(xor == sum) {
					count ++;
					continue;
				}
			}
		}

		System.out.println(count + N);
	}

}
