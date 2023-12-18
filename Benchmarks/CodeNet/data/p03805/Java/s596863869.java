import java.util.*;
 
public class Main{
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] route = new int[2*M][2];
		boolean[] used = new boolean[N];
		used[0] = true;
		for(int i=0; i<M; i++){
			route[2*i][0] = sc.nextInt()-1;
			route[2*i][1] = sc.nextInt()-1;
			route[2*i+1][0] = route[2*i][1];
			route[2*i+1][1] = route[2*i][0];
		}
 
		int ans = dfs(route,0,used);
		System.out.println(ans);
		return;
	}
 
	public static int dfs(int[][] route,int start,boolean[] used){
		boolean check = true;
		for(int i=0; i<used.length; i++){
			check = check & used[i];
		}
 
		if(check) return 1;
		else{
			int ret = 0;
			for(int i=0; i<route.length; i++){
				if(route[i][0] == start && !used[route[i][1]]){
					used[route[i][1]] = true;
					ret += dfs( route,route[i][1],used);
					used[route[i][1]] = false;
				}
			}
			return ret;
		}
	}
}