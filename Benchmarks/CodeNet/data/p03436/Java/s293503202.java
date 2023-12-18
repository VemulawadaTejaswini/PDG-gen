import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] field = new char[h][];
		int blackCount = 0;
		int[][] costs = new int[h][w];
		for (int i = 0; i < h; i++) {
		    field[i] = sc.next().toCharArray();
		    Arrays.fill(costs[i], Integer.MAX_VALUE);
		    for (int j = 0; j < w; j++) {
		        if (field[i][j] == '#') {
		            blackCount++;
		        }
		    }
		}
		PriorityQueue<Path> queue = new PriorityQueue<>();
		queue.add(new Path(0, 0, 0));
		while (queue.size() > 0) {
		    Path p = queue.poll();
		    if (costs[p.h][p.w] <= p.value) {
		        continue;
		    }
		    costs[p.h][p.w] = p.value;
		    if (p.h > 0 && field[p.h - 1][p.w] != '#') {
		        queue.add(new Path(p.h - 1, p.w, p.value + 1));
		    }
		    if (p.h < h - 1 && field[p.h + 1][p.w] != '#') {
		        queue.add(new Path(p.h + 1, p.w, p.value + 1));
		    }
		    if (p.w > 0 && field[p.h][p.w - 1] != '#') {
		        queue.add(new Path(p.h, p.w - 1, p.value + 1));
		    }
		    if (p.w < w - 1 && field[p.h][p.w + 1] != '#') {
		        queue.add(new Path(p.h, p.w + 1, p.value + 1));
		    }
		}
		if (costs[h - 1][w - 1] == Integer.MAX_VALUE) {
		    System.out.println(-1);
		} else {
		    System.out.println(h * w - blackCount - costs[h - 1][w - 1] - 1);
		}
    }
    
    static class Path implements Comparable<Path> {
        int h;
        int w;
        int value;
        
        public Path(int h, int w, int value) {
            this.h = h;
            this.w = w;
            this.value = value;
        }
        
        public int compareTo(Path another) {
            return value - another.value;
        }
    }
}

