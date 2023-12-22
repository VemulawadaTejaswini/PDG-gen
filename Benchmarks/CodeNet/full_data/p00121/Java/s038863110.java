import java.util.*;

public class Main {

	static int[] getSwapList (int p) {
		switch (p) {
			case 0 : return new int[]{1,4};
			case 1 : return new int[]{0,2,5};
			case 2 : return new int[]{1,3,6};
			case 3 : return new int[]{2,7};
			case 4 : return new int[]{0,5};
			case 5 : return new int[]{1,4,6};
			case 6 : return new int[]{2,5,7};
			case 7 : return new int[]{3,6};
			default : return null;
		}
	}

	public static char[] copyOf (char[] c) {
		char[] ret = new char[c.length];
		for (int i = 0; i < c.length; i++)
			ret[i] = c[i];
		return ret;
	}

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		int step = 1;
		char[] g = new char[]{'0','1','2','3','4','5','6','7'};
		ArrayList<char[]> list = new ArrayList<char[]>();
		HashMap<String,Integer> memo = new HashMap<String,Integer>();
		list.add(g);
		memo.put(new String(g), 0);

		while (!list.isEmpty()) {
			ArrayList<char[]> next = new ArrayList<char[]>();
			for (char[] c : list) {
				int p = new String(c).indexOf("0");
				int[] swaps = getSwapList(p);
				for (int i = 0; i < swaps.length; i++) {
					char[] temp = copyOf(c);
					temp[p] = temp[swaps[i]];
					temp[swaps[i]] = '0';
					if (!memo.containsKey(new String(temp))) {
						memo.put(new String(temp), step);
						next.add(temp);
					}
				}
			}

			list = next;
			step++;
		}

		while (sc.hasNext()) {
			String[] str = sc.nextLine().split(" ");
			String s = "";
			for (String st : str)
				s += st;
			System.out.println(memo.get(s));
		}

	}

}