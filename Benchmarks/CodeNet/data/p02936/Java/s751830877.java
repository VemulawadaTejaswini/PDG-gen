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
		}
		long[] counter = new long[n];
		for(int i = 0; i < n; i++) counter[i] = 0;
		for(int i = 0; i < q; i++) counter[p[i]] += x[i];

		for(int i = 0; i < n; i++){
			ArrayList<Integer> t = map.get(i);
			if(t != null){
				for(int item : t){
					counter[item] += counter[i];
				}
			}
		}

		//出力
		for(int i = 0; i < n; i++){
			System.out.print(counter[i]);
			if(i == n-1) System.out.println();
			else System.out.print(" ");
		}
	}
}
