import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long valueA = 0;
		long countA = 0;
		long valueB = 0;
		long countB = 0;
		for (int i = 0; i < n; i++) {
			long a = sc.nextLong();
			valueA += a;
			valueB += a;
			if (i % 2 == 0) {
				if (valueA >= 0) {
					countA += valueA + 1;
					valueA = -1;
				}
				if (valueB <= 0) {
					countB += -valueB + 1;
					valueB = 1;
				}
			} else {
				if (valueA <= 0) {
					countA += -valueA + 1;
					valueA = 1;
				}
				if (valueB >= 0) {
					countB += valueB + 1;
					valueB = -1;
				}
			}
		}
		if (countA < countB) {
			System.out.println(countA);
		} else {
			System.out.println(countB);
		}
	}
}
