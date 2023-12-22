

import java.util.Scanner;

public class Main {
	
	static boolean search(int[] a, int n, int key) {
		a[n] = key;
		int i = 0;
		while (a[i] != key)
			i++;
		return i != n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		int q = sc.nextInt();
		for (int i=0; i<q; i++) {
			int key = sc.nextInt();
			if (search(a, n, key))
				sum ++;
		}
		
		sc.close();
		
		System.out.println(sum);
	}

}

