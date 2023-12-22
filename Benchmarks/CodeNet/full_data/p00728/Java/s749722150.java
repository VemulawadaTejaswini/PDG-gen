import java.util.*;
import java.util.regex.*;
import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ
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
		new Main().AOJ1147();
	}
	
	void AOJ1147(){
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0)	break;
			int[] score=new int[n];
			for(int i=0; i<n; i++)	score[i]=sc.nextInt();
			Arrays.sort(score);
			int sum=0;
			for(int i=1; i<n-1; i++)	sum+=score[i];
			out.println(sum/(n-2));
		}
	}
	
	int[] rx={1,1,2,1,2,3,1,2,1}, fy={-2,-1,-1,0,0,0,1,1,2};
	int[] lx={-1,-1,-2,-1,-2,-3,-1,-2,-1};
	void AOJ1150(){
		while(sc.hasNext()){
			int W=sc.nextInt(), H=sc.nextInt();
			if((W|H)==0)	break;
			char[][] c=new char[W][H];
			int[][][] close=new int[W][H][2];
			PriorityQueue<C1150> open=new PriorityQueue<C1150>();
			for(int y=0; y<H; y++){
				for(int x=0; x<W; x++){
					char temp=sc.next().charAt(0);
					c[x][y]=temp;
					if(temp=='S'){
						open.add(new C1150(x,y,0,0));
						open.add(new C1150(x,y,0,1));
						close[x][y][0]=-1;
						close[x][y][1]=-1;
					}
				}
			}
			int ans=-1;
			while(!open.isEmpty()){
				C1150 now=open.poll();
				//out.println(now.x+" "+now.y);
				int[] fx=(now.f==0? rx: lx);
				for(int i=0; i<9; i++){
					int xx=now.x+fx[i], yy=now.y+fy[i];
					if(!Point.ok(xx, yy, W, H))	continue;
					if(c[xx][yy]=='X')	continue;
					if(c[xx][yy]=='T'){
						ans=(ans<0? now.c: min(ans,now.c));
						continue;
					}
					if(now.c+Character.digit(c[xx][yy],10)>=close[xx][yy][1-now.f] && close[xx][yy][1-now.f]!=0)	continue;
					open.add(new C1150(xx,yy,now.c+Character.digit(c[xx][yy],10),now.f==0?1:0));
					close[xx][yy][1-now.f]=now.c+Character.digit(c[xx][yy],10);
				}
			}
			out.println(ans);
		}
	}
	class C1150 implements Comparable<C1150>{
		int x,y,c,f;
		C1150(int x,int y,int c,int f){
			this.x=x;	this.y=y;	this.c=c;	this.f=f;
		}
		@Override public int compareTo(C1150 arg0) {
			if(this.c<c)	return -1;
			if(this.c>c)	return 1;
			return 0;
		}
	}
	
	/*
	*** Compile Error
	void AOJ1148(){
		while(sc.hasNext()){
			int N=sc.nextInt(), M=sc.nextInt();
			if((N|M)==0)break;
			int r=sc.nextInt();
			ArrayList<C1148>[] list=new ArrayList[M];
			for(int i=0; i<M; i++)	list[i]=new ArrayList<C1148>();
			for(int i=0; i<r; i++){
				int time=sc.nextInt(), pc=sc.nextInt(), st=sc.nextInt()-1, k=sc.nextInt();
				ArrayList<C1148> ar=list[st];
				if(k==1){
					if(ar.size()==0)	ar.add(new C1148(time,1));
					else{
						for(int j=0; j<ar.size(); j++){
							C1148 temp=ar.get(j);
							if(temp.s<=time && time<=temp.e){
								temp.count++;
								ar.set(j, temp);
								break;
							}else{
								//out.println("R"+j);
								ar.add(new C1148(time,1));
								break;
							}
						}
						list[st]=ar;
					}
				}else{
					for(int j=0; j<ar.size(); j++){
						C1148 temp=ar.get(j);
						temp.count--;
						if(temp.count==0){
							temp.e=time;
							temp.count=-1;
							ar.set(j,temp);
							break;
						}else if(temp.count>0){
							ar.set(j,temp);
							break;
						}
					}
				}
				//debug
				//out.println("K"+k+" ")
			}
			
			//debug
			//for(int i=0; i<M; i++)	out.println(list[i]);
			
			int Q=sc.nextInt();
			for(int i=0; i<Q; i++){
				int S=sc.nextInt(), E=sc.nextInt(), ST=sc.nextInt()-1;
				ArrayList<C1148> ar=list[ST];
				int ans=0;
				for(int j=0; j<ar.size(); j++){
					C1148 temp2=ar.get(j);
					C1148 temp=new C1148(temp2.s,temp2.e,temp2.count);
					if(temp.s<=S && S<=temp.e)	temp.s=S;
					if(temp.s<=E && E<=temp.e)	temp.e=E;
					if(S<=temp.s && temp.e<=E)	ans+=temp.e-temp.s;
					//out.println("ANS"+ans+""+temp.s+" E"+temp.e);
				}
				out.println(ans);
			}
		}
	}
	class C1148{
		int s,e,count;
		C1148(int s,int count){
			this.s=s;	this.e=Integer.MAX_VALUE;	this.count=count;
		}
		C1148(int s,int e,int count){
			this.s=s;	this.e=e;	this.count=count;
		}
		@Override public String toString(){
			return "S"+s+" E"+e+" C"+count;
		}
	}
	*/
	
}