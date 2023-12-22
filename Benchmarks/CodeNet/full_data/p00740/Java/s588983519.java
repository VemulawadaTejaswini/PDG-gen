import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static long[] stone;
    public static void main(String[] args) throws Exception {
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            if (n == 0 && p == 0) break;
            stone = new long[n];
            long cup = p;
            int pos = 0;
            while (true) {
                if (cup > 0) {
                    stone[pos]++;
                    cup--;
                } else {
                    cup += stone[pos];
                    stone[pos] = 0;
                }
                if (stone[pos] == p) break;
                pos++;
                if (pos == n) pos = 0;
            }
            System.out.println(pos);
        }
    }
}