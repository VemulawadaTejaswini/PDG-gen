import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		// --- input ---
		String s = in.readLine();
		in.close();

		// --- resolv ---
		String[] words = {"dream", "erase", "eraser", "dreamer"}; // 5,6,7
		label : while(s.length() > 0) {
			for(String w : words) {
				if(s.length() >= w.length() && w.equals(s.substring(s.length() - w.length()))) {
					s = s.substring(0, s.length() - w.length());
					continue label;
				}
			}
			System.out.println("NO");
			return;
		}

		if(s.length() == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
