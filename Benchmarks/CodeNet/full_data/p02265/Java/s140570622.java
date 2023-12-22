import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
	static String[] dict = new String[1000005];

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter out = new PrintWriter(System.out);) {

			int n = Integer.parseInt(br.readLine());
			LinkedList<Integer> list = new LinkedList<>();
			br.lines().map(line -> Arrays.stream(line.split(" "))
					.map(String::new)
					.toArray(String[]::new))
					.forEach(token -> {
						switch (token[0]) {
						case "insert":
							// リストの先頭に追加
							list.addFirst(Integer.parseInt(token[1]));
							break;

						case "delete":
							// parseIntの戻り値はint型である為、
							// そのまま渡すとremove(int index)が呼び出されてしまう。
							// 明示的にInteger型に変換することで、
							// remove(Object o)メソッドを呼び出す。
							list.remove((Integer) Integer.parseInt(token[1]));
							break;

						case "deleteFirst":
							// 先頭の要素を削除
							list.removeFirst();
							break;

						case "deleteLast":
							// 末尾の要素を削除
							list.removeLast();
							break;
						}
					}

			);

			for (Iterator<Integer> it = list.listIterator(); it.hasNext();) {
                out.print(it.next());
                if (it.hasNext()) {
                    out.print(" ");
                } else {
                    out.println();
                }
            }
            out.flush();

			// for (int i = 0; i < n; i++) {
			// String[] tmp = br.readLine().split(" ");
			// String comm = tmp[0];
			// String key = tmp[1];
			//
			// if (comm.equals("insert")) {
			// insert(key);
			// } else if (comm.equals("find")) {
			// if (search(key)) {
			// pw.write("yes");
			// } else {
			// pw.write("no");
			// }
			// pw.write(System.lineSeparator());
			// }
			// }
			//
			// pw.flush();

		} catch (IOException e) {
		}

	}

	static int getKey(String key) {
		int sum = 0;
		for (int i = 0, p = 0; i < key.length(); i++, p = 5) {
			char cur = key.charAt(i);
			switch (cur) {
			case 'A':
				sum += p * 1;
				break;

			case 'C':
				sum += p * 2;
				break;
			case 'G':
				sum += p * 3;
				break;
			case 'T':
				sum += p * 4;
				break;

			}
		}
		return sum;
	}

	static int h1(String key) {
		return getKey(key) % dict.length;
	}

	static int h2(String key) {
		return 1 + getKey(key) % (dict.length - 1);
	}

	static boolean insert(String key) {
		int h = 0;
		for (int i = 0; h < key.length(); i++) {
			h = (h1(key) + i * h2(key)) % dict.length;
			if (dict[h] == null) {
				dict[h] = key;
				return true;
			} else if (dict[h].equals(key)) {
				continue;
			}
		}
		return false;
	}

	static boolean search(String key) {
		int h = 0;
		for (int i = 0; h < key.length(); i++) {
			h = (h1(key) + i * h2(key)) % dict.length;
			if (dict[h] == null) {
				return false;
			} else if (dict[h].equals(key)) {
				return true;
			}
		}
		return false;
	}

}

