import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
	public static void main(String[] args) {
		// code to read values
		// code to call required method
		// code to display the result
		// System.out.println(Math.ceil(2.5));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[1000001];
		long sum = 0;
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			arr[val]++;
			sum += val;
		}
		int k = sc.nextInt();
		while (k > 0) {
			// System.out.println("hey");
			int old = sc.nextInt();
			int recent = sc.nextInt();
			arr[recent] += arr[old];
			sum = sum - (arr[old] * old) + (arr[old] * recent);
			arr[old] = 0;
			System.out.println(sum);
			k--;
		}
	}

}