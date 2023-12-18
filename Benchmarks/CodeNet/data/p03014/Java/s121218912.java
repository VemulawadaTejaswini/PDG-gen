import java.util.*;

public class Main {
    static long steps[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        boolean maps[][] = new boolean[H][W];
        for(int h=0; h<H; h++) {
            String tmp = sc.next();
            for(int w=0; w<W; w++) {
                switch(tmp.charAt(w)) {
                    case '#':
                        maps[h][w] = false;
                        break;
                    case '.':
                        maps[h][w] = true;
                        break;
                }
            }
        }
        int [][] horizontal = new int[H][W];
        // horizontal
        for(int h=0; h<H; h++) {
            int tmpCount = 0;
            int beginIndex = -1;
            for(int w=0; w<W; w++) {
                if(maps[h][w]) {
                    tmpCount++;
                    if(beginIndex==-1) beginIndex = w;
                    if(w==W-1) {
                        for(int i=beginIndex; i<=w; i++) {
                            horizontal[h][i] = tmpCount;
                        }
                    }
                } else {
                    if(beginIndex==-1) continue;
                    // flush buffer
                    for(int i=beginIndex; i<=w-1; i++) {
                        horizontal[h][i] = tmpCount;
                    }
                    beginIndex=-1;
                    tmpCount=0;
                }
            }
        }

        int [][] vertical = new int[H][W];
        // vertical
        for(int w=0; w<W; w++) {
            int tmpCount = 0;
            int beginIndex = -1;
            for(int h=0; h<H; h++) {
                if(maps[h][w]) {
                    tmpCount++;
                    if(beginIndex==-1) beginIndex = h;
                    if(h==H-1) {
                        for(int i=beginIndex; i<=h; i++) {
                            vertical[i][w] = tmpCount;
                        }
                    }
                } else {
                    if(beginIndex==-1) continue;
                    // flush buffer
                    for(int i=beginIndex; i<=h-1; i++) {
                        vertical[i][w] = tmpCount;
                    }
                    beginIndex=-1;
                    tmpCount=0;
                }
            }
        }
/*
        dump(horizontal, H, W);
        System.out.println();
        dump(vertical, H, W);
*/
        int result = 0;
        for(int h=0; h<H; h++) {
            for(int w=0; w<W; w++) {
                if(result < horizontal[h][w] + vertical[h][w] - 1) {
                    result = horizontal[h][w] + vertical[h][w] - 1;
                }
            }
        }

        System.out.println(result);
    }

    static void dump(int[][] data, int height, int width) {
        for(int h=0; h<height; h++) {
            for(int w=0; w<width; w++) {
                System.out.print(data[h][w] + " ");
            }
            System.out.println();
        }
    }
}