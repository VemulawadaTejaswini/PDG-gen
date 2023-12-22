import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
	final Scanner sc=new Scanner(System.in);
	final int[] vx={0,1,0,-1},vy={1,0,-1,0};
	final int INF=1<<24;
	public static void main(String[] args) {
		new Main().D();
	}
	
	void D(){
		 while(sc.hasNext()){
			 int H=sc.nextInt(),W=sc.nextInt(),sx=0,sy=0;
			 if((W|H)==0)	break;
			 char[][] c=new char[W][H];
			 for(int y=0; y<H; y++){
				 String line=sc.next();
				 for(int x=0; x<W; x++){
					 c[x][y]=line.charAt(x);
					 if(c[x][y]=='@'){
						 sx=x;	sy=y;
					 }
				 }
			 }
			 LinkedList<DC> open=new LinkedList<DC>();
			 open.add(new DC(0,sx,sy,deepCopy(c)));
			 HashSet<DC> close=new HashSet<DC>();
			 close.add(new DC(0,sx,sy,deepCopy(c)));
			 int ans=INF;
			 while(!open.isEmpty()){
				 DC now=open.poll();
				 for(int i=0; i<4; i++){
					 int xx=now.x+vx[i],yy=now.y+vy[i];
					 if(now.c[xx][yy]=='#')	continue;
					 if(now.c[xx][yy]=='w')	continue;
					 if(now.c[xx][yy]=='E'){
						 ans=min(ans,now.step+1);
						 break;
					 }
					 if(close.contains(new DC(now.step+1,xx,yy,deepCopy(now.c)))){
						 //System.out.println("CONT:"+xx+" "+yy+" "+(now.step+1));
						 continue;
					 }
					 if(now.c[xx][yy]=='c'){
						 if(now.c[xx+vx[i]][yy+vy[i]]=='#')	continue;
						 char[][] cc=deepCopy(now.c);
						 int xxx=xx,yyy=yy;
						 while(true){
							 xxx+=vx[i];	yyy+=vy[i];
							 if(cc[xxx][yyy]=='w'){
								 cc[xxx][yyy]='.';
								 cc[xx][yy]='.';
								 break;
							 }else if(cc[xxx][yyy]=='#'){
								 cc[xxx-vx[i]][yyy-vy[i]]='c';
								 cc[xx][yy]='.';
								 break;
							 }
						}
						 //disp(cc);
						open.add(new DC(now.step+1,xx,yy,deepCopy(cc)));
						close.add(new DC(now.step+1,xx,yy,deepCopy(cc)));
						continue;
					}
					//System.out.println(xx+" "+yy+" "+(now.step+1));
					open.add(new DC(now.step+1,xx,yy,deepCopy(now.c)));
					close.add(new DC(now.step+1,xx,yy,deepCopy(now.c)));
				 }
			 }
			 //System.out.print("ANS=");
			 System.out.println((ans>=INF?"-1":ans));
		 }
	}
	void disp(char[][] c){
		for(int y=0; y<c[0].length; y++){
			for(int x=0; x<c.length; x++)	System.out.print(c[x][y]);
			System.out.println();
		}
	}
	class DC{
		int step,x,y;
		char[][] c;
		public DC(int step, int x, int y, char[][] c) {	this.step = step; this.x = x; this.y = y; this.c = c;}
		@Override public boolean equals(Object o){
			if(o.getClass()!=this.getClass())	return false;
			DC oth=(DC)o;
			//if(Arrays.deepEquals(oth.c, this.c) && this.x==oth.x && this.y==oth.y && this.step<=oth.step)	return true;
			//System.out.println("S"+this.step+" "+oth.step);
			if(Arrays.deepEquals(oth.c, this.c) && this.x==oth.x && this.y==oth.y && this.step>=oth.step)	return true;
			return false;
		}
		@Override public int hashCode(){
			int r=1;
			r=r*31+this.x;
			r=r*31+this.y;
			return r;
		}
	}
	char[][] deepCopy(char[][] c){
		char[][] res=new char[c.length][c[0].length];
		for(int i=0; i<c.length; i++){
			for(int j=0; j<c[0].length; j++)	res[i][j]=c[i][j];
		}
		return res;
	}
	
	void B(){
		while(sc.hasNext()){
			char[] R=sc.next().toCharArray();
			if(R[0]=='-')	break;
			char[] G=sc.next().toString().toCharArray(),dd=sc.next().toCharArray();
			char now=G[0];
			int gi=1,ri=0,di=0;
			StringBuilder d=new StringBuilder(),r=new StringBuilder();
			while(true){
				//System.out.println("N"+now);
				if(di<dd.length){
					if(now==dd[di]){
						d.append(now);
						di++;
						now=R[ri++];
					}else{
						r.append(now);
						if(gi+1>G.length)	break;
						now=G[gi++];
					}
				}else{
					r.append(now);
					break;
				}
			}
			while(gi<G.length)	r.append(G[gi++]);
			//System.out.println("D:"+d);
			//System.out.print("ANS=");
			System.out.println(r);
		}
	}
	void A(){
		while(true){
			int W = sc.nextInt(), Q = sc.nextInt();
			if(W == 0 && Q == 0){
				break;
			}
			int [] b = new int[W];
			Arrays.fill(b, -1);
			while(Q-- > 0){
				String  str = sc.next();
				int id = sc.nextInt();
				if(str.equals("s")){
					int x = sc.nextInt();
					boolean flg2 = true;
					for(int i=0; i <= W - x; i++){
						boolean flg = true;
						for(int j= i; j < i + x; j++){
							if(b[j] != -1){
								flg = false;
								break;
							}
						}
						if(flg){
							flg2 = false;
							System.out.println(i);
							for(int j = i; j < i + x; j++){
								b[j] = id;
							}
							break;
						}
					}
					if(flg2){
						System.out.println("impossible");
					}
				}
				else{
					for(int i=0; i < W; i++){
						if(b[i] == id){
							b[i] = -1;
						}
					}
				}
				//debug
//				System.out.print("DEB= ");
//				for(int i=0; i < b.length; i++){
//					System.out.print(b[i]);
//				}
//				System.out.println();
			}
			System.out.println("END");
		}
	}
}