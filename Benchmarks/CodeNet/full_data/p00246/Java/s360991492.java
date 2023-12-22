import java.util.Arrays;
import java.util.Scanner;



public class Main {
	
	int nap[];
	int target = 10;
	int max_depth;
	
	void dfs(int g, int depth, int index){
		if(g==target){
			if(max_depth < depth){
				max_depth = depth;
			}
		}
		for(int i=index; i<nap.length; ++i){
			int tmp = nap[i];
			if(10<g+tmp){break;}	//sortしたから
			dfs(g+tmp, depth+1, i+1);
		}
	}
	
	int solve(){
		dfs(0, 0, 0);
		return max_depth;
	}
	
	void io(){
		java.util.Scanner sc = new Scanner(System.in);
		while(true){
			final int n = sc.nextInt();
			if(n==0){ break; }
			nap = new int[n];
			max_depth=0;
			for(int i=0; i<n; ++i){
				nap[i] = sc.nextInt();
			}
			Arrays.sort(nap);
			System.out.println(solve());
		}
	}
	
	public static void main(String[] args) {
		new Main().io();
	}
}