import java.awt.geom.Point2D;
import java.util.*;

import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ1181();
	}
	class AOJ1181{
		int N;
		final int BASE=100,MAX=201;
		final int[] vx={0,-1,0,1},vy={1,0,-1,0};
		AOJ1181(){
			while(true){
				N=sc.nextInt();
				if(N==0)	break;
				solve();
			}
		}
		void solve(){
			int[][] field=new int[MAX][MAX];
			int[][] height=new int[MAX][MAX];
			int[] cand=new int[3];
			for(int t=0; t<N; ++t){
				Dice now=new Dice(sc.nextInt(), sc.nextInt());
				int x=BASE,y=BASE;
				while(true){
//					System.out.println(t+" "+now+" "+x+" "+y);
					if(field[x][y]==0){
						field[x][y]=now.getTop();
						height[x][y]=1;
						break;
					}
					cand[0]=cand[1]=cand[2]=-1;
					for(int i=0; i<4; ++i){
						int tmp=get(now,i);
						switch(tmp){
						case 6:	cand[0]=i;	break;
						case 5: cand[1]=i;	break;
						case 4: cand[2]=i;	break;
						}
					}
					boolean end=true;
					for(int i=0; i<3; ++i)if(cand[i]>=0){
						int xx=x+vx[cand[i]],yy=y+vy[cand[i]];
						if(height[x][y]<=height[xx][yy])	continue;
						x=xx; y=yy;
						rotate(now,cand[i]);
						end=false;
						break;
					}
					if(end){
						field[x][y]=now.getTop();
						++height[x][y];
						break;
					}
				}
			}
			int[] cnt=new int[6];
			for(int x=0; x<=200; ++x)for(int y=0; y<=200; ++y)if(field[x][y]>0)	++cnt[field[x][y]-1];
			System.out.print(cnt[0]);
			for(int i=1; i<6; ++i)	System.out.print(" "+cnt[i]);
			System.out.println();
		}
		Dice rotate(Dice d,int n){
			switch(n){
			case 0:	return d.rotateSouth();
			case 1:	return d.rotateWest();
			case 2:	return d.rotateNorth();
			case 3:	return d.rotateEast();
			}
			return null;
		}
		int get(Dice d,int n){
			switch(n){
			case 0:	return d.getSouth();
			case 1: return d.getWest();
			case 2: return d.getNorth();
			case 3: return d.getEast();
			}
			return -1;
		}
		// library dice
		class Dice{
			private int top=1,	bottom=6,
						east=5,	west=2,
						north=4,south=3;
			Dice(int t, int s){
				switch(t){
					case 1:					break;
					case 2:rotateEast();	break;
					case 3:rotateNorth();	break;
					case 4:rotateSouth();	break;
					case 5:rotateWest();	break;
					case 6:reverse();		break;
				}
				while(s!=south)	rotateCW();
			}
			Dice(){}
			Dice rotateEast(){
				int tmp=east; east=top;	top=west; west=bottom; bottom=tmp;
				return this;
			}
			Dice rotateWest(){
				int tmp=west; west=top; top=east; east=bottom; bottom=tmp;
				return this;
			}
			Dice rotateSouth(){
				int tmp=south; south=top; top=north; north=bottom; bottom=tmp;
				return this;
			}
			Dice rotateNorth(){
				int tmp=north; north=top; top=south; south=bottom; bottom=tmp;
				return this;
			}
			Dice reverse(){
				rotateNorth(); rotateNorth(); rotateCW(); rotateCW();
				return this;
			}
			Dice rotateCW(){
				int tmp=north; north=west; west=south; south=east; east=tmp;
				return this;
			}
			Dice rotateCCW(){	// counter-clockwise
				int tmp=north; north=east; east=south; south=west; west=tmp;
				return this;
			}
			int getTop(){
				return top;
			}
			int getBottom(){
				return bottom;
			}
			int getEast(){
				return east;
			}
			int getWest(){
				return west;
			}
			int getSouth(){
				return south;
			}
			int getNorth(){
				return north;
			}
			@Override public String toString(){
				return "top"+top+" north"+north+" east"+east+" south"+south+" west"+west+" bottom"+bottom;
			}
			@Override public int hashCode(){
				int h=17;
				h=h*31+top;		h=h*31+north;
				h=h*31+east;	h=h*31+south;
				h=h*31+west;	h=h*31+bottom;
				return h;
			}
			@Override public boolean equals(Object obj){
				if(obj==this)	return true;
				if(!(obj instanceof Dice))	return false;
				Dice d=(Dice)obj;
				if(	this.top==d.getTop() && this.bottom==d.getBottom() &&
					this.east==d.getEast() && this.west==d.getWest() &&
					this.north==d.getNorth() && this.south==d.getSouth())	return true;
				return false;
			}
		}
	}
}