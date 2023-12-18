import java.util.Scanner;

class atcorder {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);

		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int C = stdIn.nextInt();
		
		if(A==B && B=C)
			System.out.print("no");
		
		if(A==B && B!=C)
			System.out.print("yes");

		if(A!=B && B==C)
			System.out.print("yes");
		
		if(A!=B && B!=C)
			System.out.print("yes");
		

	}
    
}