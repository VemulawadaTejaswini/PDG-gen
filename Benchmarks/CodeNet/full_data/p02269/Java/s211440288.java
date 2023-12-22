import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static String[] hash = new String[1000005];

	/*
	 * PrintWriterのフラッシュを使わずに毎回コンソールに出力してみる
	 */

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

			int n = Integer.parseInt(br.readLine());
			br.lines().limit(n).forEach(line -> {

				String[] str = line.split(" ");
				if (str[0].equals("insert")) {
					insert(str[1]);
				} else {
					String ans = find(str[1]) ? "yes" : "no";
					System.out.print(ans);
				}
			});

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// 文字から数値に変換
	static int getChar(char c) {
		switch (c) {
		case 'A':
			return 1;
		case 'C':
			return 2;
		case 'G':
			return 3;
		case 'T':
			return 4;
		default:
			return 0;
		}
	}

	// 文字列から数値に変換してkeyを生成する
	static long getKey(String str) {
		long sum = 0;
		for (int i = 0, p = 1; i < str.length(); i++, p *= 5) {
			sum += p * str.charAt(i);
		}
		return sum;
	}

	// ハッシュ関数
	static int h1(long key) {
		return (int) (key % hash.length);
	}

	static int h2(long key) {
		return (int) (key % hash.length - 1) + 1;
	}

	static boolean find(String str) {
		long key;
		int index;
		key = getKey(str);
		// TODO 配列エラーが起こるかもしれない
		for (int i = 0;; i++) {
			index = (h1(key) + i * h2(key)) % hash.length;
			if (hash[index] == null) {
				return false;
			} else if (hash[index].equals(str)) {
				return true;
			}
		}

	}

	static boolean insert(String str) {
		long key;
		int index;
		key = getKey(str);
		// TODO 配列エラーが起こるかもしれない
		for (int i = 0;; i++) {
			index = (h1(key) + i * h2(key)) % hash.length;
			// TODO 重複した文字列を格納して良いのか？
			if (hash[index] == null) {
				hash[index] = str;
				return true;
			} else if (hash[index].equals(str)) {
				return false;
			}
		}
	}

}

