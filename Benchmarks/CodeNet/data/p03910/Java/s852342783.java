import java.util.Scanner;


	public class Main {
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			long n = sc.nextLong();
			long sum = 0;
			long cur=0;
			
			for(int i=1;sum<n;i++) {
				sum += i;
				cur = i;
			}
			
			for(int i=1;i<=cur;i++) {
				if(i!=sum-n) {
					System.out.println(i);
				}
			}
			
	    }
		
		
	}
	
