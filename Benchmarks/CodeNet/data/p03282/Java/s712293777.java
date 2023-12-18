import java.util.*;
import java.lang.Character;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        float k = sc.nextFloat();
        int ans = 0;
        
        if(s.charAt(0) == '1' && s.length() > 1 && k != 1){
            ans = Character.getNumericValue(s.charAt(1));
        }else{
            ans = Character.getNumericValue(s.charAt(0));
        }
        System.out.println(ans);
    }
}