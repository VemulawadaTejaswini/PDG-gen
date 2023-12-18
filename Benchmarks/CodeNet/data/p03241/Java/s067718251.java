import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Long> divisor(long n) {
        List<Long> list = new ArrayList<>();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                long j = n / i;
                if (j != i) {
                    list.add(j);
                }
            }
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        List<Long> div = divisor(m);
        long ans = 1;
        for (int i = 0; i < div.size(); i++) {
            long d = div.get(i);
            if (d * n <= m) {
                ans = Math.max(ans, d);
            }
        }
        System.out.println(ans);
    }

}
