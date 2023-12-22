import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		int r1 = sc.nextInt() - 1;
		int c1 = sc.nextInt() - 1;
		int r2 = sc.nextInt() - 1;
		int c2 = sc.nextInt() - 1;
		char[][] field = new char[h][];
		for (int i = 0; i < h; i++) {
		    field[i] = sc.next().toCharArray();
		}
		PriorityQueue<Path> queue = new PriorityQueue<>();
		queue.add(new Path(r1, c1, 4, 0, 0));
		int[][][] costs = new int[4][h][w];
		for (int[][] arr : costs) {
		    for (int[] arr2 : arr) {
		        Arrays.fill(arr2, Integer.MAX_VALUE);
		    }
		    arr[r1][c1] = 0;
		}
		while (queue.size() > 0) {
		    Path p = queue.poll();
		    if (p.row < 0 || p.row >= h || p.col < 0 || p.col >= w || field[p.row][p.col] == '@') {
		        continue;
		    }
		    if (p.direction != 4) {
		        if (costs[p.direction][p.row][p.col] <= p.value) {
		            continue;
		        }
		        costs[p.direction][p.row][p.col] = p.value;
		    }
		    p.count++;
		    if (p.direction == 0)  {
		        queue.add(new Path(p.row + 1, p.col, 0, p.value + p.count / k, p.count % k));
		    } else {
		        queue.add(new Path(p.row + 1, p.col, 0, p.value + 1, 1));
		    }
		    if (p.direction == 1)  {
		        queue.add(new Path(p.row - 1, p.col, 1, p.value + p.count / k, p.count % k));
		    } else {
		        queue.add(new Path(p.row - 1, p.col, 1, p.value + 1, 1));
		    }
		    if (p.direction == 2)  {
		        queue.add(new Path(p.row, p.col + 1, 2, p.value + p.count / k, p.count % k));
		    } else {
		        queue.add(new Path(p.row, p.col + 1, 2, p.value + 1, 1));
		    }
		    if (p.direction == 3)  {
		        queue.add(new Path(p.row, p.col - 1, 3, p.value + p.count / k, p.count % k));
		    } else {
		        queue.add(new Path(p.row, p.col - 1, 3, p.value + 1, 1));
		    }
		}
		int ans = Integer.MAX_VALUE;
		for (int[][] arr : costs) {
		    ans = Math.min(ans, arr[r2][c2]);
		}
		if (ans == Integer.MAX_VALUE) {
		    System.out.println(-1);
		} else {
		    System.out.println(ans);
		}
	}
	
	static class Path implements Comparable<Path> {
	    int row;
	    int col;
	    int direction;
	    int value;
	    int count;
	    
	    public Path(int row, int col, int direction, int value, int count) {
	        this.row = row;
	        this.col = col;
	        this.direction = direction;
	        this.value = value;
	        this.count = count;
	    }
	    
	    public int compareTo(Path another) {
	        return value - another.value;
	    }
	}
}
