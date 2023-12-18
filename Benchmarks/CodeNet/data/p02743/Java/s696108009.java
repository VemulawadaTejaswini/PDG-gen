import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        double a = s.nextInt();
        double b = s.nextInt();
        double c = s.nextInt();

        String flag = "Yes";

        a = Math.sqrt(a);
        b = Math.sqrt(b);
        c = Math.sqrt(c);
        
        if ((a + b) >= c) {
            flag = "No";
        }
        System.out.println(flag);
    }
}