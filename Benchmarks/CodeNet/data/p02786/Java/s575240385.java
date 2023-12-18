import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double h = sc.nextDouble();
		long sum = 0;
		long i = 1;

		do {
			h /= 2;
			sum += i;
			i *= 2;
		}while(h > 1);

		sum += i;

		System.out.println(sum);
		sc.close();
	}
}
