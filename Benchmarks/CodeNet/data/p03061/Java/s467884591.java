import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int N = Integer.parseInt(sc.next());
			
			int[] A = new int[N];
			for(int i = 0; i < N; i++) {
				A[i] = Integer.parseInt(sc.next());
			}
			
			int c = 0;
			int a = A[N -1];
			int b = A[1];
			Arrays.sort(A);
			while((c = a % b) != 0) {
				a = b;
				b = c;
			}
			int d = b;
			c = 0;
			a = A[N -1];
			b = A[0];
			Arrays.sort(A);
			while((c = a % b) != 0) {
				a = b;
				b = c;
			}
			int e = b;
			System.out.println(Math.max(d, e)); 
		} // Scanner Close
	}
}