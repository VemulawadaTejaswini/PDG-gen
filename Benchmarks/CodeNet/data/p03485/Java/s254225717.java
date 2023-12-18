import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = 0;

        c = Math.ceil(((a + b) / 2));

        System.out.println(String.format("%.0f", c));

		sc.close();
	}
}
