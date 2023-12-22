import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long k = sc.nextLong();

        long sum = 0;
        if (a < k) {
            sum = a;
            if (a+b < k) {
                sum -= k-(a+b);
            }
        } else {
            sum = k;
        }
        System.out.println(sum);
    }
}