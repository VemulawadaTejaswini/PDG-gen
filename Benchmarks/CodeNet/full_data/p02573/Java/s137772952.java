import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	int n;
	int m;

	public void run() {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		List<Set<Integer>> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			Set<Integer> e = new TreeSet<>();
			e.add(i);
			list.add(e);
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			
			Set<Integer> tmp = list.get(a);
			tmp.addAll(list.get(b));
			list.set(a, tmp);
			list.set(b, tmp);
		}
		
		int max = 1;
		for (int i = 0; i < n; i++) {
			if( max < list.get(i).size() ) {
				max = list.get(i).size();
			}
		}
		System.out.println(max);

	}
}