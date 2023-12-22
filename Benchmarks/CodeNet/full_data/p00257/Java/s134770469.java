import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
//		new AOJ0260().doIt();
		new AOJ0262().doit();
	}
	
	class AOJ0262{
		boolean dfs(int index,int cost){
			index = masu[index]+index;
			if(index>n)return true;
			if(index<=0)return false;
			if(map[index]<cost)return false;
			map[index]=cost;
			for(int i=1;i<m;i++)if(dfs(index+i, cost+1))return true;
			return false;
		}
		int n,m;
		int[] masu;
		int[] map;
		void doit(){
			while(true){
				m = in.nextInt();
				if(m==0)break; 
				n = in.nextInt();
				masu = new int[n+60];
				for(int i=1;i<=n;i++)masu[i] = in.nextInt();
				boolean sw = false;
				map = new int[n+60];
				Arrays.fill(map, Integer.MAX_VALUE);
				for(int i=1;i<=m;i++){
					sw = dfs(i,0);
					if(sw)break;
				}
				if(sw)System.out.println("OK");
				else System.out.println("NG");
			}
		}
	}
	
	
	
	
	class AOJ0260{
		int dfs(int[] pype,int[] joynt){
			int result = 0;
			
			
			
			return result;
		}
		void doIt(){
			while(true){
				int n = in.nextInt();
				if(n==0)break;
				int pype[] = new int[n];
				int joynt[] = new int[n-1];
				for(int i=0;i<n;i++)pype[i] = in.nextInt();
				for(int i=0;i<n-1;i++)joynt[i] = in.nextInt();
				Arrays.sort(pype);
				Arrays.sort(joynt);
				int result = dfs(pype,joynt);
			}
		}
	}
	
}