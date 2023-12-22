import java.awt.geom.Point2D;
import java.util.*;

import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ1175();
	}	
	class AOJ1175{
		AOJ1175(){
			while(sc.hasNext()){
				N=sc.nextInt();
				if(N==0)	break;
				solve();
			}
		}
		int N;
		void solve(){
			Circle[] c=new Circle[N];
			int[] a=new int[N];
			for(int i=0; i<N; ++i){
				c[i]=new Circle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()-1);
				for(int j=0; j<i; ++j)if(c[i].r+c[j].r > c[i].p.distance(c[j].p))	a[i] |= (1<<j);
			}
			int ans=N;
			boolean[] dp=new boolean[1<<N];
			dp[(1<<N)-1]=true;
			for(int i=(1<<N)-1; i>=0; --i)if(dp[i]){
				for(int j=0; j<N; ++j)if((i&(1<<j))>0 && (i&a[j])==0){
					for(int k=j+1; k<N; ++k)if(j!=k && (i&(1<<k))>0 && (i&a[k])==0 && c[j].c==c[k].c){
						int tmp=(1<<j)|(1<<k);
						int next=i&(((1<<N)-1)^tmp);
//						System.out.println(Integer.toBinaryString(i)+" "+Integer.toBinaryString(tmp)+" "+Integer.toBinaryString(next));
						dp[next]=true;
						ans=min(ans, Integer.bitCount(next));
					}
				}
			}
			System.out.println(N-ans);
		}
		class Circle{
			Point2D p;
			double r;
			int c;
			Circle(double x,double y,double r,int c){
				this.p=new Point2D.Double(x,y);
				this.r=r;
				this.c=c;
			}
		}
	}
}