import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int v = Integer.parseInt(sc.nextLine());

		List<String> order = new ArrayList<String>();

		for (int i = 0; i < v; i++) {
			order.add(sc.nextLine());
		}

		for (String string : order) {
			String[] orders = string.split(" ");
			int v1 = Integer.parseInt(orders[1]);
			int v2 = Integer.parseInt(orders[2]);
			if (orders[0].equals("replace")) {
				line=line.replace(line.substring(v1, v2+1), orders[3]);
			}
			if (orders[0].equals("reverse")) {
				StringBuffer sb = new StringBuffer(line.substring(v1, v2+1));
				sb.reverse();
				line=line.replace(line.substring(v1, v2+1), sb);
			}
			if (orders[0].equals("print")) {
				System.out.println(line.substring(v1, v2+1));
			}
		}
	}
}