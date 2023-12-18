import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		TreeMap<Integer, TreeSet<Integer>> map = new TreeMap<>();
		for(int i = 1; i <= n; i++) {
			int w = sc.nextInt();
			arr[i] = w;
			map.putIfAbsent(w, new TreeSet<>());
			map.get(w).add(i);
		}
		int res = 0;
		for(int i = n; i > 3; i--) {
			int max = i - 1 - arr[i];
			int min = 1;
			if(max < min)
				continue;
			SortedMap<Integer, TreeSet<Integer>> tmp = map.subMap(min, true, max, true);
			if(tmp.isEmpty())
				continue;
			for(int weight : tmp.keySet()) {
				int tar = weight + arr[i];
				for(int idx : tmp.get(weight)) {
					if( i - idx == tar)
						res++;
					else if(i - idx < tar)
						break;
				}
			}
		}
		System.out.println(res);
    }
}