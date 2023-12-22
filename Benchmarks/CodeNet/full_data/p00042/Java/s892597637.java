import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			int casenum=0;
			while(sc.hasNext()) {
				int W=sc.nextInt();
				int N=sc.nextInt();
				if(W==0) break;
				casenum++;
				int[] dp=new int[1010];
				int v, w;
				int sum=0, max=0;
				for(int i=0; i<N; i++) {
					String str=sc.next();
					String[] token=str.split(",");
					v=Integer.parseInt(token[0]);
					w=Integer.parseInt(token[1]);
					sum+=w;
					for(int j=Math.min(W, sum); j>=w; j--) {
						dp[j]=Math.max(dp[j], dp[j-w]+v);
						max=Math.max(dp[j], max);
					}
				}
				
				System.out.println("Case "+casenum+":");
				System.out.println(max);
				for(int i=0; i<=W; i++) {
					if(dp[i]==max) {
						System.out.println(i);
					}
				}
			}
		}
	}
} 
