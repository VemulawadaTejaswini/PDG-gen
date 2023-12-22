import java.util.Scanner;

public class ITP1_3_C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do {

			String str = sc.nextLine();
			String[] strs = str.split(" ");
			int x = Integer.parseInt( strs[0] );
			int y = Integer.parseInt( strs[1] );

	        if (x == 0 && y == 0) {
	        	break;
	        }else if (x > y || x == y) {
	        	System.out.println( x + " " + y );
	        }else {
	        	System.out.println( y + " " + x );
	        }
		}while(true);
		sc.close();

	}

}

