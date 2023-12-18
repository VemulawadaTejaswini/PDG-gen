import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String S = sc.next();
    	String[] str = S.split("/");
    	
    	if( Integer.parseInt(str[0]) > 2019 ) {
    		System.out.println( "TBD" );
    	}
    	else if( Integer.parseInt(str[1]) >= 5 ) {
    		System.out.println( "TBD" );
    	}
    	else {
    		System.out.println( "Heisei" );
    	}
    	sc.close();
    }
}