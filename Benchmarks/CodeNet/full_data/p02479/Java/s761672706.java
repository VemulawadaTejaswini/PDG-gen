import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<long[]> list = new LinkedList<long[]>();
		while (true) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			if (a == 0L && b == 0L) {
				break;
			}
			list.add(new long[]{a, b});
		}
		for (long[] ary : list) {
			if (ary[0] > ary[1]) {
				System.out.println("a > b");
			} else if (ary[0] < ary[1]) {
				System.out.println("a < b");
			} else {
				System.out.println("a == b");
			}
		}
	}
}