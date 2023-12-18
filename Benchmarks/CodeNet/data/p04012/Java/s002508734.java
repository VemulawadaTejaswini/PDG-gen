

import java.math.BigDecimal;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
       
        String res = "Yes";
        for (char c='a'; c<='z'; c++){
            int count = 0;
            for (int i=0; i<w.length(); i++){
                if (w.charAt(i) == c){
                    count++;
                }
            }
            if (count%2 == 1){
                res = "No";
                break;
            }
        }
        System.out.println(res);
    }
}