import java.util.Scanner;

public class Main {
	
	static Scanner sc =  new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		while ( sc.hasNext() ){
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double n = sc.nextDouble();
		
		double ans = 0 ;
		int s = 0 ;
		
		for ( int i = 1 ; i <= n ; i++){
			
			double x = a / b ;
			
			for ( int j = 1 ; j <= i ; j++){
				x = x * 10;
			}
			
		ans = x % 10 ;
					
			s = s + (int)ans ;	
		}
		
		System.out.println(s);
	}
	}

}