import java.util.Scanner;
public class Main {	
	public static void main(String[] args) {
		Scanner frog = new Scanner(System.in);
		String S = frog.next();
		String T = frog.next();
		int A = frog.nextInt();
		int B = frog.nextInt();
		String U = frog.next();
		if(U.charAt(0)==S.charAt(0))
			A-=1;
		if(U.charAt(0)==T.charAt(0))
			B-=1;		
		System.out.println(A + " "+B);
	}   
	}




