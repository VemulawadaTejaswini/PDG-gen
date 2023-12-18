import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int q = sc.nextInt();

        long[] s = new long[a];
        for (int i = 0; i < a; i++) {
            s[i] = sc.nextLong();
        }

        long[] t = new long[b];
        for (int i = 0; i < b; i++) {
            t[i] = sc.nextLong();
        }

        long[] x = new long[q];
        for (int i = 0; i < q; i++) {
            x[i] = sc.nextLong();

            long shr = 9223372036854775807;
            long tem = 9223372036854775807;
            long shrine = 0;
            long temple = 0;
            long shrine2 = 9223372036854775807;
            long temple2 = 9223372036854775807;
            for (int j = 0; j < a; j++) {
                if (shr > Math.abs(s[j] - x[i])) {
                    shr = Math.abs(s[j] - x[i]);
                    shrine = s[j];
                }
            }
            for (int j = 0; j < b; j++) {
                if (tem > Math.abs(t[j] - x[i])) {
                    tem = Math.abs(t[j] - x[i]);
                    temple = t[j];
                }
            }
            for (int j = 0; j < a; j++) {
                if (shrine2 > Math.abs(s[j] - temple)) {
                    shrine2 = Math.abs(s[j] - temple);
                }
            }
            for (int j = 0; j < b; j++) {
                if (temple2 > Math.abs(t[j] - shrine)) {
                    temple2 = Math.abs(t[j] - shrine);
                }
            }


            long pattern_1 = shr + temple2;
            long pattern_2 = tem + shrine2;

            System.out.println(Math.min(pattern_1,pattern_2));
        }
    }
}
