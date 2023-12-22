import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		if (N % 2 == 1) {
			int mid = N / 2;
			for (int i = 0; i < M; i++) {
				System.out.println((mid-i)+" "+(mid+i+1));
			}
		} else {
			int j = N-2;
			for (int i = 1; i < M; i++) {
				System.out.println(i+" "+j);
				j--;
			}
			System.out.println(N/2+" "+N);
		}
	}
}