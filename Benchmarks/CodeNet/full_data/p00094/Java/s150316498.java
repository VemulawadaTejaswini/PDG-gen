import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double tsubo = 3.305785;

		        Scanner stdin = new Scanner(System.in);

		        int a = stdin.nextInt();

		        int b = stdin.nextInt();

		        double s = (a * b) / tsubo;

		        BigDecimal land = new BigDecimal(s);
				BigDecimal land1 = land.setScale(6,BigDecimal.ROUND_HALF_UP);

				System.out.println(land1);



		    }
		}