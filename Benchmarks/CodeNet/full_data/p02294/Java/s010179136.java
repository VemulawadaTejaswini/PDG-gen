
import java.util.*;
import java.math.BigDecimal;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int q = stdIn.nextInt();
		for(int i=0;i<q;i++){
			double x0 = stdIn.nextDouble();
			double y0 = stdIn.nextDouble();
			double x1 = stdIn.nextDouble();
			double y1 = stdIn.nextDouble();
			double x2 = stdIn.nextDouble();
			double y2 = stdIn.nextDouble();
			double x3 = stdIn.nextDouble();
			double y3 = stdIn.nextDouble();
			Point p0 = new Point(x0,y0);
			Point p1 = new Point(x1,y1);
			Point p2 = new Point(x2,y2);
			Point p3 = new Point(x3,y3);
			if(p0.intersect(p1,p2,p3)){
				System.out.println(1);
			}
			else{
				System.out.println(0);
			}
		}

	}	
}
class Point{

	public double x,y;
	final double EPS = Math.pow(10,-8);
	final int cutoff = 9;

	Point(double x,double y){
		this.x = x;
		this.y = y;
	}

	double abs(){
		Point a = new Point(0,0);	
		return Math.sqrt(norm(a));	
	}
	double abs( Point a ){
		return Math.sqrt(norm(a));
	}
	double norm( Point a ){	
		return rounding((this.x - a.x) * (this.x - a.x) + (this.y - a.y) * (this.y - a.y));
	}

	void add( Point a ){
		this.x = rounding(this.x + a.x);
		this.y = rounding(this.y + a.y);
	}
	void sub( Point a ){
		this.x = rounding(this.x - a.x);
		this.y = rounding(this.y - a.y);
	}
	void mul( double z){
		this.x = rounding(this.x * z);
		this.y = rounding(this.x * z);
	}
	void div( double z){
		this.x = rounding(this.x / z);
		this.y = rounding(this.x / z);
	}

	Point getCrossPoint( Point a , Point b , Point c ){
		Point d = new Point(this.x,this.y);
		Vector s1 = new Vector(d.x,d.y,a.x,a.y);
		Vector s2 = new Vector(b.x,b.y,c.x,c.y);
		double t1 = getDistanceSP(b,c);
		double t2 = a.getDistanceSP(b,c);
		s1.mul(t1/(t1+t2));
		Vector s3 = new Vector(b.x,b.y,d.x,d.y);
		s3.add(s1);
		return new Point(b.x+s3.x,b.y+s3.y);
	}

	double getDistance( Point a , Point b , Point c ){
		if(intersect(a,b,c)){
			return 0.0;
		}
		return Math.min(getDistanceSP(b,c),a.getDistanceSP(b,c));
	}
	double getDistanceSP( Point a , Point b ){
		Vector s = new Vector( a.x , a.y , b.x , b.y);
		Vector sa = new Vector( a.x , a.y , this.x , this.y );
		Vector sb = new Vector( b.x , b.y , this.x , this.y );
		if(s.dot(sa)<0.00){
			return abs(a);
		}
		s.mul(-1);
		if(s.dot(sb)<0.00){
			return abs(b);
		}
		return Math.abs(s.cross(sb)/s.abs());
	}

	int CCW( Point a , Point b ){
		Vector sa = new Vector( this.x , this.y , a.x , a.y );
		Vector sb = new Vector( this.x , this.y , b.x , b.y );
		if(sa.cross(sb) > EPS){
			return -1;
		}
		else if(sa.cross(sb) < -EPS){
			return 1;
		}
		else if(sa.dot(sb) < -EPS){
			return -2;
		}
		else if(sa.norm() < sb.norm()){
			return 2;
		}
		else{
			return 0;
		}
	}
	boolean intersect( Point a , Point b , Point c ){
		Point d = new Point(this.x,this.y);
		if(CCW(a,b)*CCW(a,c) <= 0 && b.CCW(c,a)*b.CCW(c,d) <= 0){
			return true;
		}
		else{
			return false;
		}
	}

	int contains( Point[] query ){
		boolean flag1 = false;
		boolean flag2 = false;
		Point p1 = new Point(this.x+1,this.y);
		for(int i=0;i<query.length;i++){
			if(CCW(query[i],p1) == 2 || CCW(query[i],p1) == 0){
				flag1 = true;
			}
		}
		Point p2 = new Point(Integer.MAX_VALUE/2,this.y);
		final int l = query.length;
		for(int i=0;i<l;i++){
			if(intersect(p2,query[i%l],query[(i+1)%l])){
				flag2 = true;
			}
		}

		if(flag1){
			return 2;
		}
		else if(flag2){
			return 1;
		}
		return 0;
	}

	void temp( Point a ){
		Point temp = new Point(0,0);
		temp.x = this.x;
		temp.y = this.y;
		this.x = a.x;
		this.y = a.y;
		a.x = temp.x;
		a.y = temp.y;
	}
	void sort( Point[] query ){
		for(int i=0;i<query.length;i++){
			for(int j=0;j<query.length-1-i;j++){
				if(query[j].x > query[j+1].x){
					query[j].temp(query[j+1]);
				}
				else if(query[j].x == query[j+1].x && query[j].y > query[j+1].y){
					query[j].temp(query[j+1]);
				}
			}
		}
	}
	ArrayList<Point> andrewScan( Point[] query ){
		ArrayList<Point> list = new ArrayList<Point>();
		if(query.length<4){
			for(int i=0;i<query.length;i++){
				list.add(query[i]);
			}
		}
		else{
			sort(query);
			ArrayList<Point> list1 = new ArrayList<Point>();
			ArrayList<Point> list2 = new ArrayList<Point>();
			list1.add(query[0]);
			list1.add(query[1]);
			int next = 2;
			while(next<query.length-1){
				if(list1.size()<2){
					list1.add(query[next]);
					next++;
				}
				else{
					Point p1 = list1.get(list1.size()-2);
					Point p2 = list1.get(list1.size()-1);
					if(p1.CCW(p2,query[next])!=-1){
						list1.add(query[next]);
						next++;
					}
					else{
						list1.remove(list1.size()-1);
					}
				}
			}
			Point p1 = list1.get(list1.size()-2);
			Point p2 = list1.get(list1.size()-1);
			if(p1.CCW(p2,query[query.length-1])!=-1){
				list1.add(query[query.length-1]);
			}
			else{
				list1.remove(list1.size()-1);
				list1.add(query[query.length-1]);
			}
			list2.add(query[query.length-1]);
			list2.add(query[query.length-2]);
			next = query.length-3;
			while(next>0){
				if(list2.size()<2){
					list2.add(query[next]);
					next--;
				}
				else{
					Point a = list2.get(list2.size()-2);
					Point b = list2.get(list2.size()-1);
					if(a.CCW(b,query[next])!=-1){
						list2.add(query[next]);
						next--;
					}
					else{
						list2.remove(list2.size()-1);
					}
				}
			}
			p1 = list2.get(list2.size()-2);
			p2 = list2.get(list2.size()-1);
			if(p1.CCW(p2,query[0])>=0){
				list2.add(query[0]);
			}
			else{
				list2.remove(list2.size()-1);
				list2.add(query[0]);
			}
			for(int i=0;i<list1.size();i++){
				list.add(list1.get(i));
			}
			for(int i=1;i<list2.size()-1;i++){
				list.add(list2.get(i));
			}
		}
		return list;
	}

	Point polarCos(double cos_a){
		double sin_a = Math.sqrt(1-Math.pow(cos_a,2));
		double x = cos_a*this.x - sin_a*this.y;
		double y = sin_a*this.x + cos_a*this.y;
		return new Point(x,y); 
	}
	Point polarSin(double sin_a){
		double cos_a = Math.sqrt(1-Math.pow(sin_a,2));
		double x = cos_a*this.x - sin_a*this.y;
		double y = sin_a*this.x + cos_a*this.y;
		return new Point(x,y); 
	}

	boolean judge( Point a ){	
		if( Math.abs( this.x - a.x ) < EPS && Math.abs( this.y - a.y ) < EPS){
			return true;
		}
		else{
			return false;
		}
	}
	double rounding(double a){
		BigDecimal bi = new BigDecimal(String.valueOf(a));
		return bi.setScale(cutoff,BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}