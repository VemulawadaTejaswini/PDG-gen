
// exhaustive search

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int[] S = new int[n];
		for (int i = 0; i < n; i++) {
			S[i] = Integer.parseInt(s[i]);
		}
		margeSort(S, 0, n);
		StringBuilder sb = new StringBuilder();
		sb.append(S[0]).append(" ");
		for (int i = 1; i < n; i++) {
			sb.append(S[i]).append(" ");
		}
		sb.append("\n").append(count).append("\n");
		System.out.print(sb);
	}
	public static int count = 0;
	public static void marge(int[] A, int left, int middle, int right) {
		int n1 = middle - left;
		int n2 = right - middle;
		int[] L = new int[n1 + 1];
		int[] R = new int[n2 + 1];
		for (int i = 0; i < n1; i++) {
			L[i] = A[left + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = A[middle + i];
		}
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		for (int k = left; k < right; k++) {
			if (L[i] <= R[j]) {
				A[k] = L[i];
				i++;
			} else {
				A[k] = R[j];
				j++;
			}
			count++;
		}
	}
	public static void margeSort(int[] A, int left, int right) {
		if ((left + 1) < right) {
			int middle = (left + right) / 2;
			margeSort(A, left, middle);
			margeSort(A, middle, right);
			marge(A, left, middle, right);
		}
	}
}