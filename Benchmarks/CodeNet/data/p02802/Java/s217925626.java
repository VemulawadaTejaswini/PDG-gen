import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		List<Integer> pList = new ArrayList<>();
		List<String> sList = new ArrayList<>();
		Map<Integer, Boolean> bMap = new HashMap<>();

		for (int i = 0; i < m; i++) {
			int p = scan.nextInt();
			String s = scan.next();
			pList.add(p);
			sList.add(s);
			bMap.put(p, false);
		}

		int col = 0;
		int pen = 0;

		for (int i = 0; i < m; i++) {
			if (bMap.get(pList.get(i))) {
				continue;
			}
			if (sList.get(i).equals("WA")) {
				pen += 1;
			} else {
				col += 1;
				bMap.put(pList.get(i), true);
			}
		}

		System.out.println(col + " " + pen);

		scan.close();

	}

}
