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
		Arrays.sort(arrB);
		Arrays.sort(arrC);
		long[] countsA = new long[n];
		int left = 0;
		for (int i = 0; i < n; i++) {
			while (left < n && arrA[left] < arrB[i]) {
				countsA[i] = left + 1;
				left++;
			}
			if (left == n && arrA[n - 1] < arrB[i]) {
				countsA[i] = n;
			}
			left--;
		}
		long[] countsC = new long[n];
		int right = n - 1;
		for (int i = n - 1; i >= 0; i--) {
			while(right >= 0 && arrB[i] < arrC[right]) {
				countsC[i] = n - right;
				right--;
			}
			if (right < 0 && arrB[i] < arrC[0]) {
				countsC[i] = n;
			}
			right++;
		}
		long total = 0;
		for (int i = 0; i < n; i++) {
			total += countsA[i] * countsC[i];
		}
		System.out.println(total);
	}
}
