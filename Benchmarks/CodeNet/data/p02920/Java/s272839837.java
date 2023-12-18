import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		int N = (int)Math.pow(2, n);
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		if(arr[N-1] == arr[N-2]) {
			System.out.println("No");
			return;
		}
		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.add(-n);
		ArrayList<Integer> newpairs = new ArrayList<Integer>();
		int last = arr[N-2];
		for(int i = N-2; i >= 0; i--) {
			if(arr[i] != last) {
				q.addAll(newpairs);
				newpairs = new ArrayList<Integer>();
			}
			if(q.isEmpty()) {
				System.out.println("No");
				return;
			}
			int c = -q.poll();
			if(c > 1) {
				newpairs.add(-(c-1));
			}
			c--;
			if(c > 0) {
				q.add(-c);
			}
			
			last = arr[i];
		}
		System.out.println("Yes");
	}
	static class Pair implements Comparable<Pair>{
		int pos, count;
		public Pair(int pos, int count) {
			this.pos = pos; this.count = count;
		}
		public String toString() {
			return pos+", "+count;
		}
		@Override
		public int compareTo(Pair p) {
			return p.count - count;
		}
	}

}
