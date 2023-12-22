import java.util.*;

public class Main {
    public static void main( String args[] ) {
        Scanner scan = new Scanner( System.in );
        char[] charaArray = scan.nextLine().toCharArray();
        scan.close();
        
        int result = 0;
        for( char chara: charaArray ) {
            result += Character.getNumericValue( chara );
            
            
        }
        System.out.println(result);
        
        
        
    }
}