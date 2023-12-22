import java.util.*;
import java.util.regex.*;
import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ
public class Main {
	final Scanner sc=new Scanner(System.in);
	final int[] vx={0,1,0,-1}, vy={-1,0,1,0};
	final int[] vvx={0,1,0,-1,-1,1,1,-1}, vvy={-1,0,1,0,-1,-1,1,1};
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
		new Main().AOJ1162();
	}
	
	void AOJ1162(){
		while(sc.hasNext()){
			int N=sc.nextInt(),M=sc.nextInt();
			if((N|M)==0)	break;
			int start=sc.nextInt()-1,goal=sc.nextInt()-1;
			int[][] d=new int[N][N],s=new int[N][N];
			for(int x=0; x<N; x++){
				for(int y=0; y<N; y++){
					d[x][y]=INF;	s[x][y]=INF;
				}
			}
			for(int i=0; i<M; i++){
				int a1=sc.nextInt()-1,a2=sc.nextInt()-1,dd=sc.nextInt(),ss=sc.nextInt();
				d[a1][a2]=dd;	d[a2][a1]=dd;
				s[a1][a2]=ss;	s[a2][a1]=ss;
			}
			PriorityQueue<C1162> open=new PriorityQueue<C1162>();
			open.add(new C1162(start,-1,1,0.0));
			double[][][] close=new double[N][N][31];
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					for(int k=0; k<=30; k++)	close[i][j][k]=(double)INF;
				}
			}
			double ans=(double)INF;
			while(!open.isEmpty()){
				C1162 now=open.poll();
				for(int i=0; i<N; i++){
					if(now.now==i)	continue;
					if(d[now.now][i]>=INF)	continue;
					if(now.last==i)	continue;
					for(int j=-1; j<=1; j++){
						//out.println("N"+N+" i"+i+" j"+j);
						int sp2=now.sp+j;
						if(now.last<0 && sp2!=1)	continue;
						if(sp2<=0)	continue;
						if(sp2>s[now.now][i])	continue;
						double time=now.t+((double)d[now.now][i]/(double)sp2);
						if(close[now.now][i][sp2]<=time)	continue;
						if(i==goal && sp2==1){
							//out.println("ANS1:"+i+" SP"+sp2+" T"+time);
							ans=min(ans,time);
							continue;
						}
						//out.println("ADD"+i+" SP"+(sp2)+" T"+time);
						open.add(new C1162(i,now.now,sp2,time));
						close[now.now][i][sp2]=time;
					}
				}
			}
			out.println((ans==INF?"unreachable":ans));
		}
	}
	class C1162 implements Comparable<C1162>{
		int now,last,sp;
		double t;
		C1162(int now,int last,int sp,double t){this.now=now; this.last=last; this.sp=sp; this.t=t;}
		@Override public int compareTo(C1162 o) {
			if(this.t<o.t)	return -1;
			if(this.t>o.t)	return 1;
			return 0;
		}
		/*
		@Override public boolean equals(Object o){
			if(o==null)	return false;
			if(this==o)	return true;
			if(this.getClass()!=o.getClass())	return false;
			C1162 oth=(C1162)o;
			if(this.t==oth.t && this.sp==oth.sp && this.now==oth.now)	return true;
			return false;
		}
		@Override public int hashCode(){
			int r=1;
			r=r*31+this.sp;
			r=r*31+(int)this.t;
			r=r*31+this.last;
			return r;
		}
		*/
	}
	
	int ans1161;
	int n1161;
	HashMap<Character,Integer> map1161;
	String [] data1161;
	
	private void solve1161(char c, int deep){
		
		if(deep == map1161.size()){
			//calc
			int sum = 0;
			for(int i =0; i < n1161 -1;i++){
				int temp = 0;
				for(int j = 0 ; j < data1161[i].length(); j++){
					char tempchar = data1161[i].charAt(j);
					temp += tempchar + '0';
					temp *= 10;
				}
				sum += temp;
			}
			int ans = 0;
			for(int i =0; i < data1161[n1161 - 1].length(); i++){
				char tempchar = data1161[n1161 - 1].charAt(i);
				ans += tempchar + '0';
				ans *= 10;
			}
			System.out.println(ans +" " + sum);
			if(ans == sum){
				ans1161++;
			}
			return;
		}
		else{
			for(Character ch: map1161.keySet()){
				if(map1161.get(ch) == -1){
					map1161.put(ch, deep);
					solve1161(ch, deep + 1);
					map1161.put(ch, -1);
				}
			}
		}
	}
	
	void AOJ1161(){
		while(true){
			n1161 = sc.nextInt();
			if(n1161 == 0) break;
			ans1161 = 0;
			data1161 = new String[n1161];
			map1161 = new HashMap<Character,Integer>();
			for(int i=0; i< n1161; i++){
				String str = sc.next();
				for(int j = 0; j <str.length();j++){
					char tempchar = str.charAt(j);
					map1161.put(tempchar, -1);
				}
				data1161[i] = str;
			}
			for(Character c: map1161.keySet()){
				System.out.println("pass" +ans1161);
				solve1161(c, 0);
			}
			System.out.println("ANS=");
			System.out.println(ans1161);
		}
	}
	
	void AOJ1160(){
		while(sc.hasNext()){
			int W=sc.nextInt(),H=sc.nextInt();
			if((W|H)==0)	break;
			boolean[][] b=new boolean[W][H];
			for(int y=0; y<H; y++){
				for(int x=0; x<W; x++)	b[x][y]=(sc.nextInt()==1);
			}
			boolean[][] close=new boolean[W][H];
			LinkedList<Point> open=new LinkedList<Point>();
			int ans=0;
			for(int x=0; x<W; x++){
				for(int y=0; y<H; y++){
					if(b[x][y]&&!close[x][y]){
						open.add(new Point(x,y));
						ans++;
						while(!open.isEmpty()){
							Point now=open.poll();
							for(int i=0; i<8; i++){
								int xx=now.x+vvx[i],yy=now.y+vvy[i];
								if(!Point.ok(xx, yy, W, H))	continue;
								if(!b[xx][yy])	continue;
								if(close[xx][yy])	continue;
								open.add(new Point(xx,yy));
								close[xx][yy]=true;
							}
						}
					}
				}
			}
			out.println(ans);
		}
	}
	
	void AOJ1159(){
		while(true){
			int n = sc.nextInt();
			int q = sc.nextInt();
			if(n == 0 && q == 0) break;
			int [] data = new int[n];
			//int num = 0;
			for(int i = 0; i < 1000000; i++){
				if(q == 0){
					q += data[i%n];
					data[i%n] = 0;
				}
				else{
					data[i%n]++;
					q--;
					//System.out.println(q + " " + data[i%n]);
					if(q == 0){
						boolean flg = true;
						for(int j = 0; j < n; j++){
							if((i % n) == j) continue;
							if(data[j] != 0){
								flg = false;
								break;
							}
						}
						if(flg == true){
							System.out.println(i%n);
							break;
						}
					}
					
				}
			}
		}
	}
}