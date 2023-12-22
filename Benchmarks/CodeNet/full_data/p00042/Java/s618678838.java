import java.util.*;
public class Main { 
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}

	public Main(){      
		new AOJ0042();
	}
	class AOJ0042{
		//      int w,n;
		//      tresure[] takara;
		
		void print(int dp[]){
			for(int i=0;i<dp.length;i++)System.out.print(dp[i]+" ");
			System.out.println();
		}
		
		public AOJ0042() {
			int c=1;
			while(true){
				int w = in.nextInt();
				if(w==0)break;
				int n = in.nextInt();
				tresure[] takara = new tresure[n];
				for(int i=0;i<n;i++){
					String[] a = in.next().split(",");
					takara[i]=new tresure(Integer.parseInt(a[0]),Integer.parseInt(a[1]));
				}
				int[] dp = new int[w+1];
				for(int s=0;s<n;s++){
					int[] a = Arrays.copyOf(dp,w+1);
					for(int i=0;i<=w;i++)if(a[i]>0){
						if(takara[s].heavy+i<=w)dp[takara[s].heavy+i]=Math.max(a[takara[s].heavy+i],a[i]+takara[s].money);
					}
					if(takara[s].heavy<=w)dp[takara[s].heavy]=Math.max(dp[takara[s].heavy],takara[s].money);
//					print(dp);
				}
				int max_heavy=0;
				int max_money=0;
				for(int i=0;i<=w;i++)if(max_money<dp[i]){
					max_money=dp[i];
					max_heavy=i;
				}
				System.out.println("Case "+c+":");
				c++;
				System.out.println(max_money);
				System.out.println(max_heavy);
			}
		}
		class tresure{
			int money,heavy;
			public tresure(int money,int heavy) {
				this.money=money;
				this.heavy=heavy;
			}
		}
	}
}