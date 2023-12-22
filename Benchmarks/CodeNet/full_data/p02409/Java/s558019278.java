import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[][] A = new int[3][10];
		int[][] B = new int[3][10];
		int[][] C = new int[3][10];
		int[][] D = new int[3][10];
		for (int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt() - 1;
			int c = sc.nextInt() - 1;
			int d = sc.nextInt();
			if (a==1) {A[b][c] += d;}
			else if (a==2) {B[b][c] += d;}
			else if (a==3) {C[b][c] += d;}
			else if (a==4) {D[b][c] += d;}
		}
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<10; j++) {
				System.out.print(" "+A[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");
		for (int i=0; i<3; i++) {
			for (int j=0; j<10; j++) {
				System.out.print(" "+B[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");
		for (int i=0; i<3; i++) {
			for (int j=0; j<10; j++) {
				System.out.print(" "+C[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");
		for (int i=0; i<3; i++) {
			for (int j=0; j<10; j++) {
				System.out.print(" "+D[i][j]);
			}
			System.out.println();
		}
	}
}
