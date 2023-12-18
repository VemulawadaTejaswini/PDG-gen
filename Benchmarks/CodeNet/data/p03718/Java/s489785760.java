import java.util.*;

public class Main {
	static final int INF=Integer.MAX_VALUE;
	static boolean[] used;
	static int flow;
	
	static int V;//頂点
	static int E;//辺
	
	static int H;
	static int W;
	static int s;
	static int t;
	
	static char[][]S;
	
	static List<List<edge>> G;//listの二重構造で隣接リスト実現
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc= new Scanner(System.in);
		
		H= sc.nextInt();
		W= sc.nextInt();
		V= H+W+2;
		
		s= 0;
		t=H+W+1;
		
		S= new char[H][W];
		
		G= new ArrayList<>();
		for(int i=0;i<V;i++)G.add(new ArrayList<>());
		
		
		for(int i=0;i<H;i++)	S[i]= sc.next().toCharArray();
		
		sc.close();
		
		if(check(S)){//sからtまでひと飛びで行ける位置関係なら−１
			System.out.println(-1);
		}
		else{
			
		
		//Gの作成。S[]が0originだから、x,yそれぞれ+1することに注意 
		for(int i=0;i<H;i++){
			for(int j=0;j<W;j++){
				char com= S[i][j];
				
				int y=i+1;
				int x=H+ j+1;
				
				switch(com){
				case '.':
					break;
				case 'o'://無向グラフだから双方向に繋ぐ
					addedge(y,x,1);
					addedge(x,y,1);
					break;
				case 'S':
					addedge(s,y,INF);
					addedge(s,x,INF);
					break;
				case 'T':
					addedge(y,t,INF);
					addedge(x,t,INF);
					break;
				}
			}
		}
		
		
		
		int ans= max_flow(s,t);
		
		
		System.out.println(ans);
		
		}
		
	}
	
	
	static void addedge(int from,int to,int cap){
		G.get(from).add(new edge(to,cap,G.get(to).size()));
		//同時に逆辺も辿れるようにするため、に双方向に紐をつける。
		G.get(to).add(new edge(from,0,G.get(from).size()-1));
	}
	
	static boolean check(char[][]S){
		boolean res=false;
		int Sx= 0;
		int Sy= 0;
		int Tx= 0;
		int Ty= 0;
		for(int i=0;i<H;i++){
			for(int j=0;j<W;j++){
				char com= S[i][j];
				
				if(com=='S'){
					Sy=i;
					Sx=j;
				}
				if(com=='T'){
					Ty= i;	
					Tx= j;
			}	
		}
	}
		if(Sy ==Ty ||Sx== Tx)res= true;
		
		return res;
}
	
	static int dfs(int v,int t,int f){
		if(v == t)return f;//tまでたどり着いた
		
		used[v] = true;
		
		for(int i=0;i<G.get(v).size();i++){
			edge e =G.get(v).get(i);
			
			if(used[e.to] != true && e.cap >0){
				int d= dfs(e.to,t,Math.min(f, e.cap));
				//min(f,e.cap)はまだ流す量を決めている段階。暫定の流量
				
				if(d>0){//tまでたどり着いた(流せる)時
				//v==tのreturn fを受けて、ここで初めてf(=d)を流す
					e.cap-= d;
					G.get(e.to).get(e.rev).cap += d;//直接逆辺のcを変化させて、
					return d;//各辺でdを流すために戻る。　
				}	
			}	
		}
			return 0;
			
	}
		

	static int max_flow(int s,int t) {
		int flow= 0;
		
		
		while(true){
			used =new boolean[V];
			
			int f= dfs(s,t,INF);
			if(f == 0){
				//if(arrive= false)return -1;
				return flow;//if(もうこれ以上流せない)return
			}
			flow +=f;
		}
		
	}

}
class edge {
	
	int to;
	int cap;
	int rev;//逆辺にアクセスする
	
	edge(int to,int cap,int rev){
		this.to =to;
		this.cap =cap;
		this.rev =rev;
	}
}