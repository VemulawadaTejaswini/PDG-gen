import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			
			int N = scan.nextInt();
			
			int[]a = new int[N];
			for(int i = 0;i<N;i++)a[i] = scan.nextInt();
			
			
			Arrays.sort(a);
			
			int min = a[0];
			int max = a[N-1];
			
			long mincost = Integer.MAX_VALUE;
			
			for(int i = min;i<=max;i++) {
				long cost = 0;
				
				for(int j = 0;j<N;j++) {
					cost+=(a[j]-i)*(a[j]-i);
				}
				
				if(mincost>cost)mincost = cost;
				
				
			}
			
			
			System.out.println(mincost);
			
			
			
			
			
			
			
			
			
		}
		
		
	}
		

}
