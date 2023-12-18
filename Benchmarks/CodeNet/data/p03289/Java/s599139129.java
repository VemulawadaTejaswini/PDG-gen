import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        boolean isOK = true;
        boolean isC = false;
        
        for(int i = 0; i < S.length(); i++){
            
            char x = S.charAt(i);
            
            if( i == 0){
                if( x != 'A' ){
                    isOK = false;
                    break;
                }
            }else if( i == 1 ){
                if( x - 'Z' <= 0 ){
                    isOK = false;
                    break;  
                }
            }else if( i == S.length()-1 ){
                if( x == 'C' || !isC || x - 'Z' <= 0){
                    isOK = false;
                    break;
                }
            }else if( isC ){
                if( x - 'Z' <= 0 ){
                    isOK = false;
                    break;
                }
            } else {
                if( x == 'C' ){
                    isC = true;
                }else if( x - 'Z' <= 0 ){
                    isOK = false;
                    break;
                }
            }
            
        }
        
        System.out.println( isOK ? "AC" : "WA" );
    }
}
