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
			int	len = str.length();
			if (len >= 6 && len%2 == 0) {
				if (str.charAt(0) == '>') {
					if (str.charAt(1) == '\'') {
						if (str.charAt(len-1) == '~' && str.charAt(len-2) == '=') {
							if (str.charAt(2) == '=') {
								char	stc = 0;
								int		mid = 2+(len-4)/2;
								for (int i = 2; i < len-1; i++) {
									stc = str.charAt(i);
									typ = (i == 2) ? 1 : typ;
									if ((stc != '=' && stc != '#') || (stc == '#' && i != mid) || (stc != '#' && i == mid)) {
										typ = 0;
										break;
									}
								}
							}
						}
					}
					else if (str.charAt(1) == '^') {
						if (str.charAt(len-1) == '~' && str.charAt(len-2) == '~' && str.charAt(len-3) == '=') {
							char	sc1 = 0;
							char	sc2 = 0;
							for (int i = 2; i+1 < len-2; i += 2) {
								typ = (i == 2) ? 2 : typ;
								sc1 = str.charAt(i);
								sc2 = str.charAt(i+1);
								if (sc1 != 'Q' || sc2 != '=') {
									typ = 0;
									break;
								}
							}
						}
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