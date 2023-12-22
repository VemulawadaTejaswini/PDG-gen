import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
	private	static	BufferedReader	br   = null;

	static {
		br    = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Piece	table = null;
		while((table = parsePiece()) != null) {
			table.solve(0, 0, 0, 0);
			table.result();
		}
	}

	private static Piece parsePiece() {
		Piece	table = null;
		String	strIn = null;

		if ((strIn = parseStdin()) != null) {
			ArrayList<Integer>	piece = new ArrayList<Integer>();

			for(char c : strIn.toCharArray()) {
				piece.add(c - '0');
			}
			Collections.sort(piece);

			table = new Piece();
			table.init(piece);
		}

		return table;
	}

	private static String parseStdin() {
		String	strNum = null;

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					strNum = line;
				}
			}
		}
		catch (IOException e) {}

		return strNum;
	}
}

class Piece {
	private	static	ArrayList<Integer>	m_nums = null;
	private	static	ArrayList<Integer>	m_cnts = null;
	private	static	ArrayList<Integer>	m_slvs = null;

	static {
		m_nums = new ArrayList<Integer>();
		m_cnts = new ArrayList<Integer>();
		m_slvs = new ArrayList<Integer>();
	}

	public void init(ArrayList<Integer> piece) {
		m_nums.clear();
		m_cnts.clear();
		m_slvs.clear();

		if (piece != null) {
			Object po = new Integer(0);

			for(Object co : piece.toArray()) {
				if (po != co) {
					m_nums.add((Integer)co);
					m_cnts.add(1);
				}
				else {
					int		n = m_cnts.size() - 1;
					Integer i = m_cnts.get(n);
					m_cnts.set(n, i + 1);
				}
				po = co;
			}
		}
	}

	public int getCount(Integer o) {
		int	cnt = 0;
		int	i   = m_nums.indexOf(o);

		if (o < 1 || 9 < o) {
			cnt = -1;
		} else if (i != -1) {
			cnt = m_cnts.get(i);
		}

		return cnt;
	}

	public boolean solve(int n, int a, int s, int t) {
		boolean bFin = false;

		if (a + s + t == 4) {
			int		len = m_nums.size();
			Integer	o1  = null;
			Integer	o2  = null;
			boolean	b1  = true;
			boolean	b2  = true;

			switch (len) {
			case 1:	// 暗子または対子
				o1 = m_nums.get(0);
				b1 = m_slvs.contains(o1);
				break;
			case 2:	// 順子
				o1 = m_nums.get(0);
				o2 = m_nums.get(1);

				if (o1 + 1 == o2) {			// 両面待ちまたは辺張待ち
					b1 = (o1 == 1) || m_slvs.contains(o1 - 1);
					o1 = o1 - 1;
					b2 = (o2 == 9) || m_slvs.contains(o2 + 1);
					o2 = o2 + 1;
				}
				else if (o1 + 2 == o2) {	// 嵌張待ち
					b1 = m_slvs.contains(o1 + 1);
					o1 = o1 + 1;
				}
				break;
			}

			if (!b1) {
				m_slvs.add(o1);
			}

			if (!b2) {
				m_slvs.add(o2);
			}
		}
		else {
			for (; n < m_nums.size() && !bFin; n++) {
				Integer o = m_nums.get(n);
				if (isAnko(o)) {
					Integer	c = getCount(o);
					if (c == 3) {
						m_nums.remove(n);
						m_cnts.remove(n);
					}
					else {
						m_cnts.set(n, c - 3);
					}

					bFin = solve(n, a + 1, s, t);

					if (c == 3) {
						m_nums.add(n, o);
						m_cnts.add(n, 3);
					}
					else {
						m_cnts.set(n, c);
					}
				}
	
				if (isShuntsu(o)) {
					Integer[]	c = { getCount(o), getCount(o + 1), getCount(o + 2) };
					for (int m = 2; m >= 0; m--) {
						if (c[m] == 1) {
							m_nums.remove(n + m);
							m_cnts.remove(n + m);
						}
						else {
							m_cnts.set(n + m, c[m] - 1);
						}
					}

					bFin = solve(n, a, s + 1, t);

					for (int m = 0; m < 3; m++) {
						if (c[m] == 1) {
							m_nums.add(n + m, o + m);
							m_cnts.add(n + m, 1);
						}
						else {
							m_cnts.set(n + m, c[m]);
						}
					}
				}
				
				if (isToitsu(o) && t == 0) {
					Integer	c = getCount(o);
					if (c == 2) {
						m_nums.remove(n);
						m_cnts.remove(n);
					}
					else {
						m_cnts.set(n, c - 2);
					}

					bFin = solve(n, a, s, t + 1);

					if (c == 2) {
						m_nums.add(n, o);
						m_cnts.add(n, 2);
					}
					else {
						m_cnts.set(n, c);
					}
				}
			}
		}

		return bFin;
	}

	public void result() {
		boolean bInit = false;

		if (m_slvs.size() == 0) {
			System.out.println(0);
		}
		else {
			Collections.sort(m_slvs);
			for(Object o : m_slvs.toArray()) {
				Integer i = (Integer)o;
	
				if (getCount(i) != 4) {
					if (bInit) {
						System.out.print(" ");
					}
					System.out.print(i);
					bInit = true;
				}
			}
			System.out.println("");
		}
	}

	private boolean isAnko(Integer o) {
		return (getCount(o) >= 3);
	}

	private boolean isShuntsu(Integer o) {
		return (getCount(o) >= 1 && getCount(o + 1) >= 1 && getCount(o + 2) >= 1);
	}

	private boolean isToitsu(Integer o) {
		return (getCount(o) >= 2);
	}
}