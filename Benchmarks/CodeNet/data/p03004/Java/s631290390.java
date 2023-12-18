import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		Coor[] cs = new Coor[n];
		for(int i = 0; i < n; i++){
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			char d = st.nextToken().charAt(0);
			cs[i] = new Coor(x, y, d);
		}
		double a = 0, b = 2*1e8+1;
		for(int iter = 0; iter < 200; iter++){
			double c = (2*a+b)/3;
			double d = (a+2*b)/3;
			double C = eval(cs, c);
			double D = eval(cs, d);
			if(C < D) b = d;
			else a = c;
		}
		System.out.println(eval(cs, a));
	}
	static double eval(Coor[] cs, double t){
		double maxx = -1e8, maxy = -1e8, minx = 1e8, miny = 1e8;
		for(Coor c: cs){
			double x = c.movex(t);
			double y = c.movey(t);
			maxx = Double.max(maxx, x);
			minx = Double.min(minx, x);
			miny = Double.min(miny, y);
			maxy = Double.max(maxy, y);
		}
		return (maxx - minx)*(maxy - miny);
	}
	static class Coor{
		int x, y; char d;
		public Coor(int x, int y, char d){
			this.x = x; this.y = y; this.d = d;
		}
		public String toString(){
			return x+" "+y;
		}
		public double movex(double t){
			if(d == 'L') return x-t;
			else if(d == 'R') return x+t;
			else return x;
		}
		public double movey(double t){
			if(d == 'U') return y+t;
			else if(d == 'D') return y-t;
			else return y;
		}
	}
	static class CoorNS implements Comparable<CoorNS>{
		int x, y; char d;
		public CoorNS(int x, int y, char d){
			this.x = x; this.y = y; this.d = d;
		}
		@Override
		public int compareTo(CoorNS c) {
			return y - c.y;
		}
		public String toString(){
			return x+" "+y;
		}
	}
	static class CoorWE implements Comparable<CoorWE>{
		int x, y; char d;
		public CoorWE(int x, int y, char d){
			this.x = x; this.y = y; this.d = d;
		}
		@Override
		public int compareTo(CoorWE c) {
			return x - c.x;
		}
		public String toString(){
			return x+" "+y;
		}
	}

}
