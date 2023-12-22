import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			final int w = sc.nextInt();
			final int d = sc.nextInt();
			
			if(w == 0 && d == 0){
				break;
			}
			
			int[] wh = new int[21];
			int[] dh = new int[21];
			
			for(int i = 0; i < w; i++){
				wh[sc.nextInt()]++;
			}
			
			for(int i = 0; i < d; i++){
				dh[sc.nextInt()]++;
			}
			
			int cost = 0;
			for(int i = 0; i <= 20; i++){
				int dup = Math.min(wh[i], dh[i]);
				
				cost += dup * i;
				cost += (wh[i] - dup) * i;
				cost += (dh[i] ^ dup) * i;
			}
			
			System.out.println(cost);
		}
		
	}

}