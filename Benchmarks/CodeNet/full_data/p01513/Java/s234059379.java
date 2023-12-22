
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{ 
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			
			while(sc.hasNext()) {
				int n = sc.nextInt();
				if(n==0)break;
				Set<Integer> hm = new HashSet<Integer>(n);
				HashMap<Integer,Integer> h = new HashMap<>();
				boolean can = true;
				
				int[][] d = new int[n+1][n+1];
				int[] cnt = new int[n+1];
				for(int i=0;i<n;i++) {
					int a = sc.nextInt();
					for(int j=0;j<a;j++) {
						d[i][j] = sc.nextInt();
					}
					cnt[i] = a;
				}
				
				int a = sc.nextInt();
				int cc = 0;
				int[] han = new int[a+1];
				int ans = 0;
				for(int i=0;i<a;i++) {
					int o = sc.nextInt();
					han[i] = o;
					if(!h.containsKey(o))h.put(o, 1);
					else h.put(o, h.get(o)+1);
				}
				
				for(int i=0;i<n;i++) {
					hm.clear();
					can = true;
					for(int j=0;j<cnt[i];j++) {
						hm.add(d[i][j]);
					}
					
					for(int k=0;k<a;k++) {
						if(hm.contains(han[k])) {
							can = true;
							if(k==a-1)cc++;
						}
						else {
							can = false;
							break;
						}
					}
					if(can) {
						if(cc==1)
							ans = i+1;
						if(cc>1){
							can = false;
							break;
						}
					}
				}
				
				if(can || cc==1)System.out.println(ans);
				else
					System.out.println(-1);
				
			}
		}
	}
}

