import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		Arrays.setAll(A, i -> sc.nextInt());
		Arrays.sort(A);
		int ans = 0, min = A[N-1];
		for(int i = 0; i < N-1; i++) {
			if(Math.abs(A[N-1]/2 - A[i]) < min) {
				min = Math.abs((A[N-1]+1)/2 - A[i]);
				ans = A[i];
			}
		}
		System.out.println(A[N-1] + " " + ans);
	}

}