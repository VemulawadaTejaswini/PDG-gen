import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 1000000;
		int max = -1000000;
		long sum = 0;
		
		for (int i = sc.nextInt(); i > 0; i--) {
			int a = sc.nextInt();
			if (a <= min) {
				min = a;
			}
			if (a >= max) {
				max = a;
			}
			sum += a;
		}
		sc.close();
		System.out.println(min + " " + max + " " + sum);
	}
}