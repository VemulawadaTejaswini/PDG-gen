import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		BigDecimal[] array = new BigDecimal[n];
		for (int i = 0; i < n; i++) {
			array[i] = new BigDecimal(sc.nextLine());
		}
		sc.close();
		Arrays.sort(array);
		BigDecimal b = array[n - 1];
		BigDecimal comparer = new BigDecimal(0);
		for (int i = n - 2; i >= 0; i--) {
			if (b.divideAndRemainder(array[i])[1].compareTo(comparer) != 0) {
				b = b.multiply(array[i]);
			}
		}
		System.out.println(b.toString());
	}
}