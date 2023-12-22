import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.next());
		List<point> p=new ArrayList<>();
		for(int i=0;i<n;i++) {
			p.add(new point(Integer.parseInt(in.next()),Integer.parseInt(in.next())));
		}
		p.sort(Comparator.comparingInt(point::getx).thenComparingInt(point::gety));
		for(int i=0;i<n;i++) {
			System.out.println(p.get(i).x+" "+p.get(i).y);
		}
	}

}


class point{
	int x,y;
	point (int a,int b){
		x=a;
		y=b;
	}
	
	int getx() {
		return x;
	}
	
	int gety() {
		return y;
	}
}
