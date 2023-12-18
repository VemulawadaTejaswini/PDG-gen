import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		ArrayList<BigDecimal> arrayA = new ArrayList<>(10);
		ArrayList<BigDecimal> arrayB = new ArrayList<>(10);
		for(BigDecimal i = BigDecimal.ZERO; i.compareTo(BigDecimal.ONE) < 0; i = i.add(BigDecimal.valueOf(0.1))) {
			arrayA.add(BigDecimal.valueOf(A).add(i).divide(BigDecimal.valueOf(0.08)));
			arrayB.add(BigDecimal.valueOf(B).add(i).divide(BigDecimal.valueOf(0.10)));
		}

		boolean isNotExists = true;
		start : for(BigDecimal a : arrayA) {
			if(a.compareTo(a.setScale(0)) != 0) {
				continue;
			}
			for(BigDecimal b : arrayB) {
				if(b.compareTo(b.setScale(0)) != 0) {
					continue;
				}
				if(a.compareTo(b) == 0) {
					isNotExists = false;
					System.out.println(a.intValue());
					break start;
				}
			}
		}
		if(isNotExists) {
			System.out.println(-1);
		}

	}
}	