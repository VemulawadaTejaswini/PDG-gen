import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	class p{
		int x;
		int y;
		p(int x,int y){
			this.x = x;
			this.y = y;
		}
		final int[] gx = {-1,0,1,-2,2,-2,2,-2,2,-1,0,1};
		final int[] gy = {-2,-2,-2,-1,-1,0,0,1,1,2,2,2};
		LinkedList<p> canGoDo(p nextSp){
			LinkedList<p> ret = new LinkedList<Main.p>();
			for(int i = 0; i < gx.length;i++){
				p c= new p(	x + gx[i],y + gy[i]);
				if(nextSp.in(c)) ret.add(c);
			}
			return ret;
		}
		
		boolean in(p a){
			if(a.x<0) return false;
			if(a.y<0) return false;
			if(a.x>9) return false;
			if(a.y>9) return false;
			if(Math.abs(a.y-y)<=1 && Math.abs(a.x-x)<=1) return true;
			return false;
		}
	}
	void run(){
		for(;;){
			int x0 = sc.nextInt();
			int y0 = sc.nextInt();
			if((x0|y0) == 0)
				break;
			p start = new p(x0, y0);
			int n = sc.nextInt();
			p []sp = new p[n];
			for(int i = 0; i<n;i++){
				sp[i] = new p(sc.nextInt(),sc.nextInt());				
			}
			
			int now = 0;
			LinkedList<p> q = new LinkedList<Main.p>();
			q.add(start);
			String ret = "NA";
			for(;!q.isEmpty();){
				if(now >= n){
					ret = "OK";
					break;
				}
				LinkedList<p> nq = new LinkedList<Main.p>();
				for(p z: q){
					LinkedList<p> c = z.canGoDo(sp[now]);
					for(p w:c){
						if(!nq.contains(w)){
							nq.add(w);
						}
					}
				}
				q = nq;
				now++;
			}
			System.out.println(ret);
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}