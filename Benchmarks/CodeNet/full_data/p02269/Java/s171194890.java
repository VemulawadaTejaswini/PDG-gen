
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		String order, str;

		for (int i = 0; i < n; i++) {
			order = sc.next();
			str = sc.next();
			if (order.equals("insert")) {
				list.add(str);
			} else if (order.equals("find")) {
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

