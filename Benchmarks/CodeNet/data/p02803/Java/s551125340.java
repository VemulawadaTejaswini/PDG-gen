import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] field = new char[h][];
		int sh = 0;
		int sw = 0;
		for (int i = 0; i < h; i++) {
		    field[i] = sc.next().toCharArray();
		    for (int j = 0; j < w; j++) {
		        if (field[i][j] == '.') {
		            sh = i;
		            sw = j;
		        }
		    }
		}
		PriorityQueue<Path> queue = new PriorityQueue<>();
		queue.add(new Path(sh, sw, 0));
		int[][] costs = new int[h][w];
		for (int[] arr : costs) {
		    Arrays.fill(arr, Integer.MAX_VALUE);
		}
		while (queue.size() > 0) {
		    Path p = queue.poll();
		    if (p.h < 0 || p.h >= h || p.w < 0 || p.w >= w || field[p.h][p.w] == '#' || costs[p.h][p.w] <= p.value) {
		        continue;
		    }
		    costs[p.h][p.w] = p.value;
		    queue.add(new Path(p.h - 1, p.w, p.value + 1));
		    queue.add(new Path(p.h, p.w - 1, p.value + 1));
		    queue.add(new Path(p.h + 1, p.w, p.value + 1));
		    queue.add(new Path(p.h, p.w + 1, p.value + 1));
		}
		int max = -1;
		for (int i = 0; i < h; i++) {
		    for (int j = 0; j < w; j++) {
		        if (field[i][j] == '.' && max < costs[i][j]) {
		            max = costs[i][j];
		            sh = i;
		            sw = j;
		        }
		    }
		}
		queue.add(new Path(sh, sw, 0));
		for (int[] arr : costs) {
		    Arrays.fill(arr, Integer.MAX_VALUE);
		}
		while (queue.size() > 0) {
		    Path p = queue.poll();
		    if (p.h < 0 || p.h >= h || p.w < 0 || p.w >= w || field[p.h][p.w] == '#' || costs[p.h][p.w] <= p.value) {
		        continue;
		    }
		    costs[p.h][p.w] = p.value;
		    queue.add(new Path(p.h - 1, p.w, p.value + 1));
		    queue.add(new Path(p.h, p.w - 1, p.value + 1));
		    queue.add(new Path(p.h + 1, p.w, p.value + 1));
		    queue.add(new Path(p.h, p.w + 1, p.value + 1));
		}
		max = -1;
		for (int i = 0; i < h; i++) {
		    for (int j = 0; j < w; j++) {
		        if (field[i][j] == '.' && max < costs[i][j]) {
		            max = costs[i][j];
		        }
		    }
		}
		System.out.println(max);
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
