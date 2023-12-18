//067D 
import java.util.*;
public class Main {
	static int N;
	static List<ArrayList<Integer>> to;
	static List<Integer> distList;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		to = new ArrayList<>();
		for(int i=0;i<N;i++)to.add(new ArrayList<Integer>());
		for(int i=0;i<N-1;i++) {
			int a = sc.nextInt()-1, b = sc.nextInt()-1;
			to.get(a).add(b);
			to.get(b).add(a);
		}
		sc.close();
		distList = new ArrayList<>();
		dfs(0, -1);
		int size = distList.size();
		int half = (size+1)/2;
		int fen_node = distList.get(size - half);
		int sun_node = distList.get(size - half - 1);
		
		int fen = cntdfs(fen_node, -1, sun_node);
		int sun = cntdfs(sun_node, -1, fen_node);
		
		System.out.println(fen>=sun? "Fennec":"Snuke");
	}
	
	static int cntdfs (int v, int parent, int opp) {
		int res = 1;
		for(int next:to.get(v)) {
			if(next == parent || next == opp) continue;
			res += cntdfs(next, v, opp);
		}
		return res;
	}
	
	static boolean dfs(int v, int parent) {
		
		boolean pathToOpp = false;
		
		if(v == N-1) {
			distList.add(v);
			return true;
		}
		
		for(int next :to.get(v)) {
			if(next == parent)continue;
			pathToOpp = dfs(next, v);
			if(pathToOpp) {
				distList.add(v);
				break;
			}
		}
		return pathToOpp;
	}
}
