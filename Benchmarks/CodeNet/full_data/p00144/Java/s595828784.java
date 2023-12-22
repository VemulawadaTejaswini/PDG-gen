import java.util.*;
import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ3
public class Main {
	final Scanner sc=new Scanner(System.in);
	final int[] vx={0,1,0,-1}, vy={-1,0,1,0};
	static class Point{
		int x, y;
		Point(int x, int y){	this.x=x;	this.y=y;}
		Point(){	this.x=0; this.y=0;}
		@Override public String toString(){	return "("+this.x+","+this.y+")";}
		static boolean ok(int x,int y,int X,int Y,int min){
			return (min<=x&&x<X && min<=y&&y<Y)?true:false;
		}
		static boolean ok(int x,int y,int X,int Y){	return ok(x,y,X,Y,0);}
	}
	public static void main(String[] args) {
		new Main().AOJ0144();
	}
	
	void AOJ0145(){
		while(sc.hasNext()){
			int N=sc.nextInt(),ans=Integer.MAX_VALUE;
			C0145[] c=new C0145[N];
			for(int i=0; i<N; i++)	c[i]=new C0145(sc.nextInt(),sc.nextInt());
			
			out.println(ans);
		}
	}
	class C0145{
		int upper,down;
		C0145(int u,int d){	this.upper=u;	this.down=d;	}
	}
	
	// OK
	void AOJ0147(){
		LinkedList<Integer> queue=new LinkedList<Integer>();
		int MAX=110;
		while(sc.hasNext())	queue.add(sc.nextInt());
		int[] num=new int[MAX],atime=new int[MAX],itime=new int[MAX],seat=new int[17],ans=new int[MAX];
		Arrays.fill(seat, -1);
		for(int i=0; i<MAX; i++){
			num[i]=(i%5==1?5:2);
			atime[i]=(17*(i%2)+3*(i%3)+19);
		}
		//for(int i=0; i<MAX; i++)	out.println(i+": ATIME"+atime[i]+" NUM"+num[i]);
		int gno=0,min=0;
		while(gno<=99){
			seat=exit(seat,min,atime,itime);
			int temp=find(seat,num[gno]);
			if(temp>=0 && min>=gno*5){
				ans[gno]=max(0,min-gno*5);
				for(int i=temp; i<temp+num[gno]; i++)	seat[i]=gno;
				itime[gno]=min;
				gno++;
			}else{
				//debug
				//disp(seat,min);
				min++;
			}
		}
		//disp(seat,min);
		while(!queue.isEmpty())	out.println(ans[queue.poll()]);
	}
	int find(int[] seat,int n){
		for(int i=0; i<=17-n; i++){
			boolean flag=true;
			for(int j=0; j<n; j++){
				if(seat[i+j]!=-1){
					flag=false;
					break;
				}
			}
			if(flag)	return i;
		}
		return -1;
	}
	int[] exit(int[] seat,int min,int[] atime,int[] itime){
		for(int i=0; i<17; i++){
			if(seat[i]<0)	continue;
			int emin=itime[seat[i]]+atime[seat[i]];
			if(min>=emin)	seat[i]=-1;
		}
		return seat;
	}
	void disp(int[] seat,int min){
		out.print(min+"m : ");
		for(int i=0; i<17; i++)	out.print(seat[i]+" ");
		out.println();
	}
	
	// WA（原因不明）
	void AOJ0144(){
		while(sc.hasNext()){
			int N=sc.nextInt();
			boolean[][] R=new boolean[N+1][N+1];
			for(int i=1; i<=N; i++){
				int r=sc.nextInt(),k=sc.nextInt();
				for(int j=0; j<k; j++)	R[r][sc.nextInt()]=true;
			}
			int P=sc.nextInt();
			for(int i=0; i<P; i++){
				int s=sc.nextInt(),d=sc.nextInt(),v=sc.nextInt(),ans=-1;
				PriorityQueue<C0144> open=new PriorityQueue<C0144>();
				open.add(new C0144(s,v,1));
				int[] close=new int[N+1];
				Arrays.fill(close, Integer.MAX_VALUE);
				while(!open.isEmpty()){
					C0144 now=open.poll();
					//out.println("1NOW"+now.now+" TTL"+now.ttl+" C"+now.c);
					if(now.ttl-1==0)	continue;
					for(int j=1; j<=N; j++){
						if(R[now.now][j] && now.c+1<close[j]){
							if(j==d){
								ans=(ans<0?now.c+1:min(ans,now.c+1));
								continue;
							}
							open.add(new C0144(j,now.ttl-1,now.c+1));
							close[j]=now.c+1;
						}
					}
				}
				out.println(((ans<0 || ans>v)?"NA":ans));
			}
		}
	}
	class C0144 implements Comparable<C0144>{
		int now,ttl,c;
		C0144(int now,int ttl,int c){
			this.now=now;	this.ttl=ttl;	this.c=c;
		}
		@Override public int compareTo(C0144 o) {
			if(this.c<o.c)	return -1;
			if(this.c>o.c)	return 1;
			return 0;
		}
	}
}