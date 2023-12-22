import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] A = new Integer[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(A, Collections.reverseOrder());
		int a = 0;
		for(int i=0; i<N-1; i++) {
			a+=A[i];
		}
		System.out.println(a);
	}

}