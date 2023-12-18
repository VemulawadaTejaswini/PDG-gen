package Test1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		int n = Integer.parseInt(str);

		str = scan.nextLine();
		String[] substr = str.split(" ", 0);

		int[] array = new int[100000];
		for (int i=0; i<n; i++) {
			array[i] = Integer.parseInt(substr[i]);
		}

		long l = array[0];
		for (int i=1; i<n; i++) {
			l = lcm(array[i],l);
		}
		long ans = 0;
		for (int i=0; i<n; i++) {
			ans += l/array[i];
		}
		ans = ans % 1000000007;
		int a = (int)ans;

		System.out.println(a);

	}

	//最小公倍数lcm
	static long lcm (long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (c/b);
	}
}
