
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n1 = sc.nextLong();

        long sum = 0;
        for (int i = 1; i <= n1; i++) {
            System.out.println(i + ":" + yaku(i));
            sum += (i * yaku(i));
        }
        System.out.println(sum);
    }

    private static long yaku(long a) {
        int k = 1;
        for(int i=2;i<=a;i++){
            // 素数になるまで...
            if(!isPrime(i)) continue;
            int c = 0;
            // 割れる間は...
            while((a % i) == 0){
                a = a / i;
                c += 1;
            }
            k *= c + 1;
        }
        return k;
    }

    public static boolean isPrime(long l){
        return BigInteger.valueOf(l).isProbablePrime(1);
    }
}
