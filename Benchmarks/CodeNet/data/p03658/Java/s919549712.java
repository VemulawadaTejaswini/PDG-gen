package snaketoy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ans = 0;
		
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] items = new int[n];
		for (int i = 0; i < items.length; i++) {
			items[i] = scanner.nextInt();
		}
		Arrays.sort(items);
		for (int i = 0; i < k; i++) {
			ans+= items[items.length-1-i];
		}
		System.out.println(ans);
		scanner.close();
	}
}
