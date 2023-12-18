import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String m = "";
		try {
			m = new StringBuffer(sc.readLine()).reverse().toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String ans = "YES";
		int no = 0;
		try {
			sc.close();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		while (m.length() > no && m.length() > 4) {
			if (m.substring(no).startsWith("maerd")) {
				no += 5;
			} else if (m.substring(no).startsWith("remaerd")) {
				no += 7;
			} else if (m.substring(no).startsWith("esare")) {
				no += 5;
			} else if (m.substring(no).startsWith("resare")) {
				no += 6;
			} else {
				break;
			}
		}

		if (m.length() != no) {
			ans = "NO";
		}
		System.out.println(ans);
	}
}
