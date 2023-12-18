import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        double a = Double.parseDouble(s.next());
        double b = Double.parseDouble(s.next());
        double n = Double.parseDouble(s.next());
          
        double base = Math.floor(n/b);
        double as = Math.floor(a*n/b);

        int result = (int)(Math.floor(as - a*base));

        System.out.println(result);
    }
}