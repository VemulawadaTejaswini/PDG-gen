import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	private static final Integer Z = Integer.valueOf(0);

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m, n;
		NavigableSet<Integer> _1 = new TreeSet<Integer>();
		NavigableSet<Integer> _2 = new TreeSet<Integer>();
		NavigableSet<Integer> _3 = new TreeSet<Integer>();
		NavigableSet<Integer> _4 = new TreeSet<Integer>();
		List<Set<Integer>> a = new ArrayList<Set<Integer>>();
		a.add(Collections.<Integer> singleton(Z));
		a.add(_1);
		a.add(_2);
		a.add(_3);
		a.add(_4);
		while ((n = in.nextInt()) > 0 && ((m = in.nextInt()) > 0)) {
			final Integer m_I = Integer.valueOf(m);
			int point = 0;
			_1.clear();
			_1.add(Z);
			_2.clear();
			_2.add(Z);
			_3.clear();
			_3.add(Z);
			_4.clear();

			while (n-- > 0) {
				int sc = in.nextInt();
				for (int i = 0; i < 4; i++) {
					point = Math
							.max(point, up(a.get(i), a.get(i + 1), m_I, sc));

				}
			}
			System.out.println(point);
		}
	}

	private static int up(Set<Integer> _1, Set<Integer> _2, Integer m_I, int sc) {
		if (m_I.intValue() == sc)
			return sc;
		for (Integer pt : _1) {
			int ipt = pt.intValue();
			ipt += sc;
			if (ipt > m_I.intValue())
				break;
			_2.add(Integer.valueOf(ipt));
		}
		final int floor = ((NavigableSet<Integer>) _2).floor(m_I).intValue();
		return floor;
	}
}