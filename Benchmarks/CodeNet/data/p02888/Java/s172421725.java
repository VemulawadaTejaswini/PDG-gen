package abc143;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}

		Arrays.sort(list);

		int size = n;
		int sizei = size - 2;
		int sizej = size - 1;
		long sum = 0;

		for (int i = 0; i < sizei; i++) {
			int li = list[i];
			for (int j = i + 1; j < sizej; j++) {
				int lj = list[j];
				int val = li + lj;
				for (int k = j + 1; k < size; k++) {
					int lk = list[k];
					if (val <= lk) {
						sum = sum + k - j - 1;
						break;
					} else if (k == sizej) {
						sum = sum + k - j;
					}
				}
			}
		}
		System.out.println(sum);
	}
}
