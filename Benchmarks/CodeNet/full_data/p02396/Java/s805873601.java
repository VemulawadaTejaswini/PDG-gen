import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);

		do {


	        int x = sc.nextInt();

	        if (x == 0) {
	        	break;
	        }else {
	        	System.out.print( "Case "+ (i + 1) +": "+ x + "\n" );
	        }

	        i++;

		}while(true);

		System.out.println();
		sc.close();

	}

}
