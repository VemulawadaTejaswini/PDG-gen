import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int N = sc.nextInt();
			
			if(N == 0){
				break;
			}
			
			int b_nums[] = new int[N];
			int x_nums[] = new int[N];
			int y_nums[] = new int[N];
			
			for(int i = 0; i < N; i++){
				b_nums[i] = sc.nextInt();
				x_nums[i] = sc.nextInt();
				y_nums[i] = sc.nextInt();
			}
			
			double adj[][] = new double[N][N];
			
			for(int i = 0; i < N; i++){
				for(int j = i+1; j < N; j++){
					if((x_nums[i] - x_nums[j])*(x_nums[i] - x_nums[j]) + (y_nums[i] - y_nums[j])*(y_nums[i] - y_nums[j]) <= 2500){
						adj[i][j] = adj[j][i] = Math.sqrt((x_nums[i] - x_nums[j])*(x_nums[i] - x_nums[j]) + (y_nums[i] - y_nums[j])*(y_nums[i] - y_nums[j]));
					}else{
						adj[i][j] = adj[j][i] = Integer.MAX_VALUE;
					}
				}
			}
			
			int M = sc.nextInt();
			for(int i = 0; i < M; i++){
				int start = sc.nextInt() - 1;
				int end = sc.nextInt() - 1;
				
				double costs[] = new double[N];
				boolean visited[] = new boolean[N];
				Arrays.fill(costs, Integer.MAX_VALUE);
				
				int prev[] = new int[N];
				
				costs[start] = 0;
				prev[start] = -1;
				
				for(int j = 0; j < N; j++){
					double min = Integer.MAX_VALUE;
					int min_num = -1;
					
					for(int k = 0; k < N; k++){
						if(!visited[k] && costs[k] < Integer.MAX_VALUE && min > costs[k]){
							min = costs[k];
							min_num = k;
						}
					}
					
					if(min_num == -1){
						break;
					}
					
					visited[min_num] = true;
					
					for(int k = 0; k < N; k++){
						if(!visited[k] && adj[min_num][k] + costs[min_num] < costs[k]){
							costs[k] = adj[min_num][k] + costs[min_num];
							prev[k] = min_num;
						}
					}
				}
				
				if(costs[end] < Integer.MAX_VALUE){
					StringBuilder b = new StringBuilder();
					int pos = end;
					b.append(b_nums[end]);
					while(prev[pos] != -1){
						b.insert(0," ");
						b.insert(0,b_nums[prev[pos]]);
						pos = prev[pos];
					}
					
					System.out.println(b);
				}else{
					System.out.println("NA");
				}
				
			}
			
		}
		
	}

}