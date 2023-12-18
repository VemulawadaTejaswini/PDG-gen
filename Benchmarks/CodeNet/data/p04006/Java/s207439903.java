import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long x = sc.nextLong();
		long[] a = new long[N];
		LinkedList<Boolean> flag = new LinkedList<>();
		for (int i=0; i<N; i++) {
			a[i] = sc.nextLong();
			flag.add(false);
		}
		long res = 0;
		while (true) {
			for (int i=0; i<a.length; i++) {
				if (flag.get(i) || a[i]>=x) continue;
				res += a[i];
				flag.set(i, true);
			}
			if (satisfied(flag)) break;
			flag.offer(flag.poll());
			res += x;
		}
		System.out.println(res);
		sc.close();
	}
	
	private static boolean satisfied(List<Boolean> flag) {
		for (int i=0; i<flag.size(); i++) {
			if (!flag.get(i)) return false;
		}
		return true;
	}
}
