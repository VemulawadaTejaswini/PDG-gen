import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		String[][] num = {{".", ",", "!", "?", " "},
		{"a", "b", "c"},
		{"d", "e", "f"},
		{"g", "h", "i"},
		{"j", "k", "l"},
		{"m", "n", "o"},
		{"p", "q", "r", "s"},
		{"t", "u", "v"},
		{"w", "x", "y", "z"}};
		int n = Integer.parseInt(sc.nextLine());
		String ans;
		for (int i = 0; i < n; i++) {
			ans = "";
			String line = sc.nextLine();
			int count = 0;
			for (int j = 1; j < line.length(); j++) {
				if (line.substring(j, j+1).equals("0")) {
					int k = Integer.parseInt(line.substring(j-1, j));
					if (k > 0)
						ans += num[k-1][count%num[k-1].length];
					count = -1;
				} else {
					count++;
				}
			}
			out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}