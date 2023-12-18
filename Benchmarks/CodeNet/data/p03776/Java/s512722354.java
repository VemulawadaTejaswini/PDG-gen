
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static long[][] C = new long[51][51];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        long[] items = new long[n];
        for (int i = 0; i < items.length; i++) {
            items[i] = sc.nextLong();
        }
        double max;
        long sum = 0;
        long min = Long.MAX_VALUE;
        int minArg = -1;
        Arrays.sort(items);
        for (int j = items.length - 1; j >= items.length - a; j--) {
            sum += items[j];
            if (min > items[j]) {
                min = items[j];
                minArg = j;
            }
        }
        max = sum / a;
        long trg = items[items.length - a];
        long num = 0;
        int maxArg = items.length - a;
        for (; maxArg >= 0; maxArg--) {
            if (items[maxArg] != trg)
                break;
        }
        int N = minArg - maxArg;
        createTable();
        if (N == 1) {
            num = 1;
        }
        else {
            for (int i = a; i < b; i++) {
                int tmp = i - n + minArg + 1;
                if (tmp < 0)
                    continue;
                num += C[N][tmp];
                if (num < 0)
                    System.out.println(num);
            }
        }
        System.out.printf("%.7f\n", max);
        System.out.println(num);
    }

    public static void createTable(){
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j)
                    C[i][j] = 1;
                else
                    C[i][j] = C[i-1][j] + C[i-1][j];
            }
        }
    }
}
