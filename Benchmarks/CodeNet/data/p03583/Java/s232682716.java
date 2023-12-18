import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        boolean solved = false;
        for(long n = 1; n < 3501; n++) {
            if (solved) break;
            for(long w = 1; w < 3501; w++) {
                if (solved) break;
                long denominator = 4*n*w - N*n - N*w;
                if (denominator == 0) continue;
                long numerator = N*n*w;
                if (denominator > 0 && numerator%denominator == 0) {
                    long h = numerator/denominator;
                    System.out.print(h);
                    System.out.print(" ");
                    System.out.print(n);
                    System.out.print(" ");
                    System.out.print(w);
                    System.out.println(" ");
                    solved = true;
                }
            }
        }
    }
}
