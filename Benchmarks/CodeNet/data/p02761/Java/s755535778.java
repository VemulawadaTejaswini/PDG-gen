import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

//AtCoder Beginner Contest 157
//C	Guess The Number
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int ans = -1;
		if (M == 0) {
			sc.close();
			System.out.println(ans);
		} else {
			Map<Integer,Integer> m = new HashMap<>();
			for (int i = 0; i < M; i++) {
				Integer s = Integer.valueOf(sc.next());
				if (m.containsKey(s)) {
					Integer c = Integer.valueOf(sc.next());
					if (!m.get(s).equals(c)) {
						sc.close();
						System.out.println(ans);
						return;
					}
				} else {
					Integer c = Integer.valueOf(sc.next());
					if (N == 3 && s == 1 && c == 0) {
						sc.close();
						System.out.println(ans);
						return;
					}
					if (N == 2 && s == 2 && c == 0) {
						sc.close();
						System.out.println(ans);
						return;
					}
					m.put(s, c);
				}
			}
			sc.close();

			int[] aaa = new int[3];
			for (Entry<Integer, Integer> e : m.entrySet()) {
				aaa[e.getKey()-1] = e.getValue();
			}
			if (N == 3) {
				if (aaa[0] == 0) {
					aaa[0] = 1;
				}
				System.out.print(aaa[0]);
				System.out.print(aaa[1]);
				System.out.print(aaa[2]);
			} else if (N == 2) {
				if (aaa[1] == 0) {
					aaa[1] = 1;
				}
				System.out.print(aaa[1]);
				System.out.print(aaa[2]);
			} else {
				System.out.print(aaa[2]);
			}
		}
	}
}
