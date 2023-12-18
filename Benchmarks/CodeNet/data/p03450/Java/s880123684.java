import java.util.*;

//087D
public class Main {
	
	static int N, M, visited[];
	static long position[];
	static List<ArrayList<int[]>> to;
	static Queue<Integer> q;
	static long INF = Long.MAX_VALUE/2;
	static boolean out = false;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); M = sc.nextInt();
		to = new ArrayList<ArrayList<int[]>>();
		for(int i=0;i<N;i++)to.add(new ArrayList<int[]>());
		for(int i=0;i<M;i++) {
			int L = sc.nextInt()-1, R = sc.nextInt()-1, D = sc.nextInt();
			int tmp[] = {R, D};
			int rtmp[] = {L, -D};
			to.get(L).add(tmp);
			to.get(R).add(rtmp);
		}
		sc.close();
		
		visited = new int[N];
		position = new long[N];
		Arrays.fill(position, INF);
		for(int i=0;i<N;i++) {
			if(visited[i]==1)continue;
			position[i]=0;
			dfs(i, -1);
			
		}
		if(!out) System.out.println("Yes");
	}
	
	
	static void dfs(int now, int parent) {
		if(out) return;
		visited[now]=1;
		List<int[]> nexts = (List<int[]>) to.get(now);
		for(int[] nextArr : nexts) {
			if(out) return;
			int next = nextArr[0];
			int nextDist = nextArr[1];
			if(next == parent)continue;
			if(position[next]==INF)position[next]=position[now]+nextDist;
			else if(position[next]!=position[now]+nextDist) {
				out = true;
				System.out.println("No");
				return;
			}
			if(visited[next]!=1) dfs(next, now);
		}
	}
	
	
}
