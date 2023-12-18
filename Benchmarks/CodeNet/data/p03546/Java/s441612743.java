import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int W = in.nextInt();
		int[][] c = new int[10][10];
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				c[i][j] = in.nextInt();
			}
		}
		int INF = 100000;
		int[] cost = new int[10];
		Queue<int[]> que = new PriorityQueue<>((e1,e2)->e1[2]-e2[2]);
		for(int i=0;i<10;i++) {
			if(i==1) continue;
			cost[i] = INF;
			int[] tmp = {i,1,c[i][1]};
			que.add(tmp);
		}
		
		while(!que.isEmpty()) {
			int[] tmp = que.poll();
			if(cost[tmp[0]]==INF) {
				cost[tmp[0]] = cost[tmp[1]] + tmp[2];
				for(int i=0;i<10;i++) {
					if(i==tmp[0]) continue;
					int[] tmp2 = {i,tmp[0],c[i][tmp[0]]};
					que.add(tmp2);
				}
			}else {
				cost[tmp[0]] = Math.min(cost[tmp[0]], cost[tmp[1]] + tmp[2]);
			}
			
		}
		
		long ans = 0;
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				int num = in.nextInt();
				if(num>=0) ans += cost[num];
			}
		}
		System.out.println(ans);
		in.close();

	}

}
