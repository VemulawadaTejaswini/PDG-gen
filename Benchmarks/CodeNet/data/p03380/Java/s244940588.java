import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int n = scan.nextInt();
			int[]a = new int[n];
			for(int i = 0;i<n;i++)a[i] = scan.nextInt();
			Arrays.sort(a);
			
			int ma = a[n-1];
			double k = (double)ma/2.0;
			
			double min = Double.MAX_VALUE;
			int mini =0;
			for(int i = 0;i<n-1;i++) {
				double s = Math.abs((double)a[i]-k);
				if(min>s) {
					min = s;
					mini = a[i];
				}
			}
			
			System.out.println(ma+" "+mini);
			
			
			
			
		}
		
		
	}
	

}
