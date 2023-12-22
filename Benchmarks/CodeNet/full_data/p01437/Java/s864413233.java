import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		final long STACK_SIZE=8*1024*1024;
		new Thread(null, new B(), "RUN", STACK_SIZE).start();
	}
	
	class C implements Runnable{
		C(){}
		@Override public void run(){
			while(sc.hasNext()){
				line=sc.next();
				if(line.equals("#"))	break;
				solve();
			}
		}
		
		String line;
		
		void solve(){
			
//			int[][][][] 
			
		}
	}
	
	class B implements Runnable{
		B(){}
		@Override public void run(){
			while(sc.hasNext()){
				H=sc.nextInt();
				W=sc.nextInt();
				L=sc.nextLong();
				if((W|(H|L))==0)	break;
				solve();
			}
		}
		
		int W,H;
		long L;
		int[] vx={0,1,0,-1},vy={-1,0,1,0};
		String[] vv={"N","E","S","W"};
		
		void solve(){
			int sx=-1,sy=-1,sd=-1;
			boolean[][] map=new boolean[W][H];
			for(int y=0; y<H; y++){
				String line=sc.next();
				for(int x=0; x<W; x++){
					map[x][y]=(line.charAt(x)!='#');
					if(Character.isUpperCase(line.charAt(x))){
						sx=x;
						sy=y;
						switch(line.charAt(x)){
						case 'N':	sd=0;	break;
						case 'E':	sd=1;	break;
						case 'S':	sd=2;	break;
						case 'W':	sd=3;	break;
						}
					}
				}
			}
			
			ArrayList<State> rec=new ArrayList<State>();
			State last=new State(sx,sy,sd,0,0L);
			rec.add(last.clone());
			long cycle=-1L;
			int csidx=-1;
			while(true){
				int xx=last.x,yy=last.y,dd=last.d;
				while(true){
					xx=last.x+vx[dd];
					yy=last.y+vy[dd];
					if((0<=xx && xx<W && 0<=yy && yy<H) && map[xx][yy]){
						break;
					}
					dd=(dd+1)%4;
				}
				int cnt=1;
				if(last.step+cnt==L){
					// OK
					//System.out.println("ANS-A2");
					System.out.println((yy+1)+" "+(xx+1)+" "+vv[dd]);
					return;
				}
				while(true){
					
					//System.out.println(xx+","+yy+" D:"+dd);
					
					xx+=vx[dd];
					yy+=vy[dd];
					if(!(0<=xx && xx<W && 0<=yy && yy<H) || !map[xx][yy]){
						xx-=vx[dd];
						yy-=vy[dd];
						break;
					}
					++cnt;
					if(last.step+cnt==L){
						// OK
						//System.out.println("ANS-A2");
						System.out.println((yy+1)+" "+(xx+1)+" "+vv[dd]);
						return;
					}
				}
				State next=new State(xx,yy,dd,cnt,last.step+cnt);
				for(int j=0; j<rec.size(); j++){
					State s=rec.get(j);
					if(next.x==s.x && next.y==s.y && next.d==s.d){
						cycle=next.step-s.step;
						L-=next.step;
						csidx=j+1;
						break;
					}
				}
				rec.add(next);
				if(cycle>0)	break;
				last=next.clone();
			}
			
			//System.out.println("L"+L);
			//System.out.println(rec);
			
			long remain=L%cycle;
			if(remain==0){
				State s=rec.get(rec.size()-1);
				// OK
				//System.out.println("ANS-D");
				System.out.println((s.x+1)+" "+(s.y+1)+" "+vv[s.d]);
				return;
			}
			for(int i=csidx; i<rec.size(); i++){
				State s=rec.get(i);
				if(remain>s.cnt)	remain-=s.cnt;
				else if(remain==s.step){
					// ?
					//System.out.println("ANS-B");
					System.out.println((s.y+1)+" "+(s.x+1)+" "+vv[s.d]);
					break;
				}else{
					// OK
					//System.out.println("ANS-C");
					int r=(int)(remain-s.cnt),xx=s.x+(vx[s.d]*r)+1,yy=s.y+(vy[s.d]*r)+1;
					System.out.println(xx+" "+yy+" "+vv[s.d]);
					break;
				}
			}
		}
		
		class State{
			int x,y,d,cnt;
			long step;
			State(int x,int y,int d,int cnt,long step){
				this.x=x;
				this.y=y;
				this.d=d;
				this.cnt=cnt;
				this.step=step;
			}
			@Override public State clone(){
				return new State(x,y,d,cnt,step);
			}
			@Override public String toString(){
				return x+","+y+" D:"+d+" STEP:"+step;
			}
		}
	}
	
}