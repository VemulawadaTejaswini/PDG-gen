import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int y = sc.nextInt();
			int x = sc.nextInt();
			if(x == 0 && y == 0)break;
			for ( int j = 0; j < x; j++ )System.out.print("#");
			 System.out.println("");
			for ( int i = 0; i < y - 2; i++ ){
	        	System.out.print("#");	
				for ( int j = 0; j < x -2; j++ ){
		        	System.out.print(".");		       
		    	}
				System.out.println("#");		       
			}
			for ( int j = 0; j < x; j++ )System.out.print("#");
			System.out.println("\n");	
			
		}
	}
}

