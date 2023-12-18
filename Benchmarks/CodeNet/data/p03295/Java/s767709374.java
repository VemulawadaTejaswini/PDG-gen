import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		List<int[]> path = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			int[] a = { Integer.parseInt(sc.next()), Integer.parseInt(sc.next()) };
			path.add(a);
		}
		Collections.sort(path, new PathComp());
		int cnt = 1;
		int tmp = path.get(0)[1];
		for (int i = 1; i < m; i++) {
			if (path.get(i)[0] >= tmp) {
				tmp = path.get(i)[1];
				cnt++;
			}
		}
		System.out.println(cnt);

	}

	static class PathComp implements Comparator<int[]> {
		@Override
		public int compare(int[] a, int[] b) {
			return a[1] > b[1] ? 1 : -1;
		}
	}

}
