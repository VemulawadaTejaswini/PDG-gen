import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj0027/input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("src/xxxyyyy/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int mm = sc.nextInt();
			int dd = sc.nextInt();
			if ((mm | dd) == 0)
				break;
			System.out.println(solve(mm, dd));
		}
	}

	String solve(int mm, int dd) {
		Calendar cal = Calendar.getInstance();
		cal.set(2004, mm - 1, dd);
		int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		return new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }[w];
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}
}