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
			int H=sc.nextInt(),W=sc.nextInt(),sx=0,sy=0,cc=0,ww=0;
			int[] cx=new int[3],cy=new int[3],wx=new int[3], wy=new int[3];
			Arrays.fill(cx, -1);	Arrays.fill(cy, -1);	Arrays.fill(wx, -1);	Arrays.fill(wy, -1);
			if((W|H)==0)	break;
			char[][] c=new char[W][H];
			for(int y=0; y<H; y++){
				String line=sc.next();
				for(int x=0; x<W; x++){
					c[x][y]=line.charAt(x);
					if(c[x][y]=='@'){
						sx=x;	sy=y;
					}else if(c[x][y]=='c'){
						cx[cc]=x;	cy[cc]=y;
						cc++;	c[x][y]='.';
					}else if(c[x][y]=='w'){
						wx[ww]=x;	wy[ww]=y;
						ww++;	c[x][y]='.';
					}
				}
			}
			LinkedList<DC> open=new LinkedList<DC>();
			open.add(new DC(0,sx,sy,cx,cy,wx,wy));
			HashSet<DC> close=new HashSet<DC>();
			close.add(new DC(0,sx,sy,cx,cy,wx,wy));
			int ans=INF;
			while(!open.isEmpty()){
				DC now=open.poll();
				for(int i=0; i<4; i++){
					int xx=now.x+vx[i],yy=now.y+vy[i];
					if(c[xx][yy]=='#')	continue;
					if(now.panel(xx, yy)>=0)	continue;
					DC next=new DC(now.step+1,xx,yy,now.cx,now.cy,now.wx,now.wy);
					if(close.contains(next)){
						//System.out.println("CONT:"+xx+" "+yy+" "+(now.step+1));
						continue;
					}
					int cidx=now.container(xx, yy);
					if(cidx>=0){
						if(c[xx+vx[i]][yy+vy[i]]!='#' && now.container(xx+vx[i], yy+vy[i])<0){
							int xxx=xx,yyy=yy;
							int[] wwx=now.wx.clone(),wwy=now.wy.clone(),ccx=now.cx.clone(),ccy=now.cy.clone();
							while(true){
								xxx+=vx[i];	yyy+=vy[i];
								int pidx=now.panel(xxx, yyy);
								if(pidx>=0){
									wwx[pidx]=-1;	wwy[pidx]=-1;
									ccx[cidx]=-1;	ccy[cidx]=-1;
									break;
								}
								if(now.container(xxx, yyy)>=0){
									ccx[cidx]=xxx-vx[i];	ccy[cidx]=yyy-vy[i];
									break;
								}
								if(c[xxx][yyy]=='#'){
									ccx[cidx]=xxx-vx[i];	ccy[cidx]=yyy-vy[i];
									break;
								}
							}
							DC next2=new DC(now.step+1,xx,yy,ccx.clone(),ccy.clone(),wwx.clone(),wwy.clone());
							open.add(next2);
							close.add(next2);
							DC next3=new DC(now.step+1,xx,yy,ccx.clone(),ccy.clone(),wwx.clone(),wwy.clone());
							open.add(next3);
							close.add(next3);
						}
						continue;
					}
					if(c[xx][yy]=='E'){
						ans=min(ans,now.step+1);
						break;
						//continue;
					}
					//System.out.println(xx+" "+yy+" "+(now.step+1));
					open.add(next);
					close.add(next);
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
		int[] cx,cy,wx,wy;
		public DC(int step,int x,int y,int[] cx,int[] cy,int[] wx,int[] wy) {
			this.step = step; this.x = x; this.y = y;
			this.cx=cx; this.cy=cy; this.wx=wx; this.wy=wy;
		}
		int panel(int x,int y){
			for(int i=0; i<3; i++)	if(this.wx[i]==x && this.wy[i]==y)	return i;
			return -1;
		}
		int container(int x,int y){
			for(int i=0; i<3; i++)	if(this.cx[i]==x && this.cy[i]==y)	return i;
			return -1;
		}
		@Override public boolean equals(Object o){
			if(o.getClass()!=this.getClass())	return false;
			DC oth=(DC)o;
			if(this.x==oth.x && this.y==oth.y && this.step>=oth.step){
				if(Arrays.equals(this.cx, oth.cx) && Arrays.equals(this.cy, oth.cy) && Arrays.equals(this.wx, oth.wx) && Arrays.equals(this.wy, oth.wy)){
					return true;
				}
			}
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