import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Point r[] = new Point[n];
		Point b[] = new Point[n];
		
		for(int i=0;i<n;i++){
			r[i] = new Point(sc.nextInt(), sc.nextInt());
		}
		for(int i=0;i<n;i++){
			b[i] = new Point(sc.nextInt(), sc.nextInt());
		}
		
		Arrays.sort(r, new Comparator<Point>(){
			public int compare(Point o1, Point o2) {
				return o1.x - o2.x;
			}
		});
		boolean v[] = new boolean[n];
		int ans = 0;
		for(int i=0;i<n;i++){
			int max = -1;
			int idx = -1;
			for(int j=0;j<n && b[i].x > r[j].x;j++){
				if(!v[j] && b[i].y>r[j].y && r[j].y>max){
					max = r[j].y;
					idx = j;
				}
			}
			if(idx != -1){
				ans++;
				v[idx] = true;
			}
		}
		System.out.println(ans);
		
	}
}
class Point{
	int x, y;
	Point(int _x, int _y){
		x = _x;
		y = _y;
	}
}
