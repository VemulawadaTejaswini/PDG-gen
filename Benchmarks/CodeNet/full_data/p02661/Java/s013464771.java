import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		Arrays.sort(A);
		Arrays.sort(B);
		if(N % 2 == 1)
			System.out.println(B[N/2]-A[N/2]+1);
		else
			System.out.println((int)((double)((B[N/2]+B[N/2-1])/2-(double)((A[N/2]+A[N/2-1])/2))*2+1));
	}

}