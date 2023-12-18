import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner io = new Scanner(System.in);
		int N = io.nextInt();
		int M = io.nextInt();
		int[][] edge = new int[M][3];
		for(int i=0;i<M;i++){
			edge[i][0]=io.nextInt()-1;
			edge[i][1]=io.nextInt()-1;
			edge[i][2]=io.nextInt();
		}
		
		long[] cost = new long[N];
		cost[0] = 0;
		for(int i=1;i<N;i++){
			cost[i] = Long.MIN_VALUE;
		}
		
		boolean update = true;
		int count = 0;
		while(update && count<N-1){
			update = false;
			for(int i=0;i<M;i++){
				if(cost[edge[i][1]]<cost[edge[i][0]]+edge[i][2]){
					update = true;
					cost[edge[i][1]] = cost[edge[i][0]]+edge[i][2];
				}
			}
			count ++;
		}
		if(update){
			System.out.println("inf");
			return;
		}else{
			System.out.println(cost[N-1]);
		}
		
	}
}