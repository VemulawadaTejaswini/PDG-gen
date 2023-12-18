import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] a = new int[n][n - 1];

		List<String> list = new ArrayList<String>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				a[i][j] = sc.nextInt();
			}
			list.add(new Integer(i).toString());
		}

		int finish = 0;
		int[] matchNo = new int[n];

		int result = 0;
		int cnt = 0;

		while (true) {
			boolean[] isDone = new boolean[n];
			boolean hasTodayMatch = false;

			List<String> re = new ArrayList<String>();

			Iterator ite = list.iterator();
			while(ite.hasNext()) {
				int i = new Integer((String)ite.next()).intValue();
				if (!isDone[i] && matchNo[i] != n - 1) {
					int vs = a[i][matchNo[i]] - 1;
					if (!isDone[vs] && matchNo[vs] != n - 1) {
						int vsvs = a[vs][matchNo[vs]] - 1;
						if (vsvs == i) {
							matchNo[i]++;
							matchNo[vs]++;
							isDone[i] = true;
							isDone[vs] = true;
							if (matchNo[i] == n - 1) {
								finish++;
								re.add(new Integer(i).toString());
							}
							if (matchNo[vs] == n - 1) {
								finish++;
								re.add(new Integer(vs).toString());
							}
							hasTodayMatch = true;
						}
					}

				}
				cnt++;
			}
			result++;
			if (!hasTodayMatch) {
				result = -1;
				break;
			}
			if (finish == n) {
				break;
			}
			if (re.size() != 0) {
				Iterator ite2 = re.iterator();
				while (ite2.hasNext()) {
					list.remove(new Integer((String)ite2.next()).intValue());
				}
			}
		}

		System.out.println(result);
		System.out.println(cnt);
	}

}