import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String w = br.readLine();
		int cnt = 0;
		String t;
		while (!(t = br.readLine()).equals("END_OF_TEXT")) {
			cnt += Check(t, w);
		}
		System.out.println(cnt);
	}

	private static int Check(String t, String w ) {
		int index = t.indexOf(w);
		if (index == -1) return 0;
		int cnt = 1;
		index += w.length();
		while (index > -1 && index < t.length()) {
			index = t.indexOf(w,index);
			if (index > -1) {
				cnt++;
				index += w.length();
			}
		}
		return cnt;
	}
}