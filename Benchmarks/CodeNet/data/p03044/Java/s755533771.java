import java.util.Scanner;
import java.util.HashMap;
public class Main{
	static boolean[] kk;
	static HashMap<Integer,Long>[] map;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		kk=new boolean[n];
		map=new HashMap[n];
		for(int i=0; i<n; i++){
			map[i]=new HashMap<>();
		}
		for(int i = 0; i<n-1; i++){
			int u = sc.nextInt();
			int v = sc.nextInt();
			long w = sc.nextLong();
			map[u-1].put(v,w);
			map[v-1].put(u,w);
		}
		dfs(-1,0,0);
		for(int i=0; i<n; i++){
			if(kk[i]){
				System.out.println(1);
			}else{
				System.out.println(0);
			}
		}
	}
	static void dfs(long sum,int r,int o){
		if(sum%2==0){
			kk[r]=true;
		}
		for(int j:map[r].keySet()){
			if(j-1!=o){
				dfs(map[r].get(j)+sum,j-1,r);
			}
		}
		return;
	}
}
