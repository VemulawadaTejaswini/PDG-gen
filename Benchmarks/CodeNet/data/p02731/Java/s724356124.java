import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		double d = l / 3;
		double a = d * d * d;
		System.out.println(BigDecimal.valueOf(a));

		sc.close();
	}

}
