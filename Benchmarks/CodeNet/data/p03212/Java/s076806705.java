import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		sc.close();

		long cnt = 0;
		Set<Integer> compare = new TreeSet<Integer>(Arrays.asList(3, 5, 7));

		for (long i = 357; i <= N; i += 2) {
			long v = i;
			Set<Integer> set = new TreeSet<Integer>();
			boolean isNg = false;

			while (v != 0) {
				int r = (int) (v % 10);
				if (r == 3 || r == 5 || r == 7) {
					set.add(r);
					v /= 10;
				} else {
					isNg = true;
					break;
				}
			}
			if (isNg) {
				continue;
			}

			if (set.equals(compare)) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}