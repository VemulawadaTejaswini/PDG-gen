import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
	/* input S  */
	Scanner scanner = new Scanner( System.in );
	String S = scanner.nextLine();
	scanner.close();

	/* Search */
	String str = "BW";
	int count = 0;
	int index = S.indexOf( str );
	while( index != -1 ){
	    S = S.replaceFirst(str, "WB" );
	    index = S.indexOf( str );
	    count++;
	}

	System.out.println( count );
	

    }
}