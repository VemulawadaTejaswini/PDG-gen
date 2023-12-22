import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dataset = scanner.nextInt();
		for(int i=0; i<dataset; i++){
			BigDecimal firstBigDecimal = scanner.nextBigDecimal();
			BigDecimal seconBigDecimal = scanner.nextBigDecimal();
			System.out.println(firstBigDecimal.add(seconBigDecimal));
		}
	}
}