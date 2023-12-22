import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		List<BigDecimal> aList = new ArrayList<>();
		int result = 0;
		aList.add(new BigDecimal(sc.next()));
		for (int i = 1; i < n; i++) {
			BigDecimal ai = new BigDecimal(sc.next());
			for (BigDecimal aj : aList) {
				BigDecimal aiaj = ai.multiply(aj);
				int aiajInt = aiaj.intValue();
				if (aiaj.subtract(BigDecimal.valueOf(aiajInt)).doubleValue() == 0.0) {
					result++;
				}
			}
			aList.add(ai);
		}
		System.out.println(result);
	}

}
