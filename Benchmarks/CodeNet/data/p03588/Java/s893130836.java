import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		int max = N;
		Arrays.sort(A);
		max += A[0]-1;
		Arrays.sort(B);
		max += B[N-1];
		System.out.println(max);
    }
}