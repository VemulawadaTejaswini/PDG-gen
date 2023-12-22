import java.util.*;
public class Main{
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			graph.add(new ArrayList<Integer>());
		}
		int m = sc.nextInt();
		for(int i=0;i<m;i++){
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		boolean[] vis = new boolean[n];
		int max=0;
		for(int i=0;i<n;i++){
			if(vis[i]==false){
				count=0;
				dfs(graph,vis,i);
				if(count>max){
					max=count;
				}
			}
		}
		System.out.println(max);

	}
	public static void dfs(ArrayList<ArrayList<Integer>> graph, boolean[] vis,int start){
		vis[start]=true;
        count++;
        for(int i=0;i<graph.get(start).size();i++){
             if(vis[graph.get(start).get(i)]==false){
             	dfs(graph,vis,graph.get(start).get(i));
             }
        }
	}
}