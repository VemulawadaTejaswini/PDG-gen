
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int h = 0;
		int w = 0;
		Integer[] A = new Integer[N];
		for(int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}
		Arrays.sort(A, Collections.reverseOrder());
		for(int i = 1; i < N; i++) {
			if(h == 0) {
				if(A[i - 1] == A[i]) {
					h = A[i];
					i++;
				}
			} else {
				if(A[i - 1] == A[i]) {
					w = A[i];
					break;
				}
			}
		}
		System.out.println(h * w);
		scan.close();

	}

}
