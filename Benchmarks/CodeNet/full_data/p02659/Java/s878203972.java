import java.util.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        double b = scan.nextDouble();
        
        long ans = (long)(a * b);

        System.out.println(ans);
    }
}