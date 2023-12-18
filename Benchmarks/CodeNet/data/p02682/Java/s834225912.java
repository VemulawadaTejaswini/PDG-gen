import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long k = sc.nextLong();

        long sum = 0;
        for (long i = 0; i < k; i++) {
            if (a > 0) {
                sum ++;
                a--;
            } else if (b > 0) {
                b--;
            } else if (c > 0) {
                sum --;
                c--;
            }
        }
        

        System.out.println(sum);
    }
}