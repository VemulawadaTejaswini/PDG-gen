import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		ALDS1_6_B();
	}

	public static void ALDS1_6_B() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i = 0; i < n; i++)
			A[i] = sc.nextInt();
		
		int x = A[n-1];
		int j = -1;
		for(int i = 0; i < n - 1; i++) {
			if(A[i] <= x) {
				j++;
				int tmp = A[j];
				A[j] = A[i];
				A[i] = tmp;
			}
		}
		int tmp = A[j + 1];
		A[j + 1] = A[n - 1];
		A[n - 1] = tmp;

		for(int i = 0; i < n; i++) {
			if(i != 0)
				System.out.print(" ");
			if(i == j + 1)
				System.out.print("[");
			System.out.print(A[i]);
			if(i == j + 1)
				System.out.print("]");
		}
		System.out.println();
	}
}
