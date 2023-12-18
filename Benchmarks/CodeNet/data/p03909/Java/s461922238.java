import java.util.*;

public class Main{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int H = sc.nextInt();
	int W = sc.nextInt();
	String S[][] = new String[27][27];
	List<String>list = new ArrayList<String>();
	for ( int i = 1; i <= H; i++ ) {
	    for ( int j = 1; j <= W; j++ ) {
		S[i][j] = sc.next();
	    }	    
	}
	/*
	for ( int i = 1; i <= H; i++ ) {
	    for ( int j = 1; j <= W; j++ ) {
		System.out.print(S[i][j]);
	    }
	    System.out.println();
	}	
	*/

	for ( int i = 1; i <= H; i++ ) {
	    for ( int j = 1; j <= W; j++ ) {
		if ( S[i][j].equals("snuke") ) {
		    String tmp = "";
		    if ( j == 1 ) tmp = "A";
		    else if ( j == 2 ) tmp = "B";
		    else if ( j == 3 ) tmp = "C";
		    else if ( j == 4 ) tmp = "D";
		    else if ( j == 5 ) tmp = "E";
		    else if ( j == 6 ) tmp = "F";
		    else if ( j == 7 ) tmp = "G";
		    else if ( j == 8 ) tmp = "H";
		    else if ( j == 9 ) tmp = "I";
		    else if ( j == 10 ) tmp = "J";
		    tmp += String.valueOf(i);
		    System.out.println(tmp);
		    return;
		}
	    }
	}


    }
}
