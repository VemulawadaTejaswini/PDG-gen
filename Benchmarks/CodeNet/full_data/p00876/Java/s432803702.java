import java.util.*;
import java.lang.*;
import java.math.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int n;
	int[] l, c;
	double[] v;

	double EPS=1e-6;
	int INF=1<<28;

	void run(){
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			R[] rs=new R[n];
			for(int i=0; i<n; i++){
				rs[i]=new R();
				rs[i].l=sc.nextInt();
				rs[i].c=sc.nextInt();
				rs[i].v=1.0/rs[i].l;
			}
			Arrays.sort(rs, new Comparator<R>(){
				@Override
				public int compare(R r1, R r2){
					return (int)((r2.v-r1.v)*100000);
				}
			});

			for(int t=1;; t++){
				double first=INF;
				double end=rs[n-1].x;
				for(int i=0; i<n; i++){
					if(rs[i].goal){
						continue;
					}
					rs[i].x+=rs[i].v;
					first=rs[i].x=Math.min(rs[i].x, first);
					if(rs[i].x+EPS>2){
						rs[i].c--;
						rs[i].x-=2;
						end=rs[i].x=Math.min(rs[i].x, end);
						rs[i].goal=rs[i].c==0;
					}
				}
				Arrays.sort(rs, new Comparator<R>(){
					@Override
					public int compare(R r1, R r2){
						if((Math.abs(r1.x-0)<EPS&&Math.abs(r2.x-0)<EPS)
								||(Math.abs(r1.x-1)<EPS&&Math.abs(r2.x-1)<EPS)){
							// ツスツタツーツトorツ静慊づィツ陛板つオ
							return (int)((r2.v-r1.v)*100000);
						}
						return (int)((r2.x-r1.x)*100000);
					}
				});
				int sumC=0;
				for(R r : rs){
					sumC+=r.c;
				}
				if(sumC==0){
					println(t+"");
					break;
				}
			}
		}
	}

	class R{
		int l, c;
		double v, x, r;
		boolean goal;
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();

	}
}