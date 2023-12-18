

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a[] = new int[3];
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		int d = sc.nextInt();

		Arrays.sort(a);

		System.out.println(a[2] - a[1] <= d && a[1] - a[0] <= d ? "Yes" : "No");
	}

}
