import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int sx = in.nextInt();
		int sy = in.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		List<Pos> remain = new ArrayList<>();
		remain.add(new Pos(sx, sy, 0));
		remain.get(0).distAmi = 0;
		for(int i=0; i<n; i++){
			x[i] = in.nextInt();
			y[i] = in.nextInt();
			remain.add(new Pos(x[i], y[i], i+1));
		}
		List<Pos> base = new ArrayList<>();
//		List<Line> ami = new ArrayList<>();
		int used = 0;
		double sum = 0;
		for(int i=0; i<m+1; i++){
			Collections.sort(remain);
			Pos p = remain.get(used++);
//			System.err.println(p.id);
			p.distAmi = 0;
			Pos min = null;
			int minID = 100000000;
			double dist = Integer.MAX_VALUE;
			if(i==0){
				base.add(p);
				for(int j=used; j<n+1; j++){
					Pos pos = remain.get(j);
					pos.distAmi = pos.dist(p);
//					System.err.println(j+" "+pos.distAmi);
				}
				continue;
			}
			for(Pos pos: base){
				if(pos.id == p.id) continue;
				int d = p.dist2(pos);
				if(d<dist || Math.abs(d-dist)<1e-8 && minID>pos.id){
					dist = d;
					min = pos;
					minID = pos.id;
				}
			}
			base.add(p);
//			System.err.println("dist:"+dist);
			sum += Math.sqrt(dist);
//			System.err.println("minid: "+min.id);
			Line line = (new Line(p, min));
			for(int j=used; j<n+1; j++){
				Pos pos = remain.get(j);
//				if(dist(line.p1, line.p2, pos)<0){
//					System.err.println("Error!");
//				}
//				System.err.println(j+" "+dist(line.p1, line.p2, pos));
				double d = Math.min(Math.abs(dist(line.p1, line.p2, pos)), pos.dist(p));
				pos.distAmi = Math.min(d, pos.distAmi);
			}
//			ami.add(line);
		}
		System.out.println(sum);
	}
	
	public static double dist(Pos a, Pos b, Pos c){
		if(dot(b.x-a.x, b.y-a.y, c.x-a.x, c.y-a.y)<=0)
			return Math.sqrt(a.dist2(c));
		if(dot(a.x-b.x, a.y-b.y, c.x-b.x, c.y-b.y)<=0)
			return Math.sqrt(b.dist2(c));
		return triarea(a, b, c)/Math.sqrt(a.dist2(b));
	}
	
	public static double triarea(Pos a, Pos b, Pos c){
		double dx1 = b.x - a.x;
		double dy1 = b.y - a.y;
		double dx2 = c.x - a.x;
		double dy2 = c.y - a.y;
		return dx1*dy2 - dx2*dy1;
	}
	
	public static double dot(double x, double y, double x1, double y1){
		return x*x1+y*y1;
	}
	
	public static double dot(Pos a, Pos b){
		return a.x*b.x+a.y*b.y;
	}
}

class Line{
	Pos p1, p2;
	Line(Pos p1, Pos p2){
		this.p1 = p1;
		this.p2 = p2;
	}
}

class Pos implements Comparable<Pos>{
	int x, y;
	int id;
	double distAmi = Integer.MAX_VALUE;
	int baseId;
	Pos(int x, int y, int id){
		this.x = x;
		this.y = y;
		this.id = id;
	}
	double dist(Pos a){
		return Math.sqrt(dist2(a));
	}
	int dist2(Pos a){
		return sq(a.x-x)+sq(a.y-y);
	}
	int sq(int a){
		return a*a;
	}
	@Override
	public int compareTo(Pos p) {
		if(Math.abs(distAmi-p.distAmi)>1e-8) return Double.compare(distAmi, p.distAmi);
		else return id-p.id;
	}
}