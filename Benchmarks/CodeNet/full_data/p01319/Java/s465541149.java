import java.util.Arrays;
import java.util.Scanner;

//Canal: Water Going Up and Down
public class Main{

	final int OK = 0, TOLEFT = 1, TORIGHT = 2;
	final int NORMAL = 0, INGATE = 1, WAIT = 2, GOAL = 3;
	
	class G{
		int id, L, IN, OUT, type, state, ship;
		double v;
		public G(int id, int l, int f, int d, int type) {
			this.id = id;
			L = l;
			IN = f;
			OUT = d;
			this.type = type;
			v = 0;
			state = type==0?OK:TOLEFT;
			ship = -1;
		}
		double nexttime(){
			if(state==TORIGHT){
				if(type==0)return (L-v)/IN;
				else return v/OUT;
			}
			else if(state==TOLEFT){
				if(type==0)return v/OUT;
				else return (L-v)/IN;
			}
			return INF;
		}
		boolean isAcceptable(){
			if(type==0)return Math.abs(v)<EPS;
			else return Math.abs(L-v)<EPS;
		}
		boolean isRightside(){
			if(type==0)return Math.abs(L-v)<EPS;
			else return Math.abs(v)<EPS;
		}
		void proc(double t){
			if(state==OK)return;
			if(state==TOLEFT){
				if(type==0){
					double m = Math.min(t, v/OUT);
					v-=m*OUT;
					if(Math.abs(v)<EPS)v = 0;
				}
				else{
					double m = Math.min(t, (L-v)/IN);
					v+=m*IN;
					if(Math.abs(L-v)<EPS)v = L;
				}
			}
			else{
				if(type==0){
					double m = Math.min(t, (L-v)/IN);
					v+=m*IN;
					if(Math.abs(L-v)<EPS)v = L;
				}
				else{
					double m = Math.min(t, v/OUT);
					v-=m*OUT;
					if(Math.abs(v)<EPS)v = 0;
				}
			}
		}
	}
	
	class R{
		int id, V, state, target, waitgate;
		double x;
		public R(int id, int v) {
			super();
			this.id = id;
			V = v;
			x = -id;
			state = NORMAL;
			target = 0;
			waitgate = -1;
		}
		
	}
	
	double EPS = 1e-9;
	int INF = 1<<29;
	int N, M, K;
	double[] targetTime;
	G[] gate;
	R[] ships;
	int[] xs;
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			N = sc.nextInt(); M = sc.nextInt(); K = sc.nextInt();
			if((N|M|K)==0)break;
			gate = new G[N];
			ships = new R[M];
			xs = new int[N+1];
			xs[N] = K;
			for(int i=0;i<N;i++){
				xs[i] = sc.nextInt();
				gate[i] = new G(i, sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			}
//			debug(xs);
			for(int i=0;i<M;i++){
				ships[i] = new R(i, sc.nextInt());
			}
			targetTime = new double[N+1];
			double res = 0;
			while(ships[M-1].state!=GOAL){
				double t = INF;
				for(int i=0;i<N;i++)t=Math.min(t, gate[i].nexttime());
				Arrays.fill(targetTime, INF);
				for(int i=0;i<M;i++){
					if(ships[i].state!=NORMAL)continue;
					int k = ships[i].target;
					if(targetTime[k]!=INF)continue;
					targetTime[k] = (xs[k]-ships[i].x)/ships[i].V;
					t = Math.min(t, targetTime[k]);
				}
//				System.out.println("T:"+t);
				res+=t;
				for(int i=0;i<M;i++){
					if(ships[i].state!=NORMAL && ships[i].state!=GOAL)continue;
					ships[i].x = Math.min(i==0?INF:(ships[i-1].x-1), ships[i].x+ships[i].V*t);
//					System.out.println("POS:"+ships[i].x);
					if(ships[i].target<=N && Math.abs(ships[i].x-xs[ships[i].target])<EPS){
						ships[i].x = xs[ships[i].target];
						//ship i is goal
						if(ships[i].target==N){
							ships[i].state = GOAL;
						}
						else{
							ships[i].state = WAIT;
							ships[i].waitgate = ships[i].target;
							gate[ships[i].target].ship = i;
						}
						ships[i].target++;
					}
				}
				for(int i=0;i<N;i++){
					gate[i].proc(t);
					if(gate[i].state == OK){
						int sid = gate[i].ship;
						if(sid==-1)continue;
						ships[sid].state = INGATE;
						gate[i].state = TORIGHT;
					}
					else if(gate[i].state == TOLEFT){
						if(gate[i].isAcceptable()){
							int sid = gate[i].ship;
							if(sid==-1){
								gate[i].state = OK;
							}
							else{
								ships[sid].state = INGATE;
								gate[i].state = TORIGHT;
							}
						}
					}
					else if(gate[i].state == TORIGHT){
						if(gate[i].isRightside()){
							int sid = gate[i].ship;
							ships[sid].state = NORMAL;
							ships[sid].waitgate = -1;
							gate[i].ship = -1;
							gate[i].state = TOLEFT;
						}
					}
				}
			}
			System.out.printf("%.8f\n", res);
		}
	}
	
	void debug(Object...o){
		System.out.println(Arrays.deepToString(o));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}