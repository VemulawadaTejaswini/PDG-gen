import java.util.*;

class Main{
	public static void main(String[] $){
		//入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), q = sc.nextInt();
		int[] a = new int[n-1], b = new int[n-1];
		int[] p = new int[q], x = new int[q];
		for(int i = 0; i < n-1; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			a[i]--;
			b[i]--;
		}
		for(int i = 0; i < q; i++){
			p[i] = sc.nextInt();
			x[i] = sc.nextInt();
			p[i]--;
		}
		sc.close();

		//処理
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		for(int i = 0; i < n-1; i++){
			map.computeIfAbsent(a[i], o -> new ArrayList<>()).add(b[i]);
			map.computeIfAbsent(b[i], o -> new ArrayList<>()).add(a[i]);
		}
		long[] counter = new long[n];
		for(int i = 0; i < n; i++) counter[i] = 0;
		for(int i = 0; i < q; i++) counter[p[i]] += x[i];
		
		long[] ans = new long[n];
		boolean[] used = new boolean[n];
		for(int i = 0; i < n; i++){
			ans[i] = 0;
			used[i] = false;
		}
		Deque<Integer> queue = new ArrayDeque<>();
		queue.addFirst(0);
		while(!queue.isEmpty()){
			int point = queue.getFirst();
			queue.removeFirst();
			used[point] = true;
			ans[point] += counter[point];
			ArrayList<Integer> t = map.get(point);
			if(t != null){
				for(int item : t){
					if(!used[item]){
						counter[item] += counter[point];
						queue.addFirst(item);
					}
				}
			}
		}

		//出力
		for(int i = 0; i < n; i++){
			System.out.print(ans[i]);
			if(i == n-1) System.out.println();
			else System.out.print(" ");
		}
	}
}
