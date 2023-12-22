
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	class point{
		public int x;
		public int y;
		point(int x,int y){
			this.x = x;
			this.y = y;
		}
		point rot(int seed){
			if(seed == 0){
				return new point(this.x,this.y);
			}else if(seed == 1){
				return new point(-this.x,-this.y);				
			}else if(seed == 2){
				return new point(this.y,-this.x);				
			}else{// if(seed == 3){
				return new point(-this.y,this.x);								
			}
		}
		point org(point target){
			point ret = new point(this.x - target.x,this.y - target.y);
			return ret;
		}
		public boolean equ(point target){
			return this.x == target.x && this.y == target.y ;
		}
	}
	class polyline{
		public int m = 0;
		public point[] p;
		polyline(){}
		polyline(int m,Scanner sc){
			this.m  =m;
			p = new point[m];
			point org = new point(sc.nextInt(),sc.nextInt());
			p[0] = org.org(org);
			for(int i = 1; i < m; i++){
				p[i] = new point(sc.nextInt(),sc.nextInt());
				p[i] = p[i].org(org);
			}
		}
		polyline[] generate8(){
			polyline ret[] = new polyline[8];
			for(int i =0 ; i < 4; i ++){
				point[] a = new point[m];
				point org = p[0];
				for(int j = 0; j < m;j++){
					a[j] = p[j].org(org).rot(i);	
				}
				ret[i] = new polyline();
				ret[i].m = m;
				ret[i].p = a;
			}
			for(int i =0 ; i < 4; i ++){
				point[] a = new point[m];
				point org = p[m-1];
				for(int j = 0; j < m;j++){
					a[j] = p[m-j-1].org(org).rot(i);
				}
				ret[i+4] = new polyline();
				ret[i+4].m = m;
				ret[i+4].p = a;
			}
			return ret;
		}
		boolean equ(polyline target){
			if(this.m != target.m){
				return false;
			}
			for(int i =0;i < m;i++){
				if(!this.p[i].equ(target.p[i])){
					return false;
				}
			}
			return true;
		}
		void print(){
			System.out.println(this.m);
			for(int i = 0;i < m; i++){
				System.out.println(this.p[i].x + " " + this.p[i].y);
			}
			System.out.println();
		}
	}
	void run(){
		for(;;){
			int n = sc.nextInt();
			if(n == 0) break;
			polyline base1 =new polyline(sc.nextInt(),sc);
			polyline[] base = base1.generate8();
			/*
			for(int i = 0; i < 8 ; i++){
				System.out.println("base "+i);
				base[i].print();
			}
			*/
			for(int i = 0; i < n; i++){
				polyline lines = new polyline(sc.nextInt(),sc);
			/*
				System.out.println("lines "+(i+1));
				lines.print();
				System.out.println("------ ");
			*/	
				for(int j = 0; j < 8; j++){
					if(lines.equ(base[j])){
						System.out.println(i+1);
						continue;
					}
				}
			}
			System.out.println("+++++");
		}
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}