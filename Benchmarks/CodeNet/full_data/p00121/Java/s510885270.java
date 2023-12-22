import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;
 
public class Main {
	private	static			BufferedReader	br  = null;
	private	static	final	String			INI = "01234567";
	private	static	final	int[]			SV = { 1, -1, 0, 0  };
	private	static	final	int[]			SH = { 0, 0,  1, -1 };

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StepTbl	stp = new StepTbl();
		String	arr = null;

		swap(stp);

		while ((arr = parseArray()) != null) {
			System.out.println(stp.get(arr));
		}
	}

	private static void swap(StepTbl tbl) {
		// 0 1 2 3
		// 4 5 6 7
		Queue	que = new Queue();
		Stat	fst = new Stat();
		int		cnt = 0;

		tbl.put(INI, cnt);
		fst.stt = INI;
		fst.stp = 0;
		que.add(fst);

		while (que.size() > 0) {
			Stat	cst = que.pollFirst();
			int		cp  = cst.stt.indexOf("0");
			int		cy = cp / 4;
			int		cx = cp % 4;

			for (int l = 0; l < 4; l++) {
				int		ny = cy + SV[l];
				int		nx = cx + SH[l];

				if (0 <= nx && nx < 4 && 0 <= ny && ny < 2) {
					boolean	fin = false;
					Stat	nst = new Stat();
					char[]	na  = cst.stt.toCharArray();
					char	sc  = na[ny*4+nx];

					na[ny*4+nx] = na[cy*4+cx];
					na[cy*4+cx] = sc;

					nst.stt = String.valueOf(na);
					nst.stp = cst.stp+1;

					if (tbl.containsKey(nst.stt)) {
						if (nst.stp >= tbl.get(nst.stt)) {
							fin = true;
						}
					}

					if (!fin) {
						tbl.put(nst.stt, nst.stp);
						que.add(nst);
					}
				}			
			}
		}
	}

	private static String parseArray() {
		String  arr = null;

		if ((arr = parseStdin()) != null) {
			arr = arr.replaceAll(" ", "");
		}

		return arr;
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

class Stat {
	String	stt = null;
	Integer	stp = 0;
}

class Queue extends ArrayDeque<Stat> {
}

class StepTbl extends HashMap<String, Integer> {
}