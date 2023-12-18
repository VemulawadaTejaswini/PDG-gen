 import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc  = new Scanner(System.in);
 
        String S = sc.next();
        int f = 0;
        char[] c = S.toCharArray();

        for(int i = 0 ; i < S.length() ; i++) {
            
      //  System.out.println((int)c[i]);
        }
        
        int[] test  = new int[1000];        
        for(int i = 0; i < S.length(); i++){
            test[c[i]]++;
        }
        for(int i = 0; i < 1000; i++){
          
            if(test[i]>=2) f++;
        }
 
 
 
        if(f>=2) System.out.print("no");
        else    System.out.print("yes");
        System.out.println();
    }
 
}