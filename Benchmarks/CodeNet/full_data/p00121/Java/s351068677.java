import java.util.*;

public class Main  {

	public static int[] getSwap (int p) {

		switch (p) {
			case 0 : return new int[]{1,4};
			case 1 : return new int[]{0,2,5};
			case 2 : return new int[]{1,3,6};
			case 3 : return new int[]{2,7};
			case 4 : return new int[]{0,5};
			case 5 : return new int[]{1,4,6};
			case 6 : return new int[]{2,5,7};
			case 7 : return new int[]{3,6};
		}

		return null;

	}
	public static char[] copyOf (char[] c) {
		char[] ret = new char[c.length];
		for (int i = 0; i < c.length; i++)
			ret[i] = c[i];
		return ret;
	}


	public static int bfs (char[] c) {

		char[] ans = {'0','1','2','3','4','5','6','7'};
		Queue<Integer> point0 = new LinkedList<Integer>();
		Queue<Integer> steps = new LinkedList<Integer>();
		Queue<char[]> queueC = new LinkedList<char[]>();
		Queue<char[]> used = new LinkedList<char[]>();

		int index = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '0') {
				index = i;
				break;
			}
		}

		queueC.add(c);
		point0.add(index);
		steps.add(0);

		while (!queueC.isEmpty()) {

			char[] board = queueC.poll();
			int step = steps.poll();

			if (Arrays.equals(board, ans)) return step;

//			System.out.println(Arrays.toString(board));

			used.add(board);
			int p = point0.poll();
			int[] swapList = getSwap(p);

			for (int i = 0; i < swapList.length; i++) {
				char[] temp = copyOf(board);
				temp[p] = temp[swapList[i]];
				temp[swapList[i]] = '0';

				boolean flag = true;
				for (char[] ch : used) {
					if (Arrays.equals(ch, temp)) {
						flag = false;
						break;
					}
				}
				if (flag) {
					queueC.add(temp);
					point0.add(swapList[i]);
					steps.add(step + 1);
				}

			}

		}

		return 0;
	}

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {

			String s = "";
			String[] str = sc.nextLine().split(" ");
			for (String t : str) s += t;
			System.out.println(bfs(s.toCharArray()));

		}

	}

}