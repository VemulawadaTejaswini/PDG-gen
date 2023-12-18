import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    if (map.containsKey(x)) {
		        map.put(x, map.get(x) + 1);
		    } else {
		        map.put(x, 1);
		    }
		}
		int[] arr = new int[map.size()];
		int idx = 0;
		for (int x : map.values()) {
		    arr[idx] = x;
		    idx++;
		}
		Arrays.sort(arr);
		int total = 0;
		for (int i = 0; i < arr.length - k; i++) {
		    total += arr[i];
		}
       System.out.println(total);
	}
}
