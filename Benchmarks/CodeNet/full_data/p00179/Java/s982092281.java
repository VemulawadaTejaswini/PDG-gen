import java.util.*;

public class Main {

	public static boolean isEnd (String str) {
		return  (str.indexOf("r") == -1 && str.indexOf("g") == -1) ||
				(str.indexOf("r") == -1 && str.indexOf("b") == -1) ||
				(str.indexOf("g") == -1 && str.indexOf("b") == -1);

	}

	public static char getColor (char a, char b) {

		if ((a == 'r' && b == 'g') || a == 'g' && b == 'r') return 'b';
		if ((a == 'r' && b == 'b') || a == 'b' && b == 'r') return 'g';
		return 'r';

	}

	public static String bfs (String str) {

		if (isEnd(str)) return "0";

		ArrayList<String> pattern = new ArrayList<String>();
		ArrayList<String> memo = new ArrayList<String>();

		int step = 1;

		pattern.add(str);
		memo.add(str);

		while (!pattern.isEmpty()) {

			ArrayList<String> next = new ArrayList<String>();
//			System.out.println(step);
			for (String p : pattern) {
				for (int i = 1; i < p.length(); i++) {
					if (p.charAt(i - 1) != p.charAt(i)) {
						char[] c = p.toCharArray();
						char rep = getColor(p.charAt(i - 1), p.charAt(i));
						c[i - 1] = (c[i] = rep);
						if (isEnd(new String(c))) return "" + step;
						String rev = new StringBuffer(new String(c)).reverse().toString();
						if (!memo.contains(new String(c)) && !memo.contains(rev)) {
//							System.out.println(new String(c));
							memo.add(new String(c));
							next.add(new String(c));
						}
					}
				}

			}

			step++;
			pattern = next;
		}
		
//		System.out.println("変化の総数 : " + memo.size());
		return "NA";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			String str = sc.nextLine();
			if (str.equals("0")) break;
			System.out.println(bfs(str));

		}

	}

}