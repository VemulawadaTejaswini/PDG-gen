import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] A = new int[N];
		int[] B = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = A[i];
		}
		
		Arrays.sort(A);
		
		int Y = yaku(A[0], A[1]);
		int check = 1;
				
		for(int i = 2; i < N; i++) {
			if(yaku(Y, A[i]) < Y) {
				Y = yaku(Y, A[i]);
				check = i;
			} else {
				Y = yaku(Y, A[i]);
			}
		}
		
		A[check] = A[0];
		int Y1 = yaku(A[0], A[1]);
		
		for(int i = 2; i < N; i++) {
			Y1 = yaku(Y1, A[i]);
		}
		
		Arrays.sort(B);
		
		B[0] = B[1];
		int Z = yaku(B[0], B[1]);
		
		for(int i = 2; i < N; i++) {
			Z = yaku(Z, B[i]);
		}
	
		System.out.println(Math.max(Y1, Z));
	}
	
	public static int yaku(int a, int b) {
		if(b == 0) {
			return a;
		}
		return yaku(b, a % b);
	}
}