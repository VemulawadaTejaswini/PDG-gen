
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int N = sc.nextInt();
			
			if(N == 0){
				break;
			}
			
			int sum = 0;
			
			for(int i = 0; i < N; i++){
				int rank = 0;
				
				final int x = sc.nextInt();
				final int y = sc.nextInt();
				final int h = sc.nextInt();
				
				int scale_rank = ((Math.max((x+y+h) - 60, 0)) - 1) / 20;

				if(scale_rank > rank){
					rank = scale_rank;
				}
				
				final int weight = sc.nextInt();
				
				int weight_rank = weight <= 2 ? 0 : (weight - 1) / 5 + 1;

				if(weight_rank > rank){
					rank = weight_rank;
				}
				
				if(rank < 6){
					sum += 200*rank + 600;
				}
			}
			
			System.out.println(sum);
			
			
		}
		
	}

}