import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		
		char[][] map = new char[h][w];
		int[][] cost = new int[h][w];
		for(int i=0;i<h;i++){
			map[i] = sc.next().toCharArray();
			Arrays.fill(cost[i], Integer.MAX_VALUE);
		}
		
		ArrayDeque<Integer> x = new ArrayDeque<Integer>();
		ArrayDeque<Integer> y = new ArrayDeque<Integer>();
		
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(map[i][j]=='S'){
					x.offer(j);
					y.offer(i);
					cost[i][j] = 0;
					i = h;
					j = w;
				}
			}
		}
		
		int p, q;
		int sum = 0;
		int cnt = 1;
		while(true){
			p = x.poll();
			q = y.poll();
			if(map[q][p]==(char)(cnt+48)){
				sum += cost[q][p];
				if(cnt==n) break;
				else{
					cnt++;
					for(int i=0;i<h;i++){
						for(int j=0;j<w;j++){
							cost[i][j] = Integer.MAX_VALUE;
						}
					}
					cost[q][p] = 0;
					x.clear();
					y.clear();
				}
			}
			
			if(p!=0 && map[q][p-1]!='X' && cost[q][p]+1<cost[q][p-1]){
				x.offer(p-1);
				y.offer(q);
				cost[q][p-1] = cost[q][p]+1;
			}
			if(p!=w-1 && map[q][p+1]!='X' && cost[q][p]+1<cost[q][p+1]){
				x.offer(p+1);
				y.offer(q);
				cost[q][p+1] = cost[q][p]+1;
			}
			if(q!=0 && map[q-1][p]!='X' && cost[q][p]+1<cost[q-1][p]){
				x.offer(p);
				y.offer(q-1);
				cost[q-1][p] = cost[q][p]+1;
			}
			if(q!=h-1 && map[q+1][p]!='X' && cost[q][p]+1<cost[q+1][p]){
				x.offer(p);
				y.offer(q+1);
				cost[q+1][p] = cost[q][p]+1;
			}	
		}
		System.out.println(sum);
	}	
}