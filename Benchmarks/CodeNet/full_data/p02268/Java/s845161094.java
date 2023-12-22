import java.io.*;
import java.util.*;

public class Main {
	public ArrayList<Integer> S;
	public ArrayList<Integer> T;
	public int n;
	public int q;
	public int count = 0;
	public static void main(String[] args) {
		Main m = new Main();
		m.init();
		for (int i = 0; i < m.q; ++i)
			m.biSearch(m.T.get(i));
		System.out.println(m.count);
	}
	public void init() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(reader.readLine());
			S = new ArrayList<>();
			StringTokenizer stS = new StringTokenizer(reader.readLine());
			while (stS.hasMoreTokens())
				S.add(Integer.parseInt(stS.nextToken()));
			q = Integer.parseInt(reader.readLine());
			T = new ArrayList<>();
			StringTokenizer stT = new StringTokenizer(reader.readLine());
			while (stT.hasMoreTokens())
				T.add(Integer.parseInt(stT.nextToken()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void biSearch(int x, int left, int right) {
		int index = (left + right) / 2;
		if (x == S.get(index)) {
			++count;
			return;
		}
		if (left > right)
			return;
		if (x <= S.get(index))
			biSearch(x, left, index - 1);
		if (S.get(index) <= x)
			biSearch(x, index + 1, right);
	}
	public void biSearch(int x) {
		biSearch(x, 0, S.size() - 1);
	}
}

