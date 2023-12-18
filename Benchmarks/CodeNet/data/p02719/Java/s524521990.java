import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Long n = scanner.nextLong();
        Long k = scanner.nextLong();

        if ( n  % k == 0) {
            System.out.println(0);
            System.exit(0);
        }

        if( n < k) {
            System.out.println(n);
            System.exit(0);
        }


        Long x = n % k;
        System.out.println((int)Math.min(x, Math.abs(k-x)));

    }
}