import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        
        int count = 0;
        for(int i = 0; i < S.length(); i++){
            if( S.charAt(i) - '0' == i % 2 ) count++;
        }
        
        System.out.println( Math.min(count, S.length()-count) );
    }
}
