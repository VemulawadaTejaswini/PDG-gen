import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double x=in.nextDouble(),y=in.nextDouble();
		double a=y/(2*x);
		List<point> cx=new ArrayList<>();
		for(int i=0;i<=x;i++) {
			point p=new point();
			p.x=(double)(i*2);
			p.y=y-(a*(p.x));
			//System.out.println(p.y);
			cx.add(p);
		}
		
		for(int i=0;i<=y;i++) {
			point p=new point();
			p.y=(double)i;
			p.x=(y-p.y)/a;
			//System.out.println(p.x);
			boolean same=false;
			for(int j=0;j<cx.size();j++) {
				if(p.x==cx.get(j).x && p.y==cx.get(j).y) {
					same=true;
					//System.out.println(p.x+" "+p.y+"same");
					break;
				}
			}
			if(same==false)cx.add(p);
		}
		
		System.out.println(cx.size());
	}

}
class point{
	double x=0,y=0;
}

