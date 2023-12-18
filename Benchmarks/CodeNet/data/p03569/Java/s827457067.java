import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split("");

		String f = "";
		String b = "";

		for (int i = 0; i < str.length; i++) {
			if (!str[i].equals("x")) {
				f += str[i];
			}
		}

		StringBuffer s = new StringBuffer(f);
		b = s.reverse().toString();

		if (!f.equals(b)) {
			System.out.println("-1");
			return;
		}

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < str.length;) {
			int j = i;
			while (j < str.length && str[j].equals("x"))
				++j;
			list.add(j - i);
			i = j + 1;
		}
		
		long res = 0;
		for (int i = 0; i * 2 < list.size(); ++i) {
			res += Math.max(list.get(i), list.get(list.size() - 1 - i))
					- Math.min(list.get(i), list.get(list.size() - 1 - i));
		}
		System.out.println(res);
	}
}
