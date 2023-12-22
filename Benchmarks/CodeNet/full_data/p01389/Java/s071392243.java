import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] map = new int[h][w];
		int[][] cost = new int[h][w];
		
		for(int i=0;i<h;i++){
			char[] a = sc.next().toCharArray();
			for(int j=0;j<w;j++) map[i][j] = (int)a[j]-48;
			Arrays.fill(cost[i], Integer.MAX_VALUE);
		}
		
		ArrayDeque<Integer> x = new ArrayDeque<Integer>();
		ArrayDeque<Integer> y = new ArrayDeque<Integer>();
		x.offer(0);
		y.offer(0);
		cost[0][0] = 0;
		
		int p, q;
		while(x.size()!=0){
			p = x.poll();
			q = y.poll();
			if(p!=w-1 && cost[q][p]+map[q][p+1]<cost[q][p+1]){
				x.offer(p+1);
				y.offer(q);
				cost[q][p+1] = cost[q][p]+map[q][p+1];
			}
			if(q!=h-1 && cost[q][p]+map[q+1][p]<cost[q+1][p]){
				x.offer(p);
				y.offer(q+1);
				cost[q+1][p] = cost[q][p]+map[q+1][p];
			}
		}
		System.out.println(cost[h-1][w-1]);
	}	
}