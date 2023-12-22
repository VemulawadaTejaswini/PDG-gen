import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
 
public class Main {
	private	static	BufferedReader	br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	sc = parseNum();

		if (sc > 0) {
			int			ec = 0;
			Suspect[]	sp = new Suspect[sc];
			Cmp			cp = new Cmp();

			for (int i = 0; i < sc; i++) {
				sp[i] = new Suspect(i+1, sc);
			}

			ec = parseNum();
			while (ec-- > 0) {
				int[]	od = parseOrder();

				sp[od[1]].p.add(od[0]);
			}

			for (int i = 0; i < sp.length; i++) {
				calcWeight(i, sp);
			}

			Arrays.sort(sp, cp);

			for (int i = 0; i < sp.length; i++) {
				System.out.println(sp[i].n);
			}
		}
	}

	private static void calcWeight(int i, Suspect[] sp) {
		int	sz = sp[i].p.size();

		for (int j = 0; j < sz; j++) {
			int	p = sp[i].p.get(j);

			if (!sp[p].f) {
				calcWeight(p, sp);
			}

			int	ln = sp[p].p.size();
			for (int k = 0; k < ln; k++) {
				int	q = sp[p].p.get(k);
				if (!sp[i].p.contains((Integer)q)) {
					sp[i].p.add(q);
				}
			}
		}

		sp[i].f = true;
	}

	private static int[] parseOrder() {
		int[]	params = null;
		String	stdin  = null;

		if ((stdin = parseStdin()) != null) {
			if (!stdin.equals("0 0")) {
				String[]	lines = stdin.split(" ");

				params    = new int[2]; 
				params[0] = Integer.parseInt(lines[0])-1;
				params[1] = Integer.parseInt(lines[1])-1;
			}
		}

		return params;
	}

	private static int parseNum() {
		int		num = 0;
		String	str = null;

		if ((str = parseStdin()) != null) {
			num = Integer.parseInt(str);
		}

		return num;
	}

	private static String parseStdin() {
		String  stdin = null;

		try {
			String  tmp = br.readLine();
			if (!tmp.isEmpty()) stdin = tmp;
		}
		catch (IOException e) {}

		return stdin;
	}
}

class Suspect {
	boolean				f = false;
	int					n = 0;
	ArrayList<Integer>	p = null;

	Suspect (int num, int cnt) {
		n = num;
		p = new ArrayList<Integer>();
	}
}

class Cmp implements Comparator<Suspect> {
	public int compare(Suspect sus1, Suspect sus2) {
		int	res = sus1.p.size() - sus2.p.size();

		return (res == 0) ? sus1.n - sus2.n : res;
	}
}