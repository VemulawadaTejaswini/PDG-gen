import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int N = sc.nextInt();
			
			if(N == 0){
				break;
			}
			
			
			double ans = Integer.MAX_VALUE;
			int number = -1;
			for(int i = 0; i < N; i++){
				final int n = sc.nextInt();
				final double l = sc.nextInt() / 100.0;
				final double w = sc.nextInt();
				
				final double bmi = w / (l*l);
				
				if(Math.abs(22 - bmi) < Math.abs(22 - ans)){
					ans = bmi;
					number = n;
				}
			}
			
			System.out.println(number);
		}
		
	}

}