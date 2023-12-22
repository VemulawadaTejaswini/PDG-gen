import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        final long N = scn.nextInt();
        long tmp = N;
        long k = c(N);
        long calc = (k + 1)* k / 2;

        for (;;) {
//            System.out.println("calc=" + calc);
//            System.out.println("   k=" + k);
//            System.out.println("   N=" + tmp);
            if (calc < tmp) {
                k++;
                calc += k;
            } else if (calc > tmp) {
                tmp += N;
                k = c(tmp);
                calc = (k + 1)* k / 2;
            } else {
                System.out.println(calc);
                break;
            }
        }
    }

    private static long c(long N) {

        long k = Math.round(Math.sqrt((double)N*2.0));
//        System.out.println("check=" + k);
        k -= 3;
        if (k % 2 != 0) {
            k--;
        }
        return k;
    }
}
