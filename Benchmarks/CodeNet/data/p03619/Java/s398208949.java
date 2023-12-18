import java.awt.Point;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		
		if(y2<y1){
			int sp = y2;
			y2 = y1;
			y1 =sp;
			sp = x2;
			x2 = x1;
			x1 = sp;
		} // y1 < y2
		
		int N = in.nextInt();
		
		if(x1==x2){
			boolean exist = false;
			for (int i = 0; i < N; i++) {
				int x = in.nextInt();
				int y = in.nextInt();
				if(x==x1 && y1<y && y<y2) exist = true;
			}
			System.out.println(100L*(y2-y1)+((!exist)?0:10*Math.PI-20));
			
		}else if(y1==y2){
			boolean exist = false;
			if(x1>x2){
				int sp = x2; x2 = x1; x1 = sp;
			}
			for (int i = 0; i < N; i++) {
				int x = in.nextInt();
				int y = in.nextInt();
				if(y==y1 && x1<x && x<x2) exist = true;
			}
			System.out.println(100L*(x2-x1)+((!exist)?0:10*Math.PI-20));
			
		}else if(x1<x2){
			PriorityQueue<Point> queue = new PriorityQueue<>(
					(a,b)->((Point)a).x-((Point)b).x
			);
			for (int i = 0; i < N; i++) {
				queue.add(new Point(in.nextInt(),in.nextInt()));
			}
			BinaryPoints tree = new BinaryPoints();
			while(!queue.isEmpty()){
				Point p = queue.poll(); 
				if(x1<=p.x && p.x<=x2 && y1<=p.y && p.y<=y2) tree.add(p.y);
			}
			System.out.println(100L*((x2-x1)+(y2-y1))+(5*Math.PI-20)*tree.max);
			
		}else if(x1>x2){
			PriorityQueue<Point> queue = new PriorityQueue<>(
					(a,b)->((Point)b).x-((Point)a).x
			);
			for (int i = 0; i < N; i++) {
				queue.add(new Point(in.nextInt(),in.nextInt()));
			}
			BinaryPoints tree = new BinaryPoints();
			while(!queue.isEmpty()){
				Point p = queue.poll(); 
				if(x2<=p.x && p.x<=x1 && y1<=p.y && p.y<=y2) tree.add(p.y);
			}
			System.out.println(100L*((x1-x2)+(y2-y1))+(5*Math.PI-20)*tree.max);
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}

class BinaryPoints{
	ArrayList<Point> points;
	int max;
	
	public BinaryPoints(){
		points = new ArrayList<Point>();
		points.add(new Point(-1,0));
		max = 0;
	}
	
	public void add(int y){
		int index = bSerch(y,0,points.size());
		int count = points.get(index).y + 1;
		points.add(index+1, new Point(y,count));
		max = Math.max(max, count);
	}
	
	public int bSerch(int y,int left,int right){
		if(left+1>=right) return left;
		if(points.get((left+right)/2).x < y){
			return bSerch(y,(left+right)/2+1,right);
		}else{
			return bSerch(y,left,(left+right)/2);
		}
	}
}