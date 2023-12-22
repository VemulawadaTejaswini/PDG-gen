import java.util.Scanner;

public class Main {
	
	static Scanner sc =  new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		while ( sc.hasNext() ){
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double n = sc.nextDouble();
		
		String ans = "" ;
		int s = 0 ;
		
		for ( int i = 1 ; i <= n ; i++){
			
			double x = a / b ;
			
			for ( int j = 1 ; j <= i ; j++){
				x = x * 10;
			}
			
		ans = String.valueOf( x % 10 );
		
		String[] array = ans.split("\\.");
		
		String ans2 = array[0];
		
		String[] array2 = ans2.split("");
		
		int l = array2.length;
		
		int z = Integer.parseInt(array2[l-1]);
		
			s = s + z ;	
		}
		
		System.out.println(s);
	}
	}

}