import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		int tmp = a[n-1];
		int sub;
		int b = 0;

		//for (int i = 0; i < n; i++)
		//	System.out.println(a[i]);

		for (int i = 0; i < n; i++) {
			sub = Math.abs((a[n-1]+1)/2-a[i]);
			if (sub < tmp) {
				tmp = sub;
				b = i;
			}
		}

		System.out.println(a[b] + " " + a[n-1]);
	}
}
