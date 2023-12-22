import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int w;
            int h;
            while((w = scn.nextInt()) > 0 | (h = scn.nextInt()) > 0) {
                int[][] fld = new int[h][w];
                for(int y = 0; y < h; y++) {
                    for(int x = 0; x < w; x++) {
                        fld[y][x] = scn.nextInt();
                    }
                }
                System.out.println(new Area(fld).count());
            }
        }
    }
}

class Area {
    private int[][] fld;

    Area(int[][] fld) {
        this.fld = fld;
    }

    int count() {
        int rslt = 0;
        for(int y = 0; y < fld.length; y++) {
            for(int x = 0; x < fld[y].length; x++) {
                if(fld[y][x] > 0) {
                    rslt++;
                    sink(y, x);
                }
            }
        }
        return rslt;
    }

    private void sink(int y, int x) {
        try {
            if(fld[y][x] > 0) {
                fld[y][x] = 0;
                int[][] vector = {
                    {-1, -1, -1, 0, 0, 1, 1, 1}, {-1, 0, 1, -1, 1, -1, 0, 1}
                };
                for(int i = 0; i < 8; i++) {
                    sink(y + vector[0][i], x + vector[1][i]);
                }
            }
        } catch(ArrayIndexOutOfBoundsException ignore) {}
    }
}