import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int x = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		long count = 0;
		if(x < a[0]) {
			count = a[0] - x;
			a[0] = x;
		}
		for(int i = 1; i < n; i++) {
			if(a[i-1] + a[i] > x) {
				count += a[i] + a[i-1] - x;
				a[i] = (int) (a[i] - count);
			}
		}
		System.out.println(count);
	}
}
