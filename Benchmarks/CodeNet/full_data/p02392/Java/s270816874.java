import java.util.Scanner;


public class Main {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		final long a = sc.nextLong();
		final long b = sc.nextLong();
		final long c = sc.nextLong();
		
		if(a < b && b < c){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		
		
		
	}
	
}