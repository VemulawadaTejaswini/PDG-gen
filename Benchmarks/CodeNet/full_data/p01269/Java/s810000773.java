import java.awt.geom.Point2D;
import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj2151().doIt();
    }
    class aoj2151{
    	Ee d_e[][] = new Ee[101][101];
    	int dist[][] = new int[101][101];
    	int INF = Integer.MAX_VALUE/2;
    	PriorityQueue<Pos> q = new PriorityQueue<Pos>();
    	int dikstra(int N,int L){
    		int result = Integer.MAX_VALUE;
    		for(int i = 0;i < N;i++)Arrays.fill(dist[i], INF);
    		dist[0][L] = 0;
    		while(q.size() > 0){
    			Pos p = q.remove();
//    			System.out.println(p.v+" "+p.money+" "+p.enemy);
    			if(p.v == N-1)result = Math.min(result, p.enemy);
    			for(int i = 0;i < N;i++){
    				if(d_e[i][p.v].money == 0)continue;
    				if(p.v == i)continue;
    				if(p.money < d_e[i][p.v].money){
    					if(dist[i][p.money] <= p.enemy + d_e[i][p.v].enemy)continue;
    					dist[i][p.money] = p.enemy + d_e[i][p.v].enemy;
    					q.add(new Pos(i,p.money,p.enemy + d_e[i][p.v].enemy));
    				}else{
    					int mo = p.money - d_e[i][p.v].money;
    					if(dist[i][mo] > p.enemy){
    						dist[i][mo] = p.enemy;
    						q.add(new Pos(i,mo,p.enemy));
    					}
    					if(dist[i][p.money] > p.enemy + d_e[i][p.v].enemy){
    						dist[i][p.money] = p.enemy + d_e[i][p.v].enemy;
    						q.add(new Pos(i,p.money,p.enemy + d_e[i][p.v].enemy));
    					}
    				}
    			}
    		}
    		return result;
    	}
    	void set(){
    		for(int i = 0;i < 101;i++){
    			for(int j = 0;j < 101;j++){
    				d_e[i][j] = new Ee(0,0);
    			}
    		}
    	}
    	void doIt(){
    		while(true){
    			int N = sc.nextInt();
    			int M = sc.nextInt();
    			int L = sc.nextInt();
    			if(N+M+L == 0)break;
    			set();
    			q.add(new Pos(0,L,0));
    			for(int i = 0;i < M;i++){
    				int s = sc.nextInt()-1;
    				int e = sc.nextInt()-1;
    				Ee E = new Ee(sc.nextInt(),sc.nextInt());
    				d_e[s][e] = E;
    				d_e[e][s] = E;
    			}
    			System.out.println(dikstra(N,L));
    		}
        }
    	class Ee{
    		int money,enemy;
    		public Ee(int money,int enemy){
    			this.money = money;
    			this.enemy = enemy;
    		}
    	}
    	class Pos implements Comparable<Pos>{
    		int v,money,enemy;
    		public Pos(int v,int money,int enemy){
    			this.v = v;
    			this.money = money;
    			this.enemy = enemy;
    		}
    		public int compareTo(Pos o){
    			return this.enemy - o.enemy;
    		}
    	}
     }
}