import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	class point{

		double x;

		double y;

		int count = 1;

		point(double x, double y){

			this.x = x;

			this.y = y;

		}

		point norm(double x, double y){

			return new point(x/Math.sqrt(x*x+y*y),y/Math.sqrt(x*x+y*y));

		}

		boolean in(point p){

			return (p.x-x)*(p.x-x)+(p.y-y)*(p.y-y) <= 1.00000000001 ;

		}

	}

	int overLap(point a,point b, point[] p){

		if((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y) > 4) return Math.max(a.count, b.count);

		double tangent = -(a.x - b.x)/(a.y - b.y);

		point mid = new point((a.x+b.x)/2,(a.y+b.y)/2);

		double r = Math.sqrt(1 - ((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y))/4);

		point dir = mid.norm(1, tangent);

		point center = new point(mid.x+r*dir.x,mid.y+r*dir.y); 

		point center2 = new point(mid.x-r*dir.x,mid.y-r*dir.y); 

		int cnt = 0;

		int cnt2 = 0;

//		System.out.println(center2.x+" "+center2.y);

//		System.out.println(center.x + " " + center.y);

//		System.out.println();

		for(int i =0;i<p.length;i++){

			if(center.in(p[i])){

				cnt+= p[i].count;

//				System.out.println("a "+(i+1));

			}

			if(center2.in(p[i])){

				cnt2+= p[i].count;

//				System.out.println("b "+(i+1));

			}

		}

		

		return Math.max(cnt, cnt2);

	}

	void run(){

		for(;;){

			Scanner in = new Scanner(sc.nextLine());

			int n = in.nextInt();

			if(n ==0) break;

			point[] p = new point[n];

			for(int i= 0;i< n;i++){

				in = new Scanner(sc.nextLine().replace(',', ' '));

				p[i] = new point(in.nextDouble(),in.nextDouble());

				for(int j = 0; j < i;j++){

					if(Math.abs(p[j].x- p[i].x)<0.0000001 && Math.abs(p[j].y-p[i].y)<0.0000001){

						p[j].count++;

						p[i].count =0;

						break;

					}

				}

			}

			int max = 0;

			for(int i=0;i<n;i++){

				for(int j =i+1;j<n;j++){

//					System.out.println((i+1) +" " + (1+j));

					max = Math.max(overLap(p[i],p[j],p),max);

				}

			}

			System.out.println(max);

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}