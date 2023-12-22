import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, max = 0, min = 10000, sum = 0;
		i = sc.nextInt();
		int[] n = new int[i];
		for (int j = 0; j < i; j++) {
			n[j] = sc.nextInt();
			if (min > n[j]) {
				min = n[j];
			}
			if (max < n[j]) {
				max = n[j];
			}
			sum = sum + n[j];
		}
		System.out.println(min + " " + max + " " + sum);
		sc.close();
	}
}

