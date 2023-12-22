import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0 && h == 0){
				break;
			}
			
			LinkedList<Point> list = new LinkedList<Point>();
			
			Point start = null, goal = null;
			for(int i = 0; i < w; i++){
				for(int j = 0; j < h; j++){
					String s = sc.next();
					if(s.equals("S")){
						start = new Point(0, i, j);
						list.add(start);
					}else if(s.equals("G")){
						goal = new Point(100, i, j);
						list.add(goal);
					}else if(s.matches("[0-9]+")){
						list.add(new Point(Integer.parseInt(s), i, j));
					}
				}
			}
			System.out.println(func(list, start, goal));
		}
		
		sc.close();
	}
	static int func(LinkedList<Point> list, Point from, Point goal){
		int res = 2000000;
		boolean flg = false;
		for(Point p : list){
			if(from.n + 1 == p.n){
				int dist = Math.abs(from.x - p.x) + Math.abs(from.y - p.y);
				res = Math.min(func(list, p, goal) + dist, res);
				flg = true;
			}
		}
		if(!flg){
			return Math.abs(from.x - goal.x) + Math.abs(from.y - goal.y);
		}
		return res;
	}
}
class Point implements Comparable<Point>{
	int n;
	int x;
	int y;
	Point(int n, int x, int y){
		this.n = n;
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point p) {
		// TODO Auto-generated method stub
		return n - p.n;
	}
}