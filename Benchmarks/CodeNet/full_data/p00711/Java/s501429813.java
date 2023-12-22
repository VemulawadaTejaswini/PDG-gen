import java.util.*;

public class Main {
    private static boolean[][] fld;

    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int w = 0;
            int h = 0;
            int y = 0;
            int x = 0;
            while((w = scn.nextInt()) > 0 | (h = scn.nextInt()) > 0) {
                fld = new boolean[h][w];
                for(int i = 0; i < h; i++) {
                    char[] ary = scn.next().toCharArray();
                    for(int j = 0; j < w; j++) {
                        switch(ary[j]) {
                            case '@':
                                y = i;
                                x = j;
                            case '.':
                                fld[i][j] = true;
                                break;
                            case '#':
                                fld[i][j] = false;
                                break;
                            default:
                                assert false;
                        }
                    }
                }
                System.out.println(count(y, x));
            }
        }
    }

    public static int count(int y, int x) {
        int rslt = 0;
        try {
            if(fld[y][x]) {
                fld[y][x] = false;
                rslt += count(~-y, x);
                rslt += count(y, ~-x);
                rslt += count(y, -~x);
                rslt += count(-~y, x);
                rslt++;
            }
        } catch(ArrayIndexOutOfBoundsException ignore) {}
        return rslt;
    }
}