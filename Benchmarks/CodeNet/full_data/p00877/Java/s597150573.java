import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static final int TRY = 500000;
	public static final double EPS = 1E-10;
	public static final double R = 1E-4;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			
			int[] x_pos = new int[n + m];
			int[] y_pos = new int[n + m];
			
			for(int i = 0; i < n + m; i++){
				x_pos[i] = sc.nextInt();
				y_pos[i] = sc.nextInt();
			}
			
			double weight_x = Math.random() * 5000;
			double weight_y = Math.random() * 5000;
			double weight_const = Math.random() * 5000;
			
			boolean failed = false;
			int count = 0;
			do{
				failed = false;
				
				//System.out.println(count + " " + EPS + " " + R);
				//System.out.println(weight_x);
				//System.out.println(weight_y);
				
				for(int i = 0; i < n + m; i++){
					double output = weight_x * x_pos[i] + weight_y * y_pos[i] + weight_const;
					
					if(i < n && output < EPS || i >= n && output > -EPS){
						final double diff = i < n ? 1 : -1;
						
						//System.out.println("error => " + i + " " + x_pos[i] + " " + y_pos[i] + " " + diff + " " + output);
						
						weight_x += R * diff * x_pos[i];
						weight_y += R * diff * y_pos[i];
						weight_const += R * diff * 1;
						failed = true;
						break;
					}
					
				}
				
				if(count >= TRY){
					System.out.println("NO");
					break;
				}
				
				count++;
			}while(failed);
			
			if(count < TRY){
				System.out.println("YES");
			}
		}
		
	}

}