import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long diff = b-a;
        if (diff % 2 == 0) {
            System.out.println(diff / 2);
        }
        else {
            // n-a: aがn卓に行くコスト
            // b: bが1卓に行くコスト
            long cost = 0;
            if (n - a < b) {
                cost += n - b;
                b = n;
            }
             else {
                cost += a - 1;
                a = 1;
            }
            cost += Math.ceil((double)(b-a)/ 2);
            System.out.println(cost);
        }
    }
}