import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int [] a  = new int [N];
			int goukei  = 0;
			BigDecimal [] b = new BigDecimal[N];
			
			BigDecimal ans = new BigDecimal(1);
			BigDecimal go = new BigDecimal(0);
			
			for(int i = 0;i<N;i++) {
				a[i] = scan.nextInt();
				goukei += (a[i]-1);
			}
			
			System.out.println(goukei);
			
			
			
		}
		
		
	}
		

}
