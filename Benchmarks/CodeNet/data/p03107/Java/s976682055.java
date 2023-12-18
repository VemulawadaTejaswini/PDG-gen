import java.util.*;
import java.lang.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
  
        String s = sc.next();
        int n = s.length();
        int ans = 0;
        
        String olds = "";
        while (olds != s) {
            olds = s;
            //System.out.println(s);
            s = s.replace("10", "");
            s = s.replace("01", "");
        }
        
        //System.out.println(s.length());
        ans = n - s.length();
        System.out.println(ans);
    }

}