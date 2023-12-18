import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String L = sc.next();
        long dec = Integer.parseInt(L, 2);
        sc.close();
        int count = 0;
        for (long i = 0; i <= dec; i++) {
            for (long j = 0; j <= dec; j++) {
                if (isTarget(i, j, dec)) count++;
            }
        }
        System.out.println((int)(count % (Math.pow(10, 9) + 7)));
    }

    private static boolean isTarget(long a, long b, long dec) {
        if (a + b > dec) return false;
        long xor = a ^ b;
        if (a + b == xor) return true;
        return false;
    }
}
