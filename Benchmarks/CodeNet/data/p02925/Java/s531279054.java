import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner io = new Scanner(System.in);
		int i, j, k;
		
		Comparator<int[]> com = new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int[] b) {
				for (int i = a.length - 1; i >= 0; --i) if (a[i] != b[i]) 
					return Integer.compare(a[i], b[i]);
				return 0;
			}
		};
		
	
		int N = io.nextInt();
		TreeSet<int[]>[] graph = new TreeSet[N];
		for (i = 0; i < N; ++i) graph[i] = new TreeSet<>(com);
		
		for (i = 0; i < N; ++i) for (j = 0; j < N - 1; ++j) {
			int[] edge = new int[] {i, io.nextInt() - 1, j};
			graph[i].add(edge);
		}
		
		int match = 0;
		HashSet<Integer> exc = new HashSet<>();
		for (i = 0; ; ++i) {
			exc.clear();
			boolean ok = false;
			
			for (j = 0; j < N; ++j) if (!graph[j].isEmpty() && !exc.contains(j)) {
				int oth = graph[j].first() [1];
				if (!exc.contains(oth) && graph[oth].first() [1] == j) {
					ok = true;
					graph[j].pollFirst();
					graph[oth].pollFirst();
					exc.add(j); exc.add(oth);
					++match;
					
					//System.err.print("PPP: " + j + " " + oth + "   ");
				}
			}
			
			if (!ok) {
				if (match == N * (N - 1) >> 1) {
					System.out.println(i);
				} else {
					System.out.println(-1);
				}
				return;
			}
			System.err.println();
		}
 	}
}