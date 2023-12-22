import java.util.Scanner;

public class Main {
	
	public static int compute_maxprofit(int n, int[] R) {
		int max_profit = -999999999;
		int min = R[0];
		for(int i = 1; i < n; i++) {
			if(R[i] - min > max_profit) {
				max_profit = R[i] - min;
			}
			if(R[i] < min) {
				min = R[i];
			}
		}
		
		return max_profit;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] R = new int[n];
		for(int i = 0; i < n; i++) {
			R[i] = in.nextInt();
		}
		in.close();
		System.out.println(compute_maxprofit(n, R));
	}

}
