
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	private static class List extends LinkedList<long[]> {
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List list = new List();
		while (true) {
			long one = sc.nextLong();
			long two = sc.nextLong();
			long three = sc.nextLong();
			if (one + two + three == -3) {
				break;
			}
			list.add(new long[]{one, two, three});
		}
		for (long[] ary : list) {
			long sum = ary[0] + ary[1];
			if (ary[0] == -1 || ary[1] == -1) {
				System.out.println("F");
			} else if (sum >= 80) {
				System.out.println("A");
			} else if (sum >= 65) {
				System.out.println("B");
			} else if (sum >= 50) {
				System.out.println("C");
			} else if (sum >= 30) {
				if (ary[2] >= 50) {
					System.out.println("C");
				} else {
					System.out.println("D");
				}
			} else {
				System.out.println("F");
			}
		}
	}
}