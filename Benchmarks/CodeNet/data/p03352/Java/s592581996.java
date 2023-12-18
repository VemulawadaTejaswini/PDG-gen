import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for (int i = 1000; i >= 1; i--) {
            long tmp = (long)i * i;
            if (tmp <= n) {
                System.out.println(tmp);
                return;
            }
        }
    }
}
