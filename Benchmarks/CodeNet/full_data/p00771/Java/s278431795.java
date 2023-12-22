import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static double EPS = 1e-5;
	
	public static int[][] move_dir = new int[][]{
		{0, 0},
		{1, 0},
		{0, 1},
		//{1, 1},
		{-1, 0},
		{0, -1},
		//{-1, -1}
	};
	
	public static double check(final int start_pos, final int n, ArrayList<Double> xs, ArrayList<Double> ys, ArrayList<Double> rs){
		double x_pos = start_pos >= 0 ? xs.get(start_pos) : 0;
		double y_pos = start_pos >= 0 ? ys.get(start_pos) : 0;
		
		double z2_pos = 0;
		while(true){
			boolean updated = false;
			double max_z2_pos = 0;
			double sx = 0, sy = 0;
			
			for(int move[] : move_dir){
				final double next_x_pos = x_pos + move[0] * EPS;
				final double next_y_pos = y_pos + move[1] * EPS;
				double current_z2 = Double.MAX_VALUE;
				
				for(int i = 0; i < n; i++){
					final double dx = Math.abs((next_x_pos - xs.get(i)));
					final double dy = Math.abs((next_y_pos - ys.get(i)));
					final double r2 = rs.get(i) * rs.get(i);
					final double dr2 = dx * dx + dy * dy;
					double z2 = r2 - dr2;
					
					current_z2 = Math.min(current_z2, z2);
				}
				
				if(max_z2_pos < current_z2){
					max_z2_pos = current_z2;
					sx = move[0] * EPS;
					sy = move[1] * EPS;
				}
			}
			
			if(max_z2_pos > z2_pos){
				updated = true;
				z2_pos = max_z2_pos;
				x_pos += sx;
				y_pos += sy;
			}
			
			if(!updated){
				break;
			}
		}
		
		final double z_pos = Math.sqrt(z2_pos);
		//System.out.println(start_pos + ": " + "(" + x_pos + ", " + y_pos + ", " + z_pos + ")");
		return z_pos;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true){
			final int n = sc.nextInt();
		
			if(n == 0){
				break;
			}
			
			ArrayList<Double> xs = new ArrayList<Double>();
			ArrayList<Double> ys = new ArrayList<Double>();
			ArrayList<Double> rs = new ArrayList<Double>();
			
			for(int i = 0; i < n; i++){
				xs.add(sc.nextDouble());
				ys.add(sc.nextDouble());
				rs.add(sc.nextDouble());
			}
			
			double z_pos = check(-1, n, xs, ys, rs);
			
			System.out.println(z_pos);
		}
		
		sc.close();
	}
}