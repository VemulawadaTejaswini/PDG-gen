import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int n, k, t, u, v, goal;
	int[] d;

	void run(){
		n=sc.nextInt();
		k=sc.nextInt();
		t=sc.nextInt();
		u=sc.nextInt();
		v=sc.nextInt();
		goal=sc.nextInt();
		d=new int[n];
		for(int i=0; i<n; i++){
			d[i]=sc.nextInt();
		}

		boolean boost=false;
		double boostTime=0;
		int carrot=0;
		double x=0;
		double time=0;

		for(int i=0; i<n; i++){
			if(boost){
				double s=(double)(d[i]-x)/v;
				if(s>boostTime){
					time+=boostTime;
					time+=(d[i]-x-v*boostTime)/u;
					boost=false;
				}else{
					time+=s;
				}
			}else{
				double s=(double)(d[i]-x)/u;
				time+=s;
			}
			carrot++;
			if(!boost){
				boost=true;
				boostTime=t;
				carrot--;
			}else if(carrot>k){
				boostTime=t;
				carrot--;
			}
			x=d[i];
		}

		// debug(carrot);

		for(; carrot>=0; carrot--){
			if(x+v*boostTime>=goal){
				time+=(goal-x)/v;
				x=goal;
			}else{
				x+=v*boostTime;
				time+=boostTime;
				boostTime=t;
			}
		}
		time+=(goal-x)/u;

		// debug(time);

		println(time+"");
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}