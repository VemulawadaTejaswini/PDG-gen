import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner in = new Scanner(System.in);

	class P{

		double x;

		double y;

		int i;

		P(double x,double y,int i){

			this.x = x;

			this.y = y;

			this.i = i;

		}

		P dir;

	}

	void run(){

		for(;;){

			Scanner sc = new Scanner(in.nextLine().replace(',', ' '));

			int n= sc.nextInt();

			if(n==0) break;

			if(n==1){

				System.out.println("0");

				continue;

			}

			P[] p = new P[n];

			boolean[] used = new boolean[n];

			double minx = Double.MAX_VALUE;

			int first = 0;

			for(int i=0; i< n; i++){

				sc = new Scanner(in.nextLine().replace(',', ' '));

				p[i] = new P(sc.nextDouble(),sc.nextDouble(),i);

				if(minx > p[i].x){

					first = i;

					minx = p[i].x;

				}

			}

			p[first].dir = new P(0,1,-1);

			P now = p[first];

			used[now.i] = true;

			for(;;){

//				System.out.println(" "+now.i);

				double min = Double.MAX_VALUE;

				int next = 0;

				for(int i = 0; i < n;i++){

					if(i == now.i) continue;

					double y = Math.atan2((p[i].y-now.y)*now.dir.x - (p[i].x-now.x)*now.dir.y,-(p[i].y-now.y)*now.dir.y - (p[i].x-now.x)*now.dir.x);

					if(min > y){

						min = y;

						next = i;

					}

				}

//				System.out.println("  "+min/Math.PI*180);

				if(used[next]){

					break;

				}

				used[next] = true;

				P dir = new P(p[next].x-now.x,p[next].y-now.y,next);

				now = p[next];

				p[next].dir = dir;

			}

			int sum = 0;

			for(int i=0; i< n; i++){

				if(!used[i]) sum++;

			}

			System.out.println(sum);

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}