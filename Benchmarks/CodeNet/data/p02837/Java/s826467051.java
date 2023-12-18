import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashMap<Integer, ArrayList<Integer>> m1 = new HashMap<>();
		HashMap<Integer, ArrayList<Integer>> m2 = new HashMap<>();
		for(int i = 0; i < N; i++) {
			int A = sc.nextInt();
			m1.put(i, new ArrayList<>());
			m2.put(i, new ArrayList<>());
			for(int j = 0; j < A; j++) {
				int x = sc.nextInt()-1;
				int y = sc.nextInt();
				if(y == 1)
					m1.get(i).add(x);
				else
					m2.get(i).add(x);
			}
		}
		int ans = 0;
		boolean[] x = new boolean[N];
		for(int i = 0; i < 1<<N; i++) {
			boolean ok = true;
			int num = 0;
			for(int j = 0; j < N; j++) {
				if ((1 & i >> j) == 1) { 
					x[j] = true;
					num++;
				}
				else
					x[j] = false;
			}
			LOOP:for(int j = 0; j < N; j++) {
				if(!x[j])
					continue;
				for(int k : m1.get(j)) {
					if(!x[k]) {
						ok = false;
						break LOOP;
					}
				}
				for(int k : m2.get(j)) {
					if(x[k]) {
						ok = false;
						break LOOP;
					}
				}

			}
			if(ok)
				ans = Math.max(ans, num);
		}
		
		System.out.println(ans);

	}

}