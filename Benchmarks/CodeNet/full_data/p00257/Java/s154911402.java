import java.util.*;

import javax.naming.spi.DirStateFactory.Result;
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
		int n,m;
		int[] masu;
		int[] map;

		boolean dfs(int index,int cost){
//			System.out.println(index+" "+cost);
			index = index+masu[index];
			if(index<0)index = 0;
			if(index>n)return true;
			if(map[index]<cost)return false;
			map[index] = cost;
			for(int i=1;i<=m;i++){
				if(dfs(index+i, cost+1))return true;
			}
			return false;
		}

		void doit(){
			while(true){
				m = in.nextInt();
				if(m==0)break; 
				n = in.nextInt();
				masu = new int[n+505];
				for(int i=1;i<=n;i++)masu[i] = in.nextInt();
				boolean sw = false;
				for(int i=1;i<=n;i++){
					map = new int[n+505];
					Arrays.fill(map, Integer.MAX_VALUE);
					sw = dfs(i,0);
					if(sw==false)break;
				}
				if(sw)System.out.println("OK");
				else System.out.println("NG");
			}
		}
	}

}