import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		String s = in.next();
		
		TreeMap<Integer, Integer> m = new TreeMap<>();
		int idx = 0;
		while (true) {
			idx = s.indexOf("AC", idx);
			if (idx == -1) {
				break;
			}
			if (idx >= 0) {
				m.put(idx, idx);
			}
			idx++;
		}

		for (int i = 0; i < q; i++) {
			int l = in.nextInt() - 1;
			int r = in.nextInt() - 1;
			int c = m.subMap(l, true, r, false).size();
			System.out.println(c);
		}
	}

}
