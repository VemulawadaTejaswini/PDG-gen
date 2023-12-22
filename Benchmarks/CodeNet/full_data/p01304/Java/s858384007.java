import java.util.*;
import java.awt.Point;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n-- > 0){
			Point size = new Point(sc.nextInt(),sc.nextInt());
			int[][] cost = new int[size.y+1][size.x+1];
			int m = sc.nextInt();
			Edge[] edge = new Edge[m];
			
			for(int i=0;i<m;i++){
				edge[i] = new Edge(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
			}
			
			Queue<Point> open = new LinkedList<Point>();
			open.add(new Point(0,0));
			cost[0][0] = 1;
			while(!open.isEmpty()){
				Point p = open.poll();
				Point rp = new Point(p.x+1, p.y);
				Point up = new Point(p.x, p.y+1);
				if(rp.x >= 0 && rp.x <= size.x){
					int i=0;
					for(;i<m;i++) if(edge[i].s.equals(p) && edge[i].t.equals(rp)) break;
					if(i == m){
						cost[rp.y][rp.x] += cost[p.y][p.x];
						if(!open.contains(rp)) open.add(rp);
					}
				}
				if(up.y >= 0 && up.y <= size.y){
					int i=0;
					for(;i<m;i++) if(edge[i].s.equals(p) && edge[i].t.equals(up)) break;
					if(i == m){
						cost[up.y][up.x] += cost[p.y][p.x];
						if(!open.contains(up)) open.add(up);
					}					
				}
			}
			System.out.println(cost[size.y][size.x]==0 ? "Miserable Hokusai!" : cost[size.y][size.x]);
		}
	}
}

class Edge{
	Point s,t;
	
	Edge(int x1,int y1,int x2,int y2){
		if(x1 <= x2 && y1 <= y2){
			s = new Point(x1,y1);
			t = new Point(x2,y2);
		}
		else{
			t = new Point(x1,y1);
			s = new Point(x2,y2);
		}
	}
}