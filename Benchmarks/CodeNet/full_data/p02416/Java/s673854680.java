import java.util.*;

public class Main {
    public static void main( String args[] ) {
        Scanner scan = new Scanner( System.in );
        
        while ( true ) {
            char[] charaArray = scan.nextLine().toCharArray();
            
            int result = 0;
            for( char chara: charaArray ) {
                result += Character.getNumericValue( chara );
                

            }
            if (result == 0) break;
            System.out.println(result);

        }
        scan.close();
        
    }
}