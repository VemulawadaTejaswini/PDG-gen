import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int h = scn.nextInt();
        int w = scn.nextInt();
        int k = scn.nextInt();
        int map[][] = new int[h][w];
        int clone[][]= new int[h][w];
        int clone2[][]= new int[h][w];
        int count = 0;
        int ans = 0;

        for (int i = 0; i < h; i++) {
            String str = scn.next();
            for (int j = 0; j < w; j++) {
                if (str.charAt(j) == '#') {
                    map[i][j] = 1;
                } else {
                    map[i][j] = 0;
                }
            }
        }


        for (int i = 0; i < (1 << h); i++) {
            for (int x = 0; x < h; x++) {
                for (int y = 0; y < w; y++) {
                     clone[x][y] = map[x][y];
                }
            }
            for (int j = 0; j < h; j++) {
                if ((1 & (i >> j)) == 1) {
                    for(int s=0;s<w;s++){
                        clone[j][s]=0;

                    }
                }
            }
            for (int a = 0; a < (1 << w); a++) {
                for (int x = 0; x < h; x++) {
                    for (int y = 0; y < w; y++) {
                        clone2[x][y] = clone[x][y];
                    }
                }
                for (int b = 0; b < w; b++) {
                    if ((1 & (a >> b)) == 1) {
                        for(int s=0;s<h;s++){
                            clone2[s][b]=0;
                        }
                    }
                }
                count = 0;
                for (int x = 0; x < h; x++) {
                    for (int y = 0; y < w; y++) {
                        count += clone2[x][y];
                    }
                }
                if (count == k) {
                    ans += 1;
                }

            }


        }
        System.out.println(ans);

        scn.close();

    }


}
