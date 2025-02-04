package started;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		

		int n = scan.nextInt();
		int a[] = new int[n];
		long sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
			sum += a[i];
		}

		Arrays.sort(a);

		System.out.println(a[0] + " " + a[n-1] + " " + sum);
		
		scan.close();
	}
}