
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<String> dicSet = new HashSet<String>();
		String order, str;

		for (int i = 0; i < n; i++) {
			order = sc.next();
			str = sc.next();
			if (order.equals("insert")) {
				dicSet.add(str);
			} else if (order.equals("find")) {
				findDic(dicSet, str);
			}
		}
	}

	public static void findDic(HashSet<String> dicList, String str) {
		if (dicList.contains(str)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}
}

