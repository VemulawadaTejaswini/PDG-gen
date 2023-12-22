import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ2399().doIt();
	}

	class AOJ2399{
		int n,m;
		ArrayList<ArrayList<Integer>> list;
		int[] target;
		HashSet<Integer> set;
		void solve(){
			set = new HashSet<Integer>();
			for(int i=0;i<m;i++)set.add(target[i]);
			boolean[] who = new boolean[n];
			for(int i=0;i<n;i++){
				int cnt = 0;
				for(int s=0;s<list.get(i).size();s++)if(set.contains(list.get(i).get(s)))cnt++;
				if(cnt==m)who[i] = true;
			}
			int cnt = 0;
			int memo = -1;
			for(int i=0;i<n;i++)if(who[i]){
				memo = i+1;cnt++;
			}
			if(cnt!=1)System.out.println("-1");
			else System.out.println(memo);
		}
		
		void doIt(){
			while(in.hasNext()){
				n = in.nextInt();
				if(n==0)break;
				list = new ArrayList<ArrayList<Integer>>();
				for(int i=0;i<n;i++){
					list.add(new ArrayList<Integer>());
					int k = in.nextInt();
					for(int s=0;s<k;s++)list.get(i).add(in.nextInt());
				}
				m = in.nextInt();
				target = new int[m];
				for(int i=0;i<m;i++)target[i] = in.nextInt();
				solve();
			}
		}
	}
}