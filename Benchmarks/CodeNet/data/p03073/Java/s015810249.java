import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final PrintStream so = System.out;
    static final Scanner sc = new Scanner(System.in);
    static final char BLACK = '0';
    static final char WHITE = '1';
    
    public static void main(String[] args) {
        char[] tiles = nsToChars();
        so.println(Math.min(count(tiles, BLACK), count(tiles, WHITE)));
    }
    
    static int count(char[] tiles, char start) {
        int count = 0;
        for (int i = 0; i < tiles.length; i++) {
            if (i % 2 == 0) {
                if (tiles[i] == start) {
                    count++;
                }
            } else {
                if (tiles[i] == rev(start)) {
                    count++;
                }
            }
        }
        return count;
    }
    
    static char rev(char c) {
        return c == BLACK ? WHITE : BLACK;
    }

    static int ni() {
        return sc.nextInt();
    }

    static long nl() {
        return sc.nextLong();
    }

    static String ns() {
        return sc.next();
    }

    static char[] nsToChars() {
        return sc.next().toCharArray();
    }

    static int[] nints(int n) {
        return nints(n, 0, 0);
    }

    static int[] nints(int n, int padHead, int padTail) {
        int[] a = new int[padHead + n + padTail];
        for (int i = 0; i < n; i++)
            a[padHead + i] = ni();
        return a;
    }
}
