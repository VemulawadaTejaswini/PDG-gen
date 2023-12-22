import java.util.Scanner;

public class Main {
	
	static int N;
	static int[][] info;
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			N = in.nextInt();
			if(N==0) break;
			info = new int[N][N+1];
			for(int i=0;i<N;i++){
				for(int j=0;j<N+1;j++){
					info[i][j] = in.nextInt();
				}
			}
			int size = 1<<(N);
			int[] dp = new int[size];
			for(int i=0;i<size;i++){
				dp[i] = Integer.MAX_VALUE;
			}
			dp[0] = 0;
			for(int k=0;k<N;k++){
				int com = (1<<k)-1;
				while(com < 1<<N){
					for(int l=0;l<N;l++){
						if((com>>l & 1)==0){
							int cand = dp[com] + time(l,com);
							dp[com | 1<<l] = Math.min(dp[com|1<<l], cand);
						}
					}
					int x = com & -com;
					int y = com + x;
					if(x==0) com = 1;
					else com = ((com & ~y)/x >> 1) | y;
				}
			}
			System.out.println(dp[size-1]);
			
			System.gc();
		}
	}
	
	public static int time(int trg,int wepon){
		int time = info[trg][0];
		for(int i=0;i<N;i++){
			if((wepon>>i&1)==1){
				time = Math.min(time,info[trg][i+1]);
			}
		}
		return time;
	}
	
}