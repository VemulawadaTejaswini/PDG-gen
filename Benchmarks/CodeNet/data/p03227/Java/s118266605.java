import java.util.Scanner;

public class Main{
    public static void main(String args[]){
	String S;
	Scanner sc = new Scanner(System.in);

	System.err.print("S = ");
	S = sc.next();
	
	if( S.length() == 2){
	    System.out.print(S);
	}

	else if( S.length() == 3){
	    char s1 = S.charAt(0);
	    char s2 = S.charAt(1);
	    char s3 = S.charAt(2);
	    System.out.print(s1);
	    System.out.print(s2);
	    System.out.println(s3);
	}
    }
}
