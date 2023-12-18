import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long h = sc.nextLong();
		long c=1;
		long sum = 1;

		while(h > 1) {
			h /= 2;
			c *= 2;
			sum += c;
		}

		System.out.println(sum);

		return;

	}

}

