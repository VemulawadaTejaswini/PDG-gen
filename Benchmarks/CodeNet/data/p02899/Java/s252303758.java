import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N+10];
		for (int i = 0; i < N; i++) {
			A[sc.nextInt()] = i;
		}
		sc.close();

		for (int i = 1; i <= N; i++) {
			System.out.print(A[i] + 1 + " ");
		}
	}
}
