import java.util.*;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();
		List<Tri> list = new ArrayList<>();
		for (int i = 0;i < m;i++) {
			list.add(new Tri(sc.nextInt(),sc.nextInt(),sc.nextInt()));
		}
		Collections.sort(list);

		int[] ar = new int[110];
		for (int i = 0;i < 110;i++) ar[i] = i;

		for (int i = 0;i < list.size();i++) {
			Tri t = list.get(i);
			int p = t.p;
			int q = t.q;
			int tmp = ar[p];
			ar[p] = ar[q];
			ar[q] = tmp;
		}

		for (int i = 0;i < 110;i++) {
			if (ar[i]==a) System.out.println(i);
		}
	}
}

class Tri implements Comparable<Tri> {
	public int h;
	public int p;
	public int q;

	public Tri(int h,int p,int q) {
		this.h = h;
		this.p = p;
		this.q = q;
	}

	@Override
	public int compareTo(Tri tri) {
		return tri.h - this.h;
	}
}