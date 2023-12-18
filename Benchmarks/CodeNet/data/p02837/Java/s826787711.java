import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		
		ArrayList<int[]> t = new ArrayList[n];
		for (int i = 0; i < n; i++)
			t[i] = new ArrayList<>();

		for (int i = 0; i < n; i++)
			for (int j = 0; j < a[i]; j++) {
				int x = in.nextInt() - 1;
				int y = in.nextInt();
				t[i].add(new int[]{x, y});
			}

		int max = 0;
		for (int i = 0; i < (1 << n); i++) {
			boolean valid = true;
			for (int j = 0; j < n; j++) {
				boolean p = ((1 << j) & i) > 0;
				for (int[] tt : t[j]) {
					boolean x = ((1 << tt[0]) & i) > 0;
					if (p && x && tt[1] == 0)
						valid = false;
					if (p && !x && tt[1] == 1)
						valid = false;
				}
			}
			if (valid)
				max = Math.max(max, Integer.bitCount(i));
		}

		System.out.println(max);
	}
}
