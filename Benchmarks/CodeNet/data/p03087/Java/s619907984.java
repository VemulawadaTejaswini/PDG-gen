import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		String s = in.next();
		
		TreeSet<Integer> m = new TreeSet<>();
		//int[] a = new int[q];
		int idx = 0;
		while (true) {
			idx = s.indexOf("AC", idx);
			if (idx == -1) {
				break;
			}
			m.add(idx);
			idx++;
		}

		for (int i = 0; i < q; i++) {
			int l = in.nextInt() - 1;
			int r = in.nextInt() - 1;
			int c = m.subSet(l, true, r, false).size();
			System.out.println(c);
		}

	}

}
