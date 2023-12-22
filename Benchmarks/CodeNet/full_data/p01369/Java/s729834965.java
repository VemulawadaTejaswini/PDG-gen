
import java.io.*;
import java.util.Arrays;

public class Main {

	//@2252  koukyoukoukokukikou
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for(;;) {
		String s = reader.readLine();
		if (s.equals("#")) {
			break;
		}
		
		int t = 0; // 0Å 1¶ 2E
		int cnt = 0;
		
		for(int i = 0; i < s.length(); i++) {
			int t2 = 1;
			if ("yuiophjklnm".indexOf(s.charAt(i)) >=  0) {
				t2 = 2;
			}
			if (t != 0 && t != t2) {
				cnt++;
			}
			t = t2;
		}
		System.out.printf("%d\n", cnt);
		}
		
		reader.close();
	}
}