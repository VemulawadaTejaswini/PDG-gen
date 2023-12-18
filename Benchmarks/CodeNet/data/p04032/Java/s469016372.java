import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		for (int i=0; i<S.length(); i++) {
			String s = String.valueOf(S.charAt(i));
			List<Integer> list = map.get(s);
			if (list==null) {
				list = new LinkedList<Integer>();
				map.put(s, list);
			}
			list.add(i);
			int k = list.size();
			if (k<2) continue;
			for (int j=0; j<k; j++) {
				int charNum = k-j+1;
				int charLen = i-list.get(j)+1;
				if (charNum<=charLen/2) continue;
				System.out.printf("%d %d\n", list.get(j)+1, i+1);
				sc.close();
				return;
			}
		}
		System.out.println("-1 -1");
		sc.close();
	}

}
