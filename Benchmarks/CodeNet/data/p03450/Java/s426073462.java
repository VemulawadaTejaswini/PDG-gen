import java.util.Scanner;
import java.util.HashMap;
public class Main{
	static HashMap<Integer,Integer>[] map;
	static boolean[] r;
	static int[] t;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		map=new HashMap[n+1];
		r=new boolean[n+1];
		t=new int[n+1];
		for(int i = 0; i<=n; i++){
			map[i]=new HashMap<>();
		}
		for(int i = 0; i<m; i++){
			int l = sc.nextInt();
			int r = sc.nextInt();
			int d = sc.nextInt();
			map[l].put(r,d);
			map[r].put(l,-d);
		}
		for(int i = 1; i<=n; i++){
			if(r[i]){
				if(!dfs(i,0)){
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
	static boolean dfs(int i,int j){
		if(r[i]){
			return t[i]==j;
		}
		r[i]=true;
		t[i]=j;
		for(int k:map[i].keySet()){
			if(!dfs(k,j+map[i].get(k))){
					return false;
			}
		}
		return true;
	}
}
