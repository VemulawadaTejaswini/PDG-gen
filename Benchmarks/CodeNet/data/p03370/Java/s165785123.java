import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int count = n;
		int[] a = new int[n];
		for (int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
			x-=a[i];
		}
		Arrays.sort(a);
		while (x > a[0]) {
			x-=a[0];
			count++;
		}

		System.out.println(count);
	}
}
