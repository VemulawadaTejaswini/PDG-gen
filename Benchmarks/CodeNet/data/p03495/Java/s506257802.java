import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();

		int[] arr = new int[n];

		int distincts = 0;

		HashMap<Integer, Pair> map = new HashMap<>();
		ArrayList<Pair> li = new ArrayList<>();
		for(int i = 0; i < n; ++i) {
			arr[i] = in.nextInt();

			if(map.get(arr[i]) == null){
				map.put(arr[i], new Pair(arr[i], 1));
				li.add(map.get(arr[i]));
			} else {
				Pair p = map.get(arr[i]);
				p.s++;
			}
		}

		Collections.sort(li);
		if(li.size() <= k) {
			System.out.println(0);
		} else {
			int ans = 0;
			int nn = li.size();
			for(Pair p : li) {
				if(nn <= k) 
					break;

				--nn;
				ans += p.s;
			}

			System.out.println(ans);
		}
	}

	private static class Pair implements Comparable<Pair> {
		int f, s;

		public Pair(int f, int s) {
			this.f = f;
			this.s = s;
		}

		@Override 
		public int compareTo(Pair p) {
			return this.s - p.s;
		}
	}
}
