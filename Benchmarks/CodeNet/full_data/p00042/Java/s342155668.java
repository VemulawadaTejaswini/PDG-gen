
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	static class State implements Comparable<State>{
		int w, v;
		State(int w, int v){
			this.w=w;
			this.v=v;
		}
		public int compareTo(State s) {
			return this.w- s.w;
		}
	}
	
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			int casenum=0;
			while(sc.hasNext()) {
				int W=sc.nextInt();
				int N=sc.nextInt();
				if(W==0) break;
				casenum++;
				int[] dp=new int[W+1];
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
				
				PriorityQueue<State> pq=new PriorityQueue<>();
				for(int i=W-1; i>=0; i--) {
					if(dp[i]==max) {
						pq.add(new State(i, dp[i]));
					}
				}
				System.out.println("Case "+casenum+":");
				System.out.println(max);
				System.out.println(pq.remove().w);
				pq.clear();
			}
		}
	}
} 
