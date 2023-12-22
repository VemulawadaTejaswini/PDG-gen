import java.util.*;
import java.lang.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String x = sc.nextLine();
            int l = x.length();
            if (Character.getNumericValue(x.charAt(0)) == 0) {
                break;
            }
            int sum = 0;
            for (int i = 0; i < x.length(); i++) {
                sum += Character.getNumericValue(x.charAt(i));
            }
            System.out.println(sum);
        }
        
    }
}
