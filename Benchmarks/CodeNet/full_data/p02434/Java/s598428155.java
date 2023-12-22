import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			// Generics の 配列は作れない　
			// ArrayList<Integer>[] A = new ArrayList<Integer>[0];
			ArrayList<ArrayList<Integer>> A = new ArrayList<>();
			int n = sc.nextInt();
			for(int i = 0; i < n; i++) {
				A.add(new ArrayList<Integer>());
			}
			int qn = sc.nextInt();
			for(int i = 0; i < qn; i++) {
				int q = sc.nextInt();
				switch(q) {  // 文字列に対し switch を使って良い
				case 0 /* pushBack*/: {
					int t = sc.nextInt();
					int x = sc.nextInt();
					A.get(t).add(x);
					break;  /* break を忘れない */
				}
				case 1 /* dump(t) */: {
					int t = sc.nextInt();
					String s = A.get(t).toString();
					/* [1, 2, 3] の形式なので、replace で余分な文字を取り除く */
					s = s.replaceAll("[\\[\\],]", "");
					System.out.println(s);
					break;  /* break を忘れない */
				}
				case 2: /* clear */ {
					int t = sc.nextInt();
					A.get(t).clear();
					break;  /* break を忘れない */
				}
				}
			}
		}
	}
}

