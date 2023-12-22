import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		//		new AOJ0262().doIt();
		while(in.hasNext())new AOJ0261().doIt();
	}

	class AOJ0261{
		void doIt(){
			int n = in.nextInt();
			if(n==0)return;
			ArrayList<Integer> p = new ArrayList<Integer>();
			ArrayList<Integer> j = new ArrayList<Integer>();
			for(int i=0;i<n;i++)p.add(in.nextInt());
			for(int i=0;i<n-1;i++)j.add(in.nextInt());
			Collections.sort(j);
			Collections.reverse(j);
			Collections.sort(p);
			Collections.reverse(p);
			//deba
//			System.out.println(p);
//			System.out.println(j);
			int sum=p.get(0);
			int kei = 0;//ここから引いていく
			for(int i=0;i<p.size();i++)kei+=p.get(i);
			int memo = kei*n;
			kei-=p.get(0);
			for(int i=0;i<j.size();i++){
				int a = sum+j.get(i)+p.get(i+1);
				int b =((kei-p.get(i+1))+a)*(j.size()-i);
				if(memo<b){
					kei-=p.get(i+1);
					memo = b;
					sum = a;
				}else break;
			}
			System.out.println(memo);
		}
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
					sw = dfs(i,0);
					if(sw==false)break;
				}
				System.out.println(sw? "OK":"NG");
			}
		}
	}

}