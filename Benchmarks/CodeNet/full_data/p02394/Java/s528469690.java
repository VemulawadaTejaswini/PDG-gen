import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		final long W = sc.nextLong();
		final long H = sc.nextLong();	
		final long x = sc.nextLong();
		final long y = sc.nextLong();
		final long r = sc.nextLong();
		
		if(x - r < 0 || x + r > W || y - r < 0 || y + r > H){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
		
		
		
	}
	
}