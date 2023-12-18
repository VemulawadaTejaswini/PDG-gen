import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        if (a > k) {
            System.out.println(a-k+""+b);
        } else if (k - a > b) {
            System.out.println("0 0");
        } else {
            System.out.println("0" + (k - a  - b));
        }

        
    }
}
