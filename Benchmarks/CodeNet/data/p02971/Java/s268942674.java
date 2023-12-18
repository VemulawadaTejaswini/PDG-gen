import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int max = 0;
		int max_i = 0;
		int next_max = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if(A[i] >= max) {
				next_max = max;
				max = A[i];
				max_i = i;
			} else if(A[i] > next_max) {
				next_max = A[i];
			}
		}
		
		for(int i = 0; i < N; i++) {
			if(i != max_i) {
				System.out.println(max);
			} else {
				System.out.println(next_max);
			}
		}
	}
}
