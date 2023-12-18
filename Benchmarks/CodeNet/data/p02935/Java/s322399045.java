import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		List<Double> v = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			v.add(sc.nextDouble());
		}
		v.sort(null);
		while (v.size() > 1) {
			double vv = (v.remove(0) + v.remove(0)) / 2;
			int idx = Collections.binarySearch(v, vv);
			if (idx >= 0) {
				v.add(idx, vv);
			}
			else if (idx == -1) {
				v.add(vv);
			}
			else {
				if (-idx < v.size()) {
					v.add(-idx, vv);
				}
				else {
					v.add(vv);
				}
			}
		}
		System.out.println(v.get(0));
	}
}