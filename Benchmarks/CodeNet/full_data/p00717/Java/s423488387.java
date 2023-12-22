import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		while (true) {
			int N = nextInt();
			if (N == 0) {
				break;
			}

			Map<Integer, ArrayList<Integer[]>> map = new HashMap<Integer, ArrayList<Integer[]>>();
			for (int i = 0; i <= N; i++) {
				int point = nextInt();
				ArrayList<Integer[]> list = new ArrayList<Integer[]>();
				for (int j = 0; j < point; j++) {
					int x = nextInt();
					int y = nextInt();
					Integer[] push = { x, y };
					list.add(push);
				}
				map.put(i, list);
			}

			for (int i = 1; i < map.size(); i++) {
				if (map.get(0).size() != map.get(i).size()) {
					continue;
				}
				boolean is_same = isSame(map.get(0), map.get(i));
				if (!is_same) {
					Collections.reverse(map.get(i));
					is_same = isSame(map.get(0), map.get(i));
				}
				if (is_same) {
					System.out.println(i);
				}
			}
			System.out.println("+++++");
		}
	}

	static boolean isSame(ArrayList<Integer[]> list0, ArrayList<Integer[]> list1) {
		boolean is_same = true;
		// 長さを調べる
		for (int j = 1; j < list1.size(); j++) {
			int length = Math.abs(list1.get(j)[0] - list1.get(j - 1)[0]
					+ list1.get(j)[1] - list1.get(j - 1)[1]);
			int length0 = Math.abs(list0.get(j)[0] - list0.get(j - 1)[0]
					+ list0.get(j)[1] - list0.get(j - 1)[1]);
			if (length != length0) {
				is_same = false;
				break;
			}
		}
		if (!is_same) {
			return false;
		}
		boolean[] right0 = isRight(list0);
		boolean[] right1 = isRight(list1);
		for (int i = 0; i < right1.length; i++) {
			if ((!right0[i] && right1[i]) || (right0[i] && !right1[i])) {
				is_same = false;
				break;
			}
		}

		return is_same;
	}

	static boolean[] isRight(ArrayList<Integer[]> list) {
		boolean[] right = new boolean[list.size() - 2];

		for (int i = 2; i < list.size(); i++) {
			Integer[] first = list.get(i - 2);
			Integer[] second = list.get(i - 1);
			Integer[] third = list.get(i);
			if ((second[0] > first[0] && third[1] < second[1])
					|| (first[1] > second[1] && third[0] < second[0])
					|| (first[1] < second[1] && third[0] > second[0])
					|| (second[0] < first[0] && third[1] > second[1])) {
				right[i - 2] = true;
			}
		}

		return right;
	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

	static char nextChar() {
		try {
			int b = System.in.read();
			while (b != -1 && (b == ' ' || b == '\r' || b == '\n'))
				;
			if (b == -1)
				return 0;
			return (char) b;
		} catch (IOException e) {
		}
		return 0;
	}

}