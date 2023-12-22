import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        final long N = scn.nextInt();
        long tmp = N;
        long k = c(N);
        long calc = (k + 1)* k / 2;

        for (;;) {
            if (calc < tmp) {
                k++;
                calc += k;
            } else if (calc > tmp) {
                tmp += N;
                k = c(tmp);
                calc = (k + 1)* k / 2;
                for(;;) {
                    if (calc > tmp) {
                        calc -= k;
                        k--;
                    } else {
                        break;
                    }
                }
            } else {
                System.out.println(k);
                break;
            }
        }
    }

    private static long c(long N) {
        long k = Math.round(Math.sqrt(N*2.0));
        k -= 3;
        if (k % 2 != 0) {
            k--;
        }
        return k;
    }
}
