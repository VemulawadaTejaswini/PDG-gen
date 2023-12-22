import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long k = sc.nextLong();
		Integer[] a = new Integer[n];

		int x;
		int y;
		int z;

		int re = 0;
		long num = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int tmp = a[0];
		re = a[tmp - 1];
		tmp = re;
		y = re;
		re = a[tmp - 1];
		tmp = re;
		z = re;
		re = a[tmp - 1];
		tmp = re;
		x = re;

		num = k % 3;
		
		//System.out.println(x+" "+y+" "+z);
		//System.out.println(num);

		if (num == 0) {
			System.out.println(z);
		}

		if (num == 1) {
			System.out.println(x);
		}

		if (num == 2) {
			System.out.println(y);
		}
	}
}