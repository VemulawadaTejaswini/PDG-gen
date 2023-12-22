import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] nexts = new int[n];
		for (int i = 0; i < n; i++) {
		    nexts[i] = sc.nextInt() - 1;
		}
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		HashSet<Integer> used = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<>();
		long max = Long.MIN_VALUE;
		for (int i = 0; i < n; i++) {
		    if (used.contains(i)) {
		        continue;
		    }
		    int idx = i;
		    long total = 0;
		    while (!used.contains(idx)) {
		        used.add(idx);
		        list.add(idx);
		        total += arr[idx];
		        idx = nexts[idx];
		    }
		    int length = list.size();
		    for (int j = 0; j < length; j++) {
		        long sum = 0;
		        for (int l = 0; l <= length && l < k; l++) {
		            sum += arr[list.get((j + l) % length)];
		            max = Math.max(max, sum + Math.max(0, total * ((k - l - 1) / length)));
		        }
		    }
		    list.clear();
		}
		System.out.println(max);
	}
}
