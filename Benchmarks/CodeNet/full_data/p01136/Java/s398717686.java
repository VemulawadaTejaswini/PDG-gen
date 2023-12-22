import java.util.*;


public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n=sc.nextInt();
			if(n==0)break;
			//List<ArrayList<Integer>> schedule = new ArrayList<ArrayList<Integer>>();
			long[] who = new long[30];//i日目の地図
			Arrays.fill(who, 1);
			String[] st_i = new String[30];
			Arrays.fill(st_i, "");
			long[][] dp = new long[30+1][n+1];
			int p,q;
			for(int i=1;i<n+1;i++){
				p=sc.nextInt();
				//ArrayList<Integer> date = new ArrayList<Integer>();
				for(int j=0;j<p;j++){
					q=sc.nextInt();
					long ppp = 1 << i;
					who[q] += ppp;
					st_i[q] +=i+" ";
				}
			}

			for(int i=1;i<31;i++){
				Scanner scc = new Scanner(st_i[i-1]);
				//int check = scc.nextInt();
				int j=1;
				while(scc.hasNext()){
					int check = scc.nextInt();
					for(;;){
						if(check==j){
							dp[i][j] =who[i-1];
							break;
						}else{
							j++;
						}
					}
				}
			}
			long bitc;
			int result=0;
			for(int i=1;i<31;i++){
				for(int j=1;j<n+1;j++){
					if(dp[i][j]!=0){
						dp[i][j] = dp[i][j] | dp[i-1][j];
						long change = dp[i][j];
					}else{
						dp[i][j] = dp[i-1][j];
					}
					bitc = Long.bitCount(dp[i][j]);
					System.out.println("i="+i+" j="+j+" bitc="+bitc+" dp="+dp[i][j]);
					if(bitc == n){
						result = i;
						break;
					}
				}
				if(result!=0) break;
			}
			if(result == 0) result = -1;
			System.out.print(result);
		}
	}
}