import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug != true) {
            return;
        }
        System.out.println(str);
    }

    public static void scanArray(Scanner sc, int[] array, int num) {
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
    }

    //最小公倍数
    static long lcm(long a, long b) {
        long temp;
        long c = a;
        c *= b;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return (long) (c / b);
    }

    public static void main(String[] args) {

        int N;
        int K;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            K = sc.nextInt();
        }
        if (K > N - 1) {
            System.out.println("-1");
        }
    }

}
