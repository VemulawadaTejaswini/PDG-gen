import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		ArrayList<String> s = new ArrayList<String>();
		int idx;
		for (idx = 0; idx < N; idx++) {
			s.add(sc.next());
		}

		int i;
		long singlematch = 0;
		long match = 0;

		String str1;
		int size;
		while (!s.isEmpty()) {
			singlematch = 0;
			str1 = s.remove(0);
			size = s.size();
			if (size <= 0) {
				break;
			}
			// 残りからマッチするものを探して削除する、逆順に
			for (i = size - 1; i >= 0; i--) {
				if (matchstr(str1, s.get(i))) {
					++singlematch;
					s.remove(i);
				}
			}
			match += (singlematch * (singlematch+1)) / 2;
		}

		System.out.println(match);

	}

	private static boolean matchstr(String str1, String str2) {
		char[] c1 = str1.toCharArray();
		int idx;
		Integer pos;
		HashMap<Character, Integer> posMap = new HashMap<Character, Integer>();
		for (idx = 0; idx < 10; idx++) {
			// 探索済み文字か
			pos = posMap.get(c1[idx]);
			if (pos == null) {
				pos = 0;
			} else {
				pos += 1;
			}

			pos = str2.indexOf(c1[idx], pos);
			if (pos < 0) {
				return false;
			} else {
				posMap.put(c1[idx], pos);
			}
		}

		return true;
	}

}
