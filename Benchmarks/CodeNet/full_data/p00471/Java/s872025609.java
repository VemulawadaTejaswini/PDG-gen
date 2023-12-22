import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


//Reindeer with no sense of direction
public class Main{

	int w, h, N, GS;
	int[][] map, pos;
	int[][] d = {{-1,0},{0,1},{1,0},{0,-1}};
	List<Integer>[][] adj;
	boolean[] visited;
	Map<Integer, Integer>[][] mem;
	
	boolean check(int v){
		for(int i=0;i<=N;i++){
			if(visited[i]||i==v)continue;
			int c = 0;
			for(int k=0;k<4;k++)for(int nv:adj[i][k]){
				if(visited[nv]){
					if(nv==v)c++;
					break;
				}
				c++;
			}
//			System.out.println("ID:" +i+" C:"+c);
			if(i==N){
				if(c==0)return false;
			}
			else if(c<2)return false;
		}
		return true;
	}
	
	int dfs(int v, int S, boolean head, int rest){
//		System.out.println("V:"+v);
//		debug(visited);
		if(!head&&v==N){
			return S==GS?1:0;
		}
		if(rest<=10&&mem[rest][v].containsKey(S))return mem[rest][v].get(S);
		if(!check(v)){
//			System.out.println("CHECK OUT");
			return 0;
		}
		int res = 0;
		for(int k=0;k<4;k++)for(int nv:adj[v][k]){
			if(visited[nv])break;
			visited[nv] = true;
			res += dfs(nv, S+(1<<nv), false, rest-1);
			visited[nv] = false;
		}
		if(rest<=10)mem[rest][v].put(S, res);
		return res;
	}
	
	
	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			w = sc.nextInt(); h = sc.nextInt();
			if((w|h)==0)break;
			N = 0;
			map = new int[h][w];
			for(int i=0;i<h;i++)for(int j=0;j<w;j++){
				map[i][j] = sc.nextInt();
				if(map[i][j]==1)N++;
				else if(map[i][j]==0)map[i][j]=-1;
			}
			int id = 0;
			pos = new int[N+1][2];
			for(int i=0;i<h;i++)for(int j=0;j<w;j++){
				if(map[i][j]==-1)continue;
				if(map[i][j]==1){
					pos[id][0] = i; pos[id][1] = j;
					map[i][j]=id++;
				}
				else {
					pos[N][0] = i; pos[N][1] = j;
					map[i][j] = N;
				}
			}
			adj = new List[N+1][4];
			for(int i=0;i<=N;i++)for(int j=0;j<4;j++)adj[i][j]=new ArrayList<Integer>();
			for(int i=0;i<h;i++)for(int j=0;j<w;j++)if(map[i][j]!=-1){
				for(int k=0;k<4;k++){
					int pi = i+d[k][0], pj = j+d[k][1];
					while(0<=pi&&pi<h&&0<=pj&&pj<w){
						if(map[pi][pj]!=-1)adj[map[i][j]][k].add(map[pi][pj]);
						pi+=d[k][0]; pj+=d[k][1];
					}
				}
			}
//			for(int i=0;i<=N;i++){
//				System.out.println("V:"+i);
//				for(int k=0;k<4;k++){
//					System.out.print("Dir "+k+":");
//					for(int nv:adj[i][k])System.out.print(" "+nv);
//							System.out.println();
//				}
//			}
			mem = new Map[11][N+1];
			for(int i=0;i<=10;i++)for(int j=0;j<=N;j++)mem[i][j]=new HashMap<Integer, Integer>();
			GS = (1<<(N+1))-1;
			visited = new boolean[N+1];
//			dfs(N, 0, true);
			System.out.println(dfs(N, 0, true, N));
		}
	}
	
	void debug(Object...o){
		System.out.println(Arrays.deepToString(o));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}