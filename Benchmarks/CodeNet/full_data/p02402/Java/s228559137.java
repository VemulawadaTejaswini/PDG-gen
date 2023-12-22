import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, max = -10000, min = 10000, sum = 0;
		n = sc.nextInt();
		System.out.println(n);
		int[] a=new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (min > a[i]) {
				min = a[i];
			}
			if (max < a[i]) {
				max = a[i];
			}
			sum = sum + a[i];
		}
		System.out.println(min + " " + max + " " + sum);
		sc.close();
	}
}


