import java.util.Scanner;

class atcorder {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);

		String S = stdIn.next();
		String T = stdIn.next();
		
		int A = stdIn.next();
		int B = stdIn.next();

		String U = stdIn.next();
	
		if( S != U or T != U )
			System.out.print( A +" "+ B);
		else if(S == U)
			System.out.print( A-1 +" "+ B);
		else
			System.out.print( A +" "+ B-1);
	}
    
}