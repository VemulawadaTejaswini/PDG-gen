import java.util.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        String flag = "No";

        double A = Math.sqrt((double)a);
        double B = Math.sqrt((double)b);
        double C = Math.sqrt((double)c);
        
        if ((A + B) < C) {
            flag = "Yes";
        }
        System.out.println(flag);
    }
}