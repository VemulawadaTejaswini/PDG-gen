import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String chars, chart;
        int l = s.length();
        boolean ans = true;
        
        for(int i=0; i<l; i++){  
            chars = String.valueOf(s.charAt(i));
            chart = String.valueOf(t.charAt(i));
            if(s.replaceAll(chars, "").length() !=
            t.replaceAll(chart, "").length()){
                ans = false;
                break;
            }
        }

        System.out.println(ans?"Yes":"No");
    }
}