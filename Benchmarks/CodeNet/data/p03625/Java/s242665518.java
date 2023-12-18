
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long h = 0;
		long w = 0;
		Long[] A = new Long[N];
		for(int i = 0; i < N; i++) {
			A[i] = scan.nextLong();
		}
		Arrays.sort(A, Collections.reverseOrder());
		for(int i = 1; i < N; i++) {
			if(h == 0) {
				if(A[i - 1].equals(A[i])) {
					h = A[i];
					i++;
				}
			} else {
				if(A[i - 1].equals(A[i])) {
					w = A[i];
					break;
				}
			}
		}
		System.out.println((long)h * w);
		scan.close();

	}

}
