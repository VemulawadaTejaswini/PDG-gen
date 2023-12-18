
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = s.length();
		for (int i = 0; i < s.length(); ++i) {
			char[] ns = s.toCharArray();
			for (int t = 0; t < s.length(); ++t) {
				boolean f = true;
				for (int j = 0; j < s.length() - t; ++j) {
					if (j + 1 < s.length() - t && ns[j + 1] == s.charAt(i)) {
						ns[j] = s.charAt(i);
					}
					f &= s.charAt(i) == ns[j];
				}
				if (f) {
					ans = Math.min(ans, t + 1);
				}
			}
		}
		boolean f = true;
		for (int i = 0; i + 1 < s.length(); ++i) {
			f &= s.charAt(i) == s.charAt(i + 1);
		}
		if (f)
			ans = 0;
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
