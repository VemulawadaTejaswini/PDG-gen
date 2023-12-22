import java.util.*;

public class Main {
	public static void main(String[]  args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		List<List<Integer>> v = new ArrayList<>(n);
		int g_[] = new int[n];
		for (int i = 0; i < n; i ++) {
			v.add(new LinkedList<Integer>());
			g_[i] = -1;
		}
		
		for (int i = 0; i < m; i ++) {
			int s = scanner.nextInt();
			int t = scanner.nextInt();
			
			v.get(s).add(t);
			v.get(t).add(s);
		}
		
		Queue<Integer> queue = new ArrayDeque<>(n);
		
		for (int i = 0; i < n; i ++) {
			if(g_[i] != -1) continue;
			g_[i] = i;
			
			queue.add(i);
			while(!queue.isEmpty()) {
				int u = queue.remove();
				
				for (int j: v.get(u)) {
					if (g_[j] == -1) {
						g_[j] = i;
						queue.add(j);
					}
				}
			}
		}
		
		int q = scanner.nextInt();
		
		for (int i = 0; i < q; i ++) {
			if (g_[scanner.nextInt()] == g_[scanner.nextInt()]) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		
		scanner.close();
	}
} 

