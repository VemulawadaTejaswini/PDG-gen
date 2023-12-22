import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList list = new ArrayList();

		for (int i = 0; i < n; i++) {
			String order = sc.next();
			String str = sc.next();
			if (order.equals("insert")) {
				list.add(str);
			}
			if (order.equals("find")) {
				findDic(list, str);
			}
		}
	}

	public static void findDic(ArrayList list, String str) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(str)) {
				System.out.println("yes");
				return;
			}
		}
		System.out.println("no");
		return;
	}
}

