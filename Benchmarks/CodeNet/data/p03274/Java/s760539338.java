import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] x = new int[N + 1];
		x[0] = 0;
		int count_p = 0;
		int count_m = 0;
		int time = 0;
		int[] time_a = new int[N];
		int[] time_b = new int[N];
		int turn_p = 0;
		double min_a = 2 * Math.pow(10, 9);
		double min_b = 2 * Math.pow(10, 9);
		
		for(int i = 1; i <= N; i++) {
			x[i] = sc.nextInt();
			if(x[i] > 0) {
				count_p++;
				if(x[i - 1] < 0) {
					turn_p = i - 1;
				}
			} else if(x[i] < 0) {
				count_m++;
			} else {
				if(x[i - 1] < 0) {
					turn_p = i - 1;
				}
			}
		}
		
		if((count_p > 0) && (count_m == 0)) {
			for(int i = 1; i <= K; i++) {
				time = time + x[i] - x[i - 1];
			}
			System.out.println(time);
		} else if((count_m > 0) && (count_p == 0)) {
			for(int i = 1; i <= K; i++) {
				time = time + Math.abs(x[i] - x[i - 1]);
			}
			System.out.println(time);
		} else if((count_p == 0) && (count_m == 0)) {
			time = 0;
			System.out.println(time);
		} else {
			for(int i = 1; i <= turn_p; i++) {	
				for(int j = i; j > 1; j--) {
					time_a[i] = time_a[i] + Math.abs(x[turn_p - j + 2] - x[turn_p - j + 1]);								
				}
				time_a[i] = time_a[i] + Math.abs(x[0] - x[turn_p]);
				time_a[i] = time_a[i] + Math.abs(x[turn_p + 1] - x[turn_p - i + 1]);
				
				for(int j = 1; j <= (K - i - 1); j++) {
					time_a[i] = time_a[i] + x[turn_p + j + 1] - x[turn_p + j];					
				}

				min_a = Math.min(min_a, time_a[i]);			
			}
			
			for(int i = 1; i <= (K - turn_p); i++) {	
				for(int j = 1; j < i; j++) {
					time_b[i] = time_b[i] + Math.abs(x[turn_p + j + 1] - x[turn_p + j]);								
				}
				time_b[i] = time_b[i] + Math.abs(x[turn_p + 1] - x[0]);
				time_b[i] = time_b[i] + Math.abs(x[turn_p + i] - x[turn_p]);
				
				for(int j = 1; j <= (K - i - 1); j++) {
					time_b[i] = time_b[i] + x[turn_p - j + 1] - x[turn_p - j];					
				}
				
				min_b = Math.min(min_b, time_b[i]);
			}
			double min = Math.min(min_a, min_b);
		
			System.out.println((int)min);
		}	
	}
}
