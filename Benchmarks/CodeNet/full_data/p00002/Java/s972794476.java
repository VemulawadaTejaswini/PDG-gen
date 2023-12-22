/* Volume0 0002 Digit Number */
import java.util.Scanner;

class Main{
	public static void main(String[] args){

		Scanner stdIn = new Scanner(System.in);

		while( stdIn.hasNext()){
			System.out.println( (int)Math.log10(stdIn.nextInt()+stdIn.nextInt())+1 );
		}

	}
}