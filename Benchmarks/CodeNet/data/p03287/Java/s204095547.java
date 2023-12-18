import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		long sum = 0;
		long num = 0;
		for(int i = 1; i <= n; i++) {
			sum = a[i];
			if(sum % m == 0) num++;
			for(int j = i + 1; j <= n; j++) {
				sum += a[j];
				if(sum % m == 0) num++;
			}
		}
		System.out.println(num);
	}
}