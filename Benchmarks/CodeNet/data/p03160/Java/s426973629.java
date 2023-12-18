import java.util.Scanner;
 
public class Main {
 
	public int knapSack(int[] weight, int[] value, int capacity, int items) {
		
		int[][] table = new int[items+1][capacity+1];		
		
		for (int i = 0; i <=items; i++) {
			table[i][0] = 0;
		}
		
		for (int i = 0; i <= capacity; i++) {
			table[0][i] = 0;
		}
		
		for (int i = 1; i <= items; i++) {
			for (int j = 1; j <= capacity; j++) {
				
				if(j<=weight[i]) {
					int x = j-weight[i];
					table[i][j] = Math.max(table[i-1] [j], value[i]+table[i-1][x]);
				}else {
					table[i][j] = table[i-1][j];
				}
			}
		}
		return table[items][capacity];
	}
	
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] weight = new int[N];
		int[] value = new int[N];
		for (int i = 0; i < N; i++) {
			weight[i] = sc.nextInt();
			value[i] = sc.nextInt();
		}
		Main obj = new Main();
		int result = obj.knapSack(weight, value, W, N);
		System.out.println(result);
	}
}