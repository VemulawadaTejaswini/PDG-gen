
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();

		long count = 0;

		List<Long> list = new ArrayList<Long>();

		for (int i = 0; i < B - A + 1; i++) {
			list.add(A + i);

			if (!(list.get(i) % C == 0 || list.get(i) % D == 0)) {
				count++;
			}
		}
		System.out.print(count);
	}
}
