import java.util.*;

public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        int count = 0;
        
        for(int i=0; i<N-2; i++){
            
            if(S.charAt(i)=='A' && S.charAt(i+1)=='B' && S.charAt(i+2)=='C'){
                
                count = count +1;
                
            }
        }
        
        System.out.println(count);
        
    }
}
