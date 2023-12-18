import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int K = sc.nextInt();
		
		long[] A = new long[X];
		long[] B = new long[Y];
		long[] C = new long[Z];
		
		for(int i = 0; i < X; i++) {
			A[i] = sc.nextLong();
		}
		
		for(int i = 0; i < Y; i++) {
			B[i] = sc.nextLong();
		}
		
		for(int i = 0; i < Z; i++) {
			C[i] = sc.nextLong();
		}
		
		long[] del = new long[X * Y * Z];
		int p = 0;
		
		for(int i = 0; i < X; i++) {
			for(int j = 0; j < Y; j++) {
				for(int k = 0; k < Z; k++) {
					del[p] = A[i] + B[j] + C[k];
					p++;
				}
			}
		}
		Arrays.sort(del);
		for(int i = del.length - 1; i > del.length -1 - K; i--) {
			System.out.println(del[i]);
		}
	}
}
