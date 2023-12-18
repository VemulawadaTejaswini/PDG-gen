import java.util.*;
import java.io.*;

public class Main {

	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sA = br.readLine().split(" ", n);
		String[] sB = br.readLine().split(" ", n);
		String[] sC = br.readLine().split(" ", n);
		int[] arrA = new int[n];
		int[] arrB = new int[n];
		int[] arrC = new int[n];
		for (int i = 0; i < n; i++) {
			arrA[i] = Integer.parseInt(sA[i]);
			arrB[i] = Integer.parseInt(sB[i]);
			arrC[i] = Integer.parseInt(sC[i]);
		}
		Arrays.sort(arrA);
		Arrays.sort(arrC);
		int total = 0;
		for (int i = 0; i < n; i++) {
			int countA = 0;
			for (int j = n - 1; j >= 0; j--) {
				if (arrB[i] > arrA[j]) {
					countA = j + 1;
					break;
				}
			}
			int countC = 0;
			for (int j = 0; j < n; j++) {
				if (arrB[i] < arrC[j]) {
					countC = n - j;
					break;
				}
			}
			total += countA * countC;
		}
		System.out.println(total);
	}
}
