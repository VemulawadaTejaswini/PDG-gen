import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int[] L = new int[N];
		for(int i = 0;i < N;i++) {
			L[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		Arrays.sort(L);
		int sum = 0;
		for(int i = N-1;i >=N-K;i--) {
			sum += L[i];
		}
		System.out.println(sum);
	}
}