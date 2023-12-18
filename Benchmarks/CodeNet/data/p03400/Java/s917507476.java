import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), d = sc.nextInt(), x = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= d; j++) {
				if ((j - 1) % a[i - 1] == 0)
					count++;
			}
		}
		System.out.println(count + x);
	}

}
