import java.util.*;
public class Main { 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] list;
		while(true) {
			int n = stdIn.nextInt();
			int w = stdIn.nextInt();
			if(n == 0 && w == 0) break;
			
			int max = 0;
			int[] log = new int[n];
			for(int i = 0; i < n; i++) {
				int a = stdIn.nextInt();
				log[i] = a;
				if(max < a) {
					max = a;
				}
			}
			
			list = new int[max/w+1];
			max = 0;
			int cx = 0;
			for(int i = 0; i < n; i++) {
				int a = log[i];
				list[a/w]++;
				if(list[a/w] > max) max = list[a/w];
			}
			
			double count = 0.0;
			
			for(int i = 0; i < list.length; i++) {
				int a = list[i];
				count += ((list.length - i-1.0)/(list.length-1.0)*a/max);
			}
			count += 0.01;
			System.out.printf("%.6f\n",count);
		}
	}
		
}