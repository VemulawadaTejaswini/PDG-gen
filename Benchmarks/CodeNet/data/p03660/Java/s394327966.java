//067D 途中だけどメモのため
import java.util.*;
public class Main {
	static int N, distFrom0[], distFromN[];
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
		
		distFrom0 = new int[N];
		distList = new ArrayList<>();
		dfs(0, -1);
		System.out.println();
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
