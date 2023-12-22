import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());
        if(a > 10000) {
            a /= 10000.0;
            b *= 10000.0;
            System.out.println((long)(a*b));
        }else {
            System.out.println((long)(a*b));
        }
    }
}
