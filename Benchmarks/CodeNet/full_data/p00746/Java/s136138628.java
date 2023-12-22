import java.util.Scanner;


public class Main {
	
	public static final int[][] move_dir= new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int N = sc.nextInt();
			
			if(N == 0){
				break; 
			}
			
			int[] x_pos = new int[N];
			int[] y_pos = new int[N];
			
			int x_min = 0, y_min = 0, x_max = 0, y_max = 0;
			
			for(int i = 1; i < N; i++){
				final int pos = sc.nextInt();
				final int d = sc.nextInt();
				
				x_pos[i] = x_pos[pos] + move_dir[d][0];
				y_pos[i] = y_pos[pos] + move_dir[d][1];
				
				x_min = Math.min(x_min, x_pos[i]);
				x_max = Math.max(x_max, x_pos[i]);
				y_min = Math.min(y_min, y_pos[i]);
				y_max = Math.max(y_max, y_pos[i]);
			}
			
			System.out.println((x_max - x_min + 1) + " " + (y_max - y_min + 1));
		}
		
		sc.close();
	}

}