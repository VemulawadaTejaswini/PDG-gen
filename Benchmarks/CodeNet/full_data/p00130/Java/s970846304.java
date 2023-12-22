import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	private	static	BufferedReader	br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		int	cnt = parseCnt();

		while (cnt-- > 0) {
			solve(parseStdin());
		}
	}

	private static void solve(String stdin) {
		Train	ct = null;
		Train	pt = new Train();
		Train	ht = pt;
		Train	tt = pt;
		int		ti = 0;
		String	ot = "";

		pt.tc = stdin.charAt(ti);

		while ((ti = stdin.indexOf('-', ti)) != -1) {
			ct = new Train();
			if (stdin.charAt(ti+1) == '>') {
				ct.tc = stdin.charAt(ti+2);
				if (tt.tc == pt.tc) {
					tt.nt = ct;
					tt = ct;
				}
				ti+=3;
			} else {
				ct.tc = stdin.charAt(ti+1);
				if (ht.tc == pt.tc) {
					ct.nt = ht;
					ht = ct;
				}
				ti+=2;
			}
			pt = ct;
		}

		while (ht != null) {
			ot += ht.tc;
			ht = ht.nt;
		}
		System.out.println(ot);
	}

	private static int parseCnt() {
		int		cnt = 0;
		String	str = null;

		if ((str = parseStdin()) != null) {
			cnt = Integer.parseInt(str);
		}

		return cnt;
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

class Train {
	char	tc = 0;
	Train	nt = null;
}