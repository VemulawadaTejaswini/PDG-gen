import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			final int X = sc.nextInt();
			final int Y = sc.nextInt();
			final int Z = sc.nextInt();
			
			if(X == 0 && Y == 0 && Z == 0){
				break;
			}
			
			int[] numbers = new int[X];
			for(int i = 0; i < X; i++){
				numbers[i] = sc.nextInt();
			}
			
			int[] event = new int[Y + 1];
			int[] effect = new int[Y + 1];
			
			for(int i = 0; i < Z; i++){
				final int N = sc.nextInt();
				final int E = sc.nextInt();
				final int A = sc.nextInt();
				
				event[N] = E;
				effect[N] = A;
			}
			
			final int max = Y * 100;
			final double prob = 1.0 / X;
			double[][] DP = new double[Y + 1][max + 1];
			DP[0][0] = 1.0;
			
			for(int i = 0; i < Y; i++){
				//System.out.println(i + " " + DP_PROB[i] + " " + DP_MONEY[i]);
				for(int money = 0; money <= max; money++){
					if(DP[i][money] <= 0.0){
						continue;
					}
					
					for(int number : numbers){
						int next = Math.min(i + number, Y);
					
						int next_money = money;
						
						if(event[next] == 1){
							next = Math.min(next + effect[next], Y);
						}else if(event[next] == 2){
							next_money += effect[next];
						}else if(event[next] == 3){
							next_money -= effect[next];
							next_money = Math.max(next_money, 0);
						}
						
						DP[next][next_money] += DP[i][money] * prob;
					}
				}
			}
			
			double sum = 0;
			for(int i = 0; i <= max; i++){
				sum += DP[Y][i] * i;
			}
			
			System.out.println((long)(sum));
		}
		
	}

}