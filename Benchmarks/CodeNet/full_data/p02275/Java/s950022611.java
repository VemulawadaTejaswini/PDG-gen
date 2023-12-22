
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void countingSort(int[] A, int[] B, int k, int n) {
		int[] C = new int[k];
		for (int j = 0; j < n; j++) {
			C[A[j]]++;
		}
		for (int i = 1; i < k; i++) {
			C[i] = C[i] + C[i - 1];
		}
		for (int j = n - 1; j >= 0; j--) {
			B[--C[A[j]]] = A[j];
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int n = Integer.parseInt(br.readLine());
		//String[] input = br.readLine().split(" ");
		int[] A = new int[n];
		int[] B = new int[n];
		int k = 0;
		for (int i = 0; i < n; i++) {
			A[i]=scanner.nextInt();
			//A[i] = Integer.parseInt(input[i]);
			k=Math.max(k, A[i]);
		}
		k = k + 1;
		countingSort(A, B, k, n);
		StringBuilder sb=new StringBuilder();
		sb.append(B[0]);
		for (int i = 1; i < n; i++) {
			sb.append(" " + B[i]);
		}
		System.out.println(sb);
	}

}
