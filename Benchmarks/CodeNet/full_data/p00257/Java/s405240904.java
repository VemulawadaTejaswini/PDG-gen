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
		boolean flg;
		int get_index(int index,boolean[] a){
			if(index<=0)return 0;
			if(index>n||masu[index]==0)return index;
			if(a[index]==true){
				flg = true;
				return 0;
			}
			a[index] = true;
			return get_index(index+masu[index], a);
		}
		
		boolean dfs(int index,int cost){
//			System.out.println(index+" "+cost);
			flg = false;
			index = get_index(index, new boolean[n+505]);
			if(flg)return false;
//			System.out.println(index+" "+cost);
			if(index>n)return true;
			if(index<=0)return false;
			if(map[index]<cost)return false;
			map[index]=cost;
			for(int i=1;i<=m;i++)if(dfs(index+i,cost+1))return true;
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
				masu = new int[n+505];
				for(int i=1;i<=n;i++)masu[i] = in.nextInt();
				boolean sw = false;
				map = new int[n+505];
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
	
}