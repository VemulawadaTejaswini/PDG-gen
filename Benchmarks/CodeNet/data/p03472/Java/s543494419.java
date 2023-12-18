import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[][] map;
    static int[][] label;


    static ArrayList<String> list;

    static int M;
    static int N;
    static int T;
    static int P;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long H = scanner.nextLong();

        long max = 0;
        long[] map = new long[N];

        for (int i = 0; i < N; i++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();

            max = Math.max(max, a);

            map[i] = b;
        }

        long to = 0;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (map[i] > max){
                ans++;
                to += map[i];
            }
        }

        long nokori = H - to;

        System.out.println(ans + ((nokori + max - 1) / max));


    }



}
