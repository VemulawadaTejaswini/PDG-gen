import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] niroku = new long[15];
        for (int i = 0; i < 15; i++) {
            niroku[i] = (long) Math.pow(26, i);
        }
        if (n >= 1 && n <= 26) {
            System.out.println((char) (n - 1 + 'a'));
            return;
        }
        //int i = 3;
        int i = 14;
        StringBuilder sb = new StringBuilder();
        while (i > 0) {
            long cnt = n / niroku[i];
            n -= cnt * niroku[i];
            i--;
            if (cnt == 0) {
                continue;
            }
            sb.append((char) ((cnt - 1) + 'a'));
        }
        sb.append((char) ((n - 1) + 'a'));
        System.out.println(sb);
    }

}
