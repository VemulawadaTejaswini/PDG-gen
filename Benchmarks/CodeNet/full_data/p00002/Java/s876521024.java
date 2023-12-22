import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		int dataset = 4;

		for(int i = 0; i < dataset; i++) {
			int x = stdin.nextInt();
			int y = stdin.nextInt();
			int z = x + y;
			BigDecimal.valueOf(z).precision();



			System.out.println(BigDecimal.valueOf(z).precision());
		}

	}

}