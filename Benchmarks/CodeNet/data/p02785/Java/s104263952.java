import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        List<Long> list = new ArrayList<>();
        for(long i=0; i<n; i++) {
            list.add(sc.nextLong());
        }
        if(n <= k) {
            System.out.println(0);
            return;
        }
        Collections.sort(list);
        Collections.reverse(list);
        for(long i=0; i<k; i++) {
            list.remove(i);
        }
        BigInteger total = BigInteger.ZERO;
        for(long i : list) {
            total = total.add(BigInteger.valueOf(i));
        }
        System.out.println(total);
    }
}