import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0262().doIt();
	}

	class AOJ0262{
		int n,m;
		int[] masu;
		int[] map;
		boolean went_0;

		boolean dfs(int index,int cost){
//			System.out.println(index+" "+cost);
			index = index+masu[index];
			if(index<0)index = 0;
			if(index==0)went_0=true;
			if(index>n)return true;
			if(map[index]<cost)return false;
			map[index] = cost;
			for(int i=1;i<=m;i++){
				if(dfs(index+i, cost+1))return true;
			}
			return false;
		}

		void doIt(){
			while(true){
				m = in.nextInt();
				if(m==0)break; 
				n = in.nextInt();
				masu = new int[n+505];
				for(int i=1;i<=n;i++)masu[i] = in.nextInt();
				boolean sw = false;
				map = new int[n+505];
				for(int i=1;i<=n;i++){
					Arrays.fill(map, Integer.MAX_VALUE);
					went_0 = false;
					sw = dfs(i,0);
					if(went_0==true)continue;
					if(sw==false&&went_0==false)break;
				}
				System.out.println(sw? "OK":"NG");
			}
		}
	}

}