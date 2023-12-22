import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ2199().doIt();
	}
	
	class AOJ2199{
		int n,m;
		int[] x,c;
		HashMap<String, Integer> map;
		int dfs(int y,int sum,int fase){
			if(fase==n)return sum;
			if(map.containsKey(y+" "+sum))return map.get(y+" "+sum); 
			int result = Integer.MAX_VALUE;
			for(int i=0;i<m;i++){
				int a = y+c[i];
				if(a<0)a=0;
				if(a>255)a=255;
				sum += ((x[fase]-a)*(x[fase]-a));
				result = Math.min(result, dfs(a,sum,fase+1));
				sum -= ((x[fase]-a)*(x[fase]-a));
			}
			map.put(y+" "+sum,result);
			return result;
		}
		
		void solve(){
			map = new HashMap<String, Integer>();
			System.out.println(dfs(128,0,0));
		}
		
		void doIt(){
			while(in.hasNext()){
				n = in.nextInt();
				m = in.nextInt();
				if(n+m==0)break;
				c = new int[m];
				x = new int[n];
				for(int i=0;i<m;i++)c[i] = in.nextInt();
				for(int i=0;i<n;i++)x[i] = in.nextInt();
				solve();
			}
		}
	}
	
}