import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long x = a;

        ArrayList<Long> aL = new ArrayList<>();
        ArrayList<Long> bL = new ArrayList<>();

        for (long i = 2; i <= a;) {
            if (x % i == 0) { // 最小の因数を求める
                aL.add(i);
                x /= i; // 最小の因数で割った数を代入する
            } else {
                i++;
            }
        }

        x = b;

        for (long i = 2; i <= b;) {
            if (x % i == 0) { // 最小の因数を求める
                bL.add(i);
                x /= i; // 最小の因数で割った数を代入する
            } else {
                i++;
            }
        }

        long ans = 0;

        for (Long v: aL
             ) {
            if (bL.contains(v)) {
                ans++;
            }
        }

        System.out.println(Math.max(ans, 1));
    }
}