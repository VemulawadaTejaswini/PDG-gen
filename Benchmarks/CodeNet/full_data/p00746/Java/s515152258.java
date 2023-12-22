import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while (true) {

			final int N = sc.nextInt();
			
			if(N == 0){
				break;
			}
			
			int[] x_pos = new int[N];
			int[] y_pos = new int[N];
			
			x_pos[0] = 0;
			y_pos[0] = 0;
			
			for(int i = 1; i < N; i++){
				final int num = sc.nextInt();
				final int t = sc.nextInt();
				
				x_pos[i] = x_pos[num] + (t == 0 ? -1 : t == 2 ? 1 : 0);
				y_pos[i] = y_pos[num] + (t == 1 ? 1 : t == 3 ? -1 : 0);
			}
			
			int x_max = Integer.MIN_VALUE, x_min = Integer.MAX_VALUE;
			int y_max = Integer.MIN_VALUE, y_min = Integer.MAX_VALUE;
			
			for(int i = 0; i < N; i++){
				x_max = Math.max(x_max, x_pos[i]);
				x_min = Math.min(x_min, x_pos[i]);
				y_max = Math.max(y_max, y_pos[i]);
				y_min = Math.min(y_min, y_pos[i]);
			}
			
			System.out.println((Math.abs(x_max - x_min) + 1) + " " + (Math.abs(y_max - y_min) + 1));
		}
	}

}