
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long array[];
		array = new long[n];
		for (int i = 0; i < n; i++) {
			array[i] = Long.parseLong(sc.next());
		}

		long sum = 0;
		long tate = 0;
		long yoko = 0;
		for (int i = 0; i < n - 1; i++) {
			tate += array[i];
			yoko = array[i + 1];
			sum += tate * yoko;
			if (sum > 1000000007) {
				sum = sum % 1000000007;
			}
		}

		System.out.println(sum);

	}
}
