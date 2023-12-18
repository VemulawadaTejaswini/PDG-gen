import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main main = new Main();
		main.exec();

	}

	private void exec() {
		int n;
		int m;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		List<List<Integer>> jobs = new ArrayList<>(m);
		for(int i = 0 ; i < m ; i++) {
			jobs.add(new ArrayList<>());
		}
		int a;
		int b;
		for(int i = 0 ; i < n ; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(m < a) {
				continue;
			}
			List<Integer> vList = jobs.get(m - a);
			if(vList == null) {
				vList = new ArrayList<>();
			}
			vList.add(b);
		}

		long value = 0;
		PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}

		});
		for(int i = m - 1 ; i >= 0 ; i--) {
			for(Integer v : jobs.get(i)) {
				q.add(v);
			}
			if(!q.isEmpty()) {
				value += q.poll();
			}
		}
		System.out.println(value);
		sc.close();
	}

}
