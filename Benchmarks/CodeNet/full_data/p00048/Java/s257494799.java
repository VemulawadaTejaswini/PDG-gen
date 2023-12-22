import java.util.Scanner;

public class Main {
	static Scanner sc =  new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		
		while ( sc.hasNext() ){
		
		double w = sc.nextDouble();
		
		if ( w <= 48.00){
			System.out.println( "light fly" );
		}else if( w <= 51.00 && w >= 48.00 ){
			System.out.println( "fly" );
		}else if ( w <= 54.00 && w >= 51.00 ){
			System.out.println( "bantam" );
		}else if ( w <= 57.00 && w >= 54.00 ){
			System.out.println( "feather" );
		}else if ( w <= 60.00 && w >= 57.00 ){
			System.out.println( "light" );
		}else if ( w <= 64.00 && w >=60.00 ){
			System.out.println( "light welter" );
		}else if ( w <= 69.00 && w >= 64.00 ){
			System.out.println( "welter" );
		}else if ( w <= 75.00 && w >= 69.00 ){
			System.out.println( "light middle" );
		}else if ( w <= 81.00 && w >= 75.00 ){
			System.out.println( "middle" );
		}else if ( w <= 91.00 && w >= 81.00 ){
			System.out.println( "light heavy" );
		}else {
			System.out.println( "heavy" );
		}
		
	
		}

	}

}