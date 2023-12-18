import java.util.*;

public class Main{
	static private Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		int n = sc.nextInt();
		int u = sc.nextInt();
		int v = sc.nextInt();
		--u;
		--v;
		
		ArrayList<ArrayList<Integer>> nodeMap = getInitialMap(n);
		
		for(int i = 1; i < n; ++i){
			int a = sc.nextInt();
			int b = sc.nextInt();
			--a;
			--b;
			nodeMap.get(a).add(b);
			nodeMap.get(b).add(a);
		}
		
		/*for(int i = 0; i < n; ++i){
			System.out.println(nodeMap.get(i));
		}*/
		
		ArrayList<Integer> distanceFromU = getInitialDistance(n);
		distanceFromU.set(u, 0);
		dfs(u, distanceFromU, nodeMap);
		
		ArrayList<Integer> distanceFromV = getInitialDistance(n);
		distanceFromV.set(v, 0);
		dfs(v, distanceFromV, nodeMap);
		
		/*for(int i = 0; i < n; ++i){
			System.out.println("Distance between " + i + " and " + u + " = " + distanceFromU.get(i));
		}
		
		for(int i = 0; i < n; ++i){
			System.out.println("Distance between " + i + " and " + v + " = " + distanceFromV.get(i));
		}*/
		
		int ans = 0;
		for(int i = 0; i < n; ++i){
			if(nodeMap.get(i).size() > 1) continue;
			
			if(distanceFromU.get(i) <= distanceFromV.get(i)){
				ans = Math.max(ans, distanceFromU.get(i));
			}
		}
		System.out.println(ans);
	}
	
	static ArrayList<ArrayList<Integer>> getInitialMap(int n){
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		for(int i = 0; i < n; ++i){
			res.add(new ArrayList<Integer>());
		}
		return res;
	}
	
	static ArrayList<Integer> getInitialDistance(int n){
		ArrayList<Integer> res = new ArrayList<>();
		for(int i = 0; i < n; ++i){
			res.add(-1);
		}
		return res;
	}
	
	static void dfs(int current, ArrayList<Integer> distance, ArrayList<ArrayList<Integer>> nodeMap){
		for(int i = 0; i < nodeMap.get(current).size(); ++i){
			int nextNode = nodeMap.get(current).get(i);
			if(distance.get(nextNode) < 0){
				distance.set(nextNode, distance.get(current) + 1);
				dfs(nextNode, distance, nodeMap);
			}
		}
	}
}