import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//String With Rings
public class Main{

	List<Integer>[] e;
	int res;
	boolean[] v;
	
	void dfs(int k, int d){
		res = Math.max(res, d);
		for(int x:e[k])if(!v[x]){
			v[x] = true;
			dfs(x, d+1);
			v[x] = false;
		}
	}
	
	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
//		sc.nextInt();
//		long T = System.currentTimeMillis();
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			e = new List[101];
			for(int i=1;i<101;i++)e[i]=new ArrayList<Integer>();
			boolean[] u = new boolean[101];
			while(n--!=0){
				int a = sc.nextInt(), b = sc.nextInt();
				u[a] = u[b] = true;
				e[a].add(b); e[b].add(a);
			}
			v = new boolean[101];
			res = 0;
			for(int i=1;i<101;i++)if(u[i]&&e[i].size()<5){
				Arrays.fill(v, false);
				v[i] = true;
				dfs(i, 1);
			}
			System.out.println(res);
		}
//		System.out.println((System.currentTimeMillis()-T)+" ms.");
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}