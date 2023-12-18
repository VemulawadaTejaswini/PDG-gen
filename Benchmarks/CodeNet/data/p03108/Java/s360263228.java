import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	private class Way {
		public int a = 0;
		public int b = 0;
		
		public Way(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}
	
	private LinkedList<HashSet<Integer>> setList = new LinkedList<HashSet<Integer>>();
	
	private long countResult() {
		long[] listsSize = new long[setList.size()];
		int i = 0;
		for (HashSet<Integer> set : setList) {
			listsSize[i] = set.size();
			i++;
		}
		
		long count = 0;
		for (i=0; i<listsSize.length; i++) {
			for (int j=i+1; j<listsSize.length; j++) {
				count += listsSize[i] * listsSize[j];
			}
		}
		
		return count;
	}
	
	public void solve() {
		Scanner in = new Scanner(System.in);
		long N = in.nextInt();
		int M = in.nextInt();
		
		for (int i=0; i<N; i++) {
			HashSet<Integer> island = new HashSet<Integer>();
			island.add(i+1);
			setList.add(island);
		}
		
		LinkedList<Way> ways = new LinkedList<Main.Way>();
		for (int i=0; i<M; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			ways.addFirst(new Way(a, b));
		}
		in.close();
		
		LinkedList<Long> results = new LinkedList<Long>();
		long nowResult = N * (N-1) / 2;
		results.addFirst(nowResult);
		for (Way way : ways) {
			ListIterator<HashSet<Integer>> it = setList.listIterator();
			HashSet<Integer> found = null;
			while (it.hasNext()) {
				boolean isCollect = false;
				HashSet<Integer> set = it.next();
				if (set.contains(way.a)) {
					if (found == null) {
						found = set;
					} else {
						isCollect = true;
					}
				}
				if (set.contains(way.b)) {
					if (found == null) {
						found = set;
					} else {
						isCollect = true;
						
					}
				}
				
				if (isCollect) {
					nowResult -= (long)found.size() * set.size();
					found.addAll(set);
					if (found != set) {
						it.remove();
					}
					break;
				}
			}
			results.addFirst(nowResult);
		}
		
		results.removeFirst();
		for (Long result : results) {
			System.out.println(Math.max(result, 0));
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
}
