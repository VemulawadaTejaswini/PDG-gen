import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int inCnt = 0;
		while ((s = stdIn.readLine()) != null) {
			String[] se = s.split(" ");
			if (se[1].equals("?"))
				break;
			int a = Integer.valueOf(se[0]);
			int b = Integer.valueOf(se[2]);
			doMain(++inCnt, a, se[1], b);
		}
		System.exit(0);
	}

	private static void doMain(int inCnt, int a, String op, int b) {
		int r = 0;
		switch (op) {
		case ("+"):
			r=a+b;
			break;
		case ("-"):r=a-b;
			break;
		case ("*"):r=a*b;
			break;
		case ("/"):r=a/b;
			break;
		}
		System.out.printf("%d\n", r);

	}
}