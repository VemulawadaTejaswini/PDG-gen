
import java.util.*;

public class Main{
	public class Union {
	
		private	int[] n;
		
		public Union(int n){
			
			this.n = new int[n];
			for(int i = 0; i < n; i++){
				this.n[i] = i;
			}
		}
		
		public void union(int p, int q){
			
			int child = n[p];
			int father = n[q];
			if(n[p] == n[q])return;
			for(int i = 0; i < n.length; i++){
				
				if(n[i] == child)n[i] = father; 
			}
			
		}
		
		public boolean find(int p, int q){
			
			return n[p] == n[q];
		}
		
		
	}
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);		
//		System.out.println("Please enter n");
		int n,m,i = 0;
		n = input.nextInt();
		m = input.nextInt();
	
		Union uf = new Union(n);
		
		while(i < m){
			
			int t,p,q;
			t = input.nextInt();
			p = input.nextInt(); 
			q = input.nextInt();
			
			if (t == 1){
				System.out.println(uf.find(p, q) == true ? 1 : 0);
			}
			else{
				
				uf.union(p, q);
			}
			
			i++;
		}
		

		
//		System.out.println(uf.find(m, n));
		
	}
	
}