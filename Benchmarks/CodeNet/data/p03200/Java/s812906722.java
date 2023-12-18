import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
	/* input S  */
	Scanner scanner = new Scanner( System.in );
	String S = scanner.nextLine();
	scanner.close();

	/* Search */
	String str = "BW";
	String S_dum = S;
	int count = 0;
	int index = S_dum.indexOf( str );
	while(index != -1 ){
	    while( index != -1 ){
		S_dum = S_dum.replaceFirst(str, "" );
		index = S_dum.indexOf( str );
		count++;
	    }
	    S = S.replaceAll( str, "WB" );
	    S_dum = S;
	    index = S_dum.indexOf( str );
	}
	System.out.println( count );
	

    }
}