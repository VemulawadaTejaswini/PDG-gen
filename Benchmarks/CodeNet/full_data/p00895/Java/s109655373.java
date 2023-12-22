import java.io.*;
import java.util.*;

class LengthComparator implements Comparator<String> {
    public int compare(String a, String b) {
        if (a.length() == b.length()) {
            return a.compareTo(b);
        } else {
            return b.length() - a.length();
        }
    }
}


public class Main {
    public static void main(String [] args) {
        new Main().run();
    }
    final int [] dx = {0, 1, 1,  1,  0, -1, -1, -1};
    final int [] dy = {1, 1, 0, -1, -1, -1,  0,  1};
    HashSet<String> occurOnce;
    HashSet<String> occurTwice;
    void makeString(int y, int x) {
        for (int i = 0; i < 8; i++) {
            String cur = String.valueOf(F[y].charAt(x));
            int ny = (y + dy[i] + H) % H, nx = (x + dx[i] + W) % W;
            while (ny != y || nx != x) {
                cur = cur + String.valueOf(F[ny].charAt(nx));
                if (occurOnce.contains(cur)) {
                    occurTwice.add(cur);
                } else {
                    occurOnce.add(cur);
                }
                ny = (ny + dy[i] + H) % H;
                nx = (nx + dx[i] + W) % W;
            }
        }
    }
    void debug(Object ... o) {
        System.out.println(Arrays.deepToString(o));
    }
    void run() {
        while (init()) {
            ArrayList<String> ans = new ArrayList<String>();
            for (char c = 'A'; c <= 'Z'; c++) {
                occurOnce = new HashSet<String>();
                occurTwice = new HashSet<String>();
                for (int i = 0; i < H; i++) {
                    for (int j = 0; j < W; j++) {
                        if (F[i].charAt(j) == c) makeString(i, j);
                    }
                }
                ArrayList<String> list = new ArrayList<String>();
                for (Iterator it = occurTwice.iterator(); it.hasNext(); ) {
                    String spell = (String)it.next();
                    list.add(spell);
                }
                if (list.isEmpty()) continue;
                ans.add(Collections.min(list, new LengthComparator()));
            }
            if (ans.isEmpty()) {
                System.out.println(0);
            } else {
                //Collections.sort(ans, new LengthComparator());
                //System.out.println(ans.get(0));
                System.out.println(Collections.min(ans, new LengthComparator()));
            }
        }
    }
    Scanner sc;
    Main() {
        sc = new Scanner(System.in);
    }
    int W, H;
    String [] F;
    boolean init() {
        H = sc.nextInt();
        W = sc.nextInt();
        if (H == 0 && W == 0) return false;
        F = new String[H];
        for (int i = 0; i < H; i++) {
            F[i] = sc.next();
        }
        return true;
    }
}