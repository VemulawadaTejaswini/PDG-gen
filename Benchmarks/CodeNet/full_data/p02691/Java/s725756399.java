import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		int[] W = new int[n + 1];
		TreeMap<Integer, List<Integer>> map = new TreeMap<>();
		for(int i = 0; i < n; i++) {
			int w = sc.nextInt();
			arr[i][0] = w;
			arr[i][1] = i + 1;
			W[i + 1] = w;
		}
		Arrays.sort(arr, (a,b) -> b[0] == a[0] ? a[1] - b[1] : b[0] - a[0]);
		for(int i = 0; i < n; i++) {
			map.putIfAbsent(arr[i][0], new ArrayList<>());
			map.get(arr[i][0]).add(arr[i][1]);
		}
		int res = 0;
		for(int i = n; i > 3; i--) {
			int max = i - 1 - W[i];
			int min = 1;
			if(max < min)
				continue;
			SortedMap<Integer, List<Integer>> tmp = map.subMap(min, true, max, true);
			if(tmp.isEmpty())
				continue;
			for(int weight : tmp.keySet()) {
				int tar = weight + W[i];
				for(int idx : tmp.get(weight)) {
			
					if(i - idx < tar)
						break;
					if( i - idx == tar) {
						res++;
						break;
					}
				}
			}
		}
		System.out.println(res);
    }
}