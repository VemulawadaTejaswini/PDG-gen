import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++)
			A[i] = sc.nextInt();
		Arrays.sort(A);
		int point = 0, w = 0, h = 0;
		for(int i = N-1; i > 0; i--) {
			if(A[i] == A[i-1]) {
				w = A[i];
				point = i-2;
				break;
			}
		}
		for(int i = point; i > 0; i--) {
			if(A[i] == A[i-1]) {
				h = A[i];
				break;
			}
		}
		System.out.println(w*h);
	}

}