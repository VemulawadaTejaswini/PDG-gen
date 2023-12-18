import java.util.*;

public class Main {
    
    public static boolean isATCG(char c) {
        switch(c) {
        case 'A':
            return true;
        case 'C':
            return true;
        case 'G':
            return true;
        case 'T':
            return true;
        default:
            return false;
        }        
    }
    
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] input_buf = input.toCharArray();
        
        int tmpMaxCnt = 0;
        int maxCnt = 0;
        for (int i = 0; i < input_buf.length; i++) {
            if ( isATCG(input_buf[i]) ) {
                ++tmpMaxCnt;
            } else {
                if ( tmpMaxCnt > maxCnt ) {
                    maxCnt = tmpMaxCnt;
                    tmpMaxCnt = 0;
                }
            }
            
        }
        
        System.out.println(maxCnt);
           
    }
}