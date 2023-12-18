import java.awt.*;
import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();
		ArrayList<Point> a=new ArrayList<>();
		for(int i=0;i<n;++i)
			a.add(new Point(s.nextInt(),s.nextInt()));

		int r=n==1?1:Integer.MAX_VALUE;

		for(int i=0;i<n;++i){
			for(int j=i+1;j<n;++j){
				long dx=a.get(j).x-a.get(i).x;
				long dy=a.get(j).y-a.get(i).y;

				ArrayList<Point> l=new ArrayList<>();
				int t=0;
				for(Point p:a){
					if(!l.stream().anyMatch(q->(p.x==q.x+dx&&p.y==q.y+dy)||(p.x==q.x-dx&&p.y==q.y-dy))){
						++t;
					}
					l.add(p);
				}
				r=Math.min(r,t);
			}
		}
		System.out.println(r);
	}
}