import java.util.*;
import java.util.regex.*;
import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ
public class Main {
	final Scanner sc=new Scanner(System.in);
	final int[] vx={0,1,0,-1}, vy={-1,0,1,0};
	final int INF=1<<24;
	static class Point{
		int x, y;
		Point(int x, int y){	this.x=x;	this.y=y;}
		Point(){	this.x=0; this.y=0;}
		@Override public String toString(){	return "("+this.x+","+this.y+")";}
		static boolean ok(int x,int y,int X,int Y,int min){	return (min<=x&&x<X)&&(min<=y&&y<Y);}
		static boolean ok(int x,int y,int X,int Y){	return ok(x,y,X,Y,0);}
	}
	public static void main(String[] args) {
		new Main().AOJ0212();
	}
	
	int c;
	void AOJ0212(){
		while(sc.hasNext()){
			c=sc.nextInt();
			int n=sc.nextInt(),m=sc.nextInt(),s=sc.nextInt()-1,d=sc.nextInt()-1,ans=INF;
			if(c==0)	break;
			int[][] g=new int[n][n];
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++)	g[i][j]=INF;
			}
			for(int i=0; i<m; i++){
				int a=sc.nextInt()-1,b=sc.nextInt()-1,f=sc.nextInt();
				g[a][b]=f;	g[b][a]=f;
			}
			PriorityQueue<C0212> open=new PriorityQueue<C0212>();
			int[] close=new int[n];
			Arrays.fill(close, INF);
			int[] temp=new int[c];
			open.add(new C0212(s,0,temp,0));
			while(!open.isEmpty()){
				C0212 now=open.poll();
				//out.println("N"+now.now+" S"+now.sum);
				for(int i=0; i<n; i++){
					if(now.now==i)	continue;
					if(g[now.now][i]>=INF)	continue;
					C0212 tmp=new C0212(i,g[now.now][i],now.max,now.sum);
					if(close[i]<=tmp.sum)	continue;
					//out.println(now.now+" -> "+tmp.now+" S "+tmp.sum);
					if(i==d){
						//out.println("ANS2 "+tmp.sum);
						ans=min(ans,tmp.sum);
						continue;
					}
					open.add(new C0212(tmp));
					close[i]=tmp.sum;
				}
			}
			out.println(ans);
		}
	}
	class C0212 implements Comparable<C0212>{
		int now,sum;
		int[] max=new int[c];
		C0212(C0212 o){this.now=o.now; this.sum=o.sum; this.max=o.max;}
		C0212(int now,int nowc,int[] a,int sum){
			if(a[0]<nowc){
				//sum+=a[0]/2;
				sum+=nowc/2;
				a[0]=nowc;
				Arrays.sort(a);
			}else	sum+=nowc;
			this.now=now;	this.max=a;	this.sum=sum;
		}
		@Override public int compareTo(C0212 o) {
			if(this.sum<o.sum)	return -1;
			if(this.sum>o.sum)	return 1;
			return 0;
		}
		
	}
}