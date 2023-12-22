import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
public class Main {
	private static  BufferedReader  br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	* @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = parseNum();
		while (cnt-- > 0) {
			parseSnake();
		}
	}

	private static void parseSnake() {
		int     typ = 0;
		String  str = null;

		if ((str = parseStdin()) != null) {
			int		len = str.length();
			String  mid = null;
			if (str.startsWith(">'")) {
				if (str.endsWith("=~")) {
					mid = str.substring(2, len-1);
					if (mid.lastIndexOf("#") == (mid.length()/2)) {
						typ = 1;
					}
				}
			}
			else if (str.startsWith(">^")) {
				if (str.endsWith("=~~")) {
					mid = str.substring(2, len-2);
					if (mid.matches("(Q=)+")) {
						typ = 2;
					}
				}
			}
		}

		switch (typ) {
		case	1:
			System.out.println("A");
			break;
		case	2:
			System.out.println("B");
			break;
		default:
			System.out.println("NA");
			break;
		}
	}

	private static int parseNum() {
		int     num = 0;
		String  str = null;

		if ((str = parseStdin()) != null) {
			num = Integer.parseInt(str);
		}

		return num;
	}

	private static String parseStdin() {
		String  stdin = null;

		try {
			String  tmp = br.readLine();
			if (tmp != null) {
				if (!tmp.isEmpty()) stdin = tmp;
				}
			}
		catch (IOException e) {}

		return stdin;
	}
}