import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Sushi> sushi = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			sushi.add(new Sushi(sc.nextInt(), sc.nextInt()));
		}
		Collections.sort(sushi, new SushiComparator());
		Set<Integer> kind = new TreeSet<>();
		List<Long> zatsu = new ArrayList<>();
		long dsum = 0;
		for (int i = 1; i <= k; i++) {
			dsum += sushi.get(n - i).oisi;
			if (kind.contains(sushi.get(n - i).kind)) {
				zatsu.add((long) sushi.get(n - i).oisi);
			}
			kind.add(sushi.get(n - i).kind);
		}
		long[] sum = new long[k + 1];
		int fir = kind.size();
		sum[fir] = dsum;
		long ans = dsum + (long) kind.size() * kind.size();
		int j = n - k - 1;
		for (int i = fir; i < k; i++) {
			for (; j >= 0; j--) {
				if (!kind.contains(sushi.get(j).kind)) {
					kind.add(sushi.get(j).kind);
					sum[i + 1] = sum[i] - zatsu.get(zatsu.size() - 1) + sushi.get(j).oisi;
					zatsu.remove(zatsu.size() - 1);
					break;
				}
			}
			ans = Math.max(sum[i + 1] + (long) kind.size() * kind.size(), ans);
		}
		System.out.println(ans);
	}
}

class Sushi {
	public int oisi;
	public int kind;
	public Sushi(int kind, int oisi) {
		this.oisi = oisi;
		this.kind = kind;
	}
}

class SushiComparator implements Comparator<Sushi> {
	@Override
	public int compare(Sushi s1, Sushi s2) {
		return s1.oisi - s2.oisi;
	}
}