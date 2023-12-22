import java.util.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        double b = scan.nextDouble();
        int intb = (int)(b * 100);
        
        long ans = (long)(a * intb);
        ans = ans / 100l;

        System.out.println(ans);
    }
}