
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int i = 0;
		while (i == 0) {
			String line = sc.nextLine();
			String[] x = line.split(" ");
			int a = Integer.parseInt(x[0]);
			int b = Integer.parseInt(x[2]);
			String op = x[1];
			if (op.equals("+")) {
				list.add(a + b);
			}
			if (op.equals("-")) {
				list.add(a - b);
			}
			if (op.equals("*")) {
				list.add(a * b);
			}
			if (op.equals("/")) {
				list.add(a / b);
			}
			if (op.equals("?")) {
				break;
			}
		}
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}