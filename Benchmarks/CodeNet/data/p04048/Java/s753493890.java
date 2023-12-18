
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long x = sc.nextInt();
        if (n % 2 == 0 && (long)(n / 2) == x) {
            System.out.println(x * 3);
        } else {
            System.out.println((n - 1) * 3);
        }
    }    
}
