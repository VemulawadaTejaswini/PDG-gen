import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		
	    Scanner sc = new Scanner(System.in);
	    String  s1 = sc.next();
	    int a = Integer.parseInt(s1);
	    String  s2 = sc.next();
	    int b = Integer.parseInt(s2);
	    String  s3 = sc.next();
	    int c = Integer.parseInt(s3);
	    if( a < b && b < c){
	        System.out.println( "Yes" );
    	}
	    else{
	    	System.out.println( "No" );
	    }
	}

}