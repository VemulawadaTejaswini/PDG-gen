import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n, max = -10000, min = 10000, sum = 0;
		i = sc.nextInt();
		for (int j = 0; j < i; j++) {
			n = sc.nextInt();
			if (min > n) {
				min = n;
			}
			if (max < n) {
				max = n;
			}
			sum = sum + n;
		}
		System.out.println(min + " " + max + " " + sum);
		sc.close();
	}
}

