import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();

		int m = sc.nextInt();
		int l[] = new int[m];
		int r[] = new int[m];
		int d[] = new int[m];

		Map<Integer, List<E>> map = new HashMap<Integer, List<E>>();

		for (int i = 0; i < m; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
			d[i] = sc.nextInt();

			E e = new E(l[i], r[i], d[i]);
			List<E> leftList = map.containsKey(l[i]) ? map.get(l[i]) : new LinkedList<E>();
			// List<E> leftList = leftMap.getOrDefault(l[i], new
			// LinkedList<E>());
			leftList.add(e);
			map.put(l[i], leftList);

			List<E> rightList = map.containsKey(r[i]) ? map.get(r[i]) : new LinkedList<E>();
			rightList.add(e);
			map.put(r[i], rightList);
		}

		int[] line = new int[n + 1];
		boolean[] visited = new boolean[n + 1];
		{
			List<E> init = new LinkedList<E>();
			E e = new E(0, 1, 0);
			init.add(e);
			map.put(0, init);
			visited[0] = true;
		}

		for (int i = 1; i < n + 1; i++) {
			if (!map.containsKey(i)) {
				visited[i] = true;
				continue;
			}

			List<E> list = map.get(i);
			for (E e : list) {
				int targetId ;
				int targetPos ;
				if(e.l == i){
					targetId = e.r;
					targetPos = line[i]+e.d;					
				}else{
					targetId = e.l;
					targetPos = line[i]-e.d;										
				}

				if(visited[targetId]){
					if(targetPos != line[targetId]){
						System.out.println("No");
						return;
					}
				}
				visited[targetId] = true;
				line[targetId] = targetPos;
				
			}
			visited[i] = true;
		}
		System.out.println("Yes");

	}

	class E {
		int l;
		int r;
		int d;

		E(int l, int r, int d) {
			this.l = l;
			this.r = r;
			this.d = d;
		}
	}

}
