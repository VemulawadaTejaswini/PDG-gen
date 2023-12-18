import java.util.Scanner;

public class Measure {
    public static void main(String args[]){
	String S;
	Scanner sc = new Scanner(System.in);

	System.err.print("S = ");
	S = sc.next();
	
	if( S.length() == 2){
	    System.out.print(S);
	}

	else if( S.length() == 3){
	    S.charAt(1);
	    S.charAt(2);
	    S.charAt(3);
	    System.out.print(S.charAt(1) + S.charAt(2) + S.charAt(3));
	}
	else{
	    System.out.print("Error!");
	}
    }
}
