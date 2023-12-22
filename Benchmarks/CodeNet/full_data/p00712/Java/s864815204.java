import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static int gcd(int x, int y){
		if(y == 0){
			return x;
		}else{
			return gcd(y, x % y);
		}
	}
	
	public static int dfs(int p, int q, int a, int n, int cur_pro, int prev_d){
		if(n < 0){
			return 0;
		}
		
		if(p == 0 && cur_pro <= a){
			//System.out.println("[" + n + "]" + " " + p + " / " + q + " [" + (cur_pro) + "]");
			return 1;
		}
		
		int sum = 0;
		
		int divide = /* a */ a / cur_pro;
		while(p * divide >= q){
			//System.out.println("[" + n +"]" + " 1 / " + divide);
			if(divide * cur_pro > a){
				divide--;
				continue;
			}else if(divide < prev_d){
				break;
			}
			
			final int upper = p * divide - q;
			final int downer = q * divide;
			
			final int common = gcd(upper, downer);
			
			sum += dfs(upper / common, downer / common, a, n - 1, cur_pro * divide, divide);
			divide--;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		//int[][][] DP = new int[801][801][];
		
		while(true){
			final int p = sc.nextInt();
			final int q = sc.nextInt();
			final int a = sc.nextInt();
			final int n = sc.nextInt();
			
			if(p == 0 && q == 0 && a == 0 && n == 0){
				break;
			}
			/*
			for(int i = 0; i <= 800; i++){
				for(int j = 0; j <= 800; j++){
					Arrays.fill(DP[i][j], -1);
				}
			}
			*/
			int sum = dfs(p, q, a, n, 1, 0);
			
			System.out.println(sum);
		}
		
	}

}