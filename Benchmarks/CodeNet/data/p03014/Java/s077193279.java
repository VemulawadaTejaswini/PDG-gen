import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;
    public static void main(String[] args) {
        int H = ni();
        int W = ni();
        
        char[][] g = new char[H][W];
        for (int h = 0; h < H; h++) {
            String s = ns();
            for (int w = 0; w < W; w++) {
                g[h][w] = s.charAt(w);
            }
        }

        int maxCount = 0;
        for (int h = 0; h < H; h++)
            for (int w = 0; w < W; w++)
                if (g[h][w] == '.')
                    maxCount = Math.max(maxCount, count(g, h, w, H, W));
        
        so.println(maxCount);
    }
    
    
    private static int count(char[][] g, int startH, int startW, int limH, int limW) {
        int[] mw = {1, 0, -1, 0};
        int[] mh = {0, 1, 0, -1};
        
        int count = 1;
        
        for (int i = 0; i < mw.length; i++) {
            int h = startH;
            int w = startW;
            
            while (true) {
                h += mh[i];
                w += mw[i];
                if (h < 0 || limH <= h || w < 0 || limW <= w)
                    break;
                
                if (g[h][w] == '#') 
                    break;
                
                count++;
            }
        }
        return count;
    }

    private static long nl() {
        return sc.nextLong();
    }

    private static int ni() {
        return sc.nextInt();
    }

    private static String ns() {
        return sc.next();
    }

    private static char[] nsToChars() {
        return sc.next().toCharArray();
    }

    private static long[] nlongs(int n) {
        return nlongs(n, 0);
    }
    private static int[] nints(int n) {
        return nints(n, 0);
    }

    private static long[] nlongs(int n, int offset) {
        long[] a = new long[offset + n];
        for (int i = 0; i < n; i++)
            a[offset + i] = nl();
        return a;
    }

    private static int[] nints(int n, int offset) {
        int[] a = new int[offset + n];
        for (int i = 0; i < n; i++)
            a[offset + i] = ni();
        return a;
    }
}
