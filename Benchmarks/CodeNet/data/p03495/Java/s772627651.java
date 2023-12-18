
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int[] Num = new int[9];
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = scan.nextInt() - 1;
			Num[A[i]]++;
		}
		Arrays.sort(Num);
		for(int i = 0; i < 9 - K; i++) {
			sum += Num[i];
		}
		System.out.println(sum);
		scan.close();

	}

}
