import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		
		while( true ) {
			int height	= sc.nextInt();
			int width	= sc.nextInt();
			
			if (		height	== 0
					&&	width	== 0	) {
				break;
			}
			
			for (int i = 0; i < height; i++ ) {
				if ( i == 0 || i == (height - 1) ) {
					frame( width );
					
				} else {
					content( width );
					
				}
				
				
			}
			System.out.print("\n");
			
		}
	}
	
	public static void frame( int width ) {
		for ( int j = 0; j < width; j++  ) {
			System.out.print("#");
		}
		
		System.out.print("\n");
	
	}
	
	public static void content( int width ) {
		System.out.print("#");

		for ( int j = 0; j < (width - 2); j++  ) {
			System.out.print(".");
		}

		System.out.println("#");	
	}
}