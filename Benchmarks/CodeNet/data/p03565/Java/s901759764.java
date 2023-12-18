import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf = 1 << 61;
    static int[] x4 = {-1, 0, 0, 1};
    static int[] y4 = {0, -1, 1, 0};
    static int[] x8 = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] y8 = {0, -1, -1, -1, 0, 1, 1, 1};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s_ = in.next();
        String t = in.next();

        int lt = t.length();
        int st = s_.length();
        for(int i = st - lt; i >= 0; i--) {
            boolean cond = true;
            for(int j = 0; j < lt; j++) {
                if(s_.charAt(i+j) != '?' && s_.charAt(i+j) != t.charAt(j)) {
                    cond = false;
                    break;
                }
            }
            if(cond) {
                String s = s_.substring(0, i) + t + s_.substring(i+lt);
                s = s.replace("?", "a");
                System.out.println(s);
                return;
            }
        }

        System.out.println("UNRESTORABLE");
    }

    static public void printArray2D(char[][] map) {
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.format("%c\t", map[i][j]);
            }
            System.out.print("\n");
        }
    }

    static public void printArray2D(int[][] map) {
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.format("%d\t", map[i][j]);
            }
            System.out.print("\n");
        }
    }
}