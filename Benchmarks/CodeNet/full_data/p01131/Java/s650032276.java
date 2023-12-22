import java.io.IOException;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// キーマップを作る
		HashMap<Integer, String[]> keyMap = new HashMap<>();
		String[] key1 = { ".", ",", "!", "?", " " };
		keyMap.put(1, key1);
		String[] key2 = { "a", "b", "c" };
		keyMap.put(2, key2);
		String[] key3 = { "d", "e", "f" };
		keyMap.put(3, key3);
		String[] key4 = { "g", "h", "i" };
		keyMap.put(4, key4);
		String[] key5 = { "j", "k", "l" };
		keyMap.put(5, key5);
		String[] key6 = { "m", "n", "o" };
		keyMap.put(6, key6);
		String[] key7 = { "p", "q", "r", "s" };
		keyMap.put(7, key7);
		String[] key8 = { "t", "u", "v" };
		keyMap.put(8, key8);
		String[] key9 = { "w", "x", "y", "z" };
		keyMap.put(9, key9);
		//
		// int n = nextInt();// テストケース数
		//
		// Scanner scanner = new Scanner(System.in);//
		// 大きな数字が入力されるが、数字としては意味のない文字列なので、文字列として受け取る
		//
		// for (int i = 0; i < n; i++) {
		// String array = scanner.nextLine();
		// for (int j = 0; j < array.length(); j++) {
		// int key = Character.getNumericValue(array.charAt(j));// 1文字ずつ取り出す
		// if (key != 0) {
		// String[] map = keyMap.get(key);
		// int push = -1;// 同じボタンを押した数（0起点なので最初に1引いておく）
		// while (key != 0) {
		// push++;
		// j++;
		// key = Character.getNumericValue(array.charAt(j));
		// }
		//
		// push %= map.length;
		// System.out.print(map[push]);
		// }
		// }
		// System.out.print("\n");
		// }

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

}