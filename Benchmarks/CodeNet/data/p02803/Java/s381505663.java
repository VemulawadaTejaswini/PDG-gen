
import java.util.Scanner;

public class Main {
    class Pair {
        public int h;
        public int w;
    }

    int[][] map;
    int[][] map2;
    int W;
    int H;

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        H = scanner.nextInt();
        W = scanner.nextInt();
        map = new int[H][W];
        map2 = new int[H][W];
        Pair sample = null;
        for(int j = 0; j < H; j++) {
            String line = scanner.next();
            char[] chars = line.toCharArray();
            for(int i = 0; i < W; i++) {
                if(chars[i] == '#'){
                    map[j][i] = -1;
                    map2[j][i] = -1;
                }else{
                    if(sample == null) {
                        sample = new Pair();
                        sample.h = j;
                        sample.w = i;
                    }
                }
            }
        }

        Pair start = findFarPos(sample);
        int count = findFarCount(start);

        System.out.println(count);

    }
    

    private int findFarCount(Pair sample) {
        int[][] tmpMap = map2.clone();

        int max = retFarPos(tmpMap, sample.w, sample.h);
        return max;
    }

    private Pair findFarPos(Pair sample) {
        int[][] tmpMap = map.clone();

        int max = retFarPos(tmpMap, sample.w, sample.h);
        // find;
        for(int j = 0; j < H; j++) {
            for (int i = 0; i < W; i++) {
                if(max == tmpMap[j][i]) {
                    Pair pos = new Pair();
                    pos.h = j;
                    pos.w = i;
                    return pos;
                }
            }
        }
        return null;
    }

    private int retFarPos(int[][] tmpMap, int w, int h) {
        tmpMap[h][w] = 1;
        int dist = 1;
        boolean flag = true;
        while(flag) {
            flag = false;
            for(int j = 0; j < H; j++) {
                for (int i = 0; i < W; i++) {
                    if(tmpMap[j][i] == dist) {
                        if(j+1 < H && tmpMap[j+1][i] == 0) tmpMap[j+1][i] = dist+1;
                        if(j-1 >= 0 && tmpMap[j-1][i] == 0)tmpMap[j-1][i] = dist+1;
                        if(i+1 < W && tmpMap[j][i+1] == 0)tmpMap[j][i+1] = dist+1;
                        if(i-1 >= 0 && tmpMap[j][i-1] == 0)tmpMap[j][i-1] = dist+1;
                    }
                    if(tmpMap[j][i] == 0) {
                        flag = true;
                    }
                }
            }
            dist++;
        }
        return dist-1;
    }


}