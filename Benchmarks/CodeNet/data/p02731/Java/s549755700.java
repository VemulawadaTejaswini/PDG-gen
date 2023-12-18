import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();

		System.out.println(wSide);
		System.out.println(tSide);
		System.out.println(hSide);

		BigDecimal result = wSide.multiply(tSide).multiply(hSide);

		System.out.print(result);
		sc.close();
	}
}
