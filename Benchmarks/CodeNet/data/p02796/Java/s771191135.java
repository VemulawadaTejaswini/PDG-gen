import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<C> list = new ArrayList<>();
		// x-l と x + l は判定上セーフ つまり、siとejが同じでもOK
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int l = sc.nextInt();
			list.add(new C(Math.max(0, x - l), x + l));
		}
		list.sort(new Comparator<C>() {
			@Override
			public int compare(C o1, C o2) {
				// TODO Auto-generated method stub
				return o1.e.compareTo(o2.e);
			}
		});

		int posXL = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			C c = list.get(i);
			if (posXL <= c.s) {
				sum++;
				posXL = c.e;
			}
		}
		System.out.println(sum);
	}

	public static class C {
		public Integer s;
		public Integer e;

		public C(int s, int e) {
			this.s = s;
			this.e = e;
		}
	}
}
