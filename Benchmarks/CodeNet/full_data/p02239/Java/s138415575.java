import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	static int[][] matrix;
	static boolean[] visited;
	static int[] distance;
	static LinkedList<NumDis> queue;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			int index = sc.nextInt() - 1;
			int num = sc.nextInt();
			for (int j = 0; j < num; j++) {
				matrix[index][sc.nextInt() - 1] = 1;				
			}
		}
		
		visited = new boolean[n];
		distance = new int[n];
		for(int i = 0; i < n; i++) {
			distance[i] = -1;
		}
				
		queue = new LinkedList<NumDis>();
		queue.offer(new NumDis(0, 0));
		
		while(queue.size() > 0) {
			bfs();
		}
		
		for(int i = 0; i < n; i++) {
			System.out.printf("%1$d %2$d", i+1, distance[i]);
			System.out.println();
		}
	}
	
	public static void bfs() {
		NumDis current = queue.poll();
		int i = current.num;
		int d = current.dis;
		
		if (visited[i]) {
			return;
		}
		
		// to queue
		for(int j = 0; j < matrix[i].length; j++) {
			if (matrix[i][j] == 1) {
				queue.offer(new NumDis(j, d + 1));		
			}
		}
		
		// record
		distance[i] = d;
		visited[i] = true;
	}
	
	
}

class NumDis {
	int num;
	int dis;
	public NumDis(int num, int dis) {
		this.num = num;
		this.dis = dis;
	}
}