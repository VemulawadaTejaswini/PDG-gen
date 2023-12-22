import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] A = new int[n];
		
		for (int i = 0; i < n; i ++) {
			A[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		int q = partition(A, 0, n - 1);
		
		for (int i = 0; i < n - 1; i ++) {
			if (i == q) {
				System.out.print("[" + A[i] + "] ");
			} else {
				System.out.print(A[i] + " ");
			}
		}
		if (n - 1 == q) {
			System.out.println("[" + A[n - 1] + "]");
		} else {
			System.out.print(A[n - 1]);
		}
	}
	
	public static int partition (int[] A, int p, int r) {
		int x = A[r];
		int i = p - 1;
		
		for (int j = p; j < r; j++) {
			if (A[j] <= x) {
				i ++;
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}

		int temp = A[++ i];
		A[i] = A[r];
		A[r] = temp;

		return i;
	}
} 

