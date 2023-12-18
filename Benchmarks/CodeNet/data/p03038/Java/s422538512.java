import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		} 
		Collections.sort(a);
		List<Integer> b = new ArrayList<>();
		List<Integer> c = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			b.add(sc.nextInt());
			c.add(sc.nextInt());
		}
		List<Integer> csort = new ArrayList<>(c);
		Collections.sort(csort, Collections.reverseOrder());
		int index = 0;
		int numB = 0;
		int numA = 0;
		int count = 0;
		long ansnum = 0;
		for (int i = 0; i < m; i++) {
			numA = csort.get(i);
			index = c.indexOf(numA);
			c.set(index, 0);
			numB = b.get(index);
			for (int j = 0; j < numB; j++) {
				if (a.get(j + count) >= numA) {
					for (int k = 0; k < n; k++) {
						ansnum += a.get(k);
					}
					System.out.println(ansnum);
					return;
				}
				a.set(j + count, numA);
			}
			count += numB;
		}
		for (int k = 0; k < n; k++) {
			ansnum += a.get(k);
		}
		System.out.println(ansnum);
		return;
	}
}