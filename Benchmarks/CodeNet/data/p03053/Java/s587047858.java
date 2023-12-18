import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();

        boolean[][] data = new boolean[h][w];

        for (int i=0; i < h; i++) {
            String s = sc.nextLine();
            char[] ch = s.toCharArray();
            for (int j = 0; j < w; j++) {
                data[i][j] = ch[j] == '#';
            }
        }

        int max = 0;
        boolean[][] done = new boolean[data.length][data[0].length];

        for (int i=0; i < h; i++) {
            for (int j=0; j < w; j++) {

                if (!data[i][j] && !done[i][j]) {
                    done[i][j] = true;
                    int deepest = max(
                            manhattan(i, j, 0, 0),
                            manhattan(i, j, h-1, 0),
                            manhattan(i, j, 0, w-1),
                            manhattan(i, j, h-1, w-1)
                    );

                    System.out.println("Start search at [" + i + " " + j + "], deepest: " + deepest);
                    int matchi = 0, matchj = 0;
                    boolean match = false;
                    search:
                    for (int k=1; k <= deepest; k++) {

                        for (int di=-k; di <= k; di++) {
                            int dj = k - Math.abs(di);

                            System.out.println("k, di, dj: " + k + " " + di + " " + dj);

                            if (isInRange(i+di, j+dj, h, w)) {
                                // done[i+di][j+dj] = true;
                                System.out.println("done: [" + (i+di) + " " + (j+dj) + "]");
                                if (data[i+di][j+dj]) {
                                    max = max(max, k);
                                    matchi = i+di;
                                    matchj = j+dj;
                                    match = true;
                                    System.out.println("match! max: " + max);
                                    break search;
                                }
                            }

                            dj = -dj;
                            if (isInRange(i+di, j+dj, h, w)) {
                                // done[i+di][j+dj] = true;
                                System.out.println("done: [" + (i+di) + " " + (j+dj) + "]");
                                if (data[i+di][j+dj]) {
                                    max = max(max, k);
                                    matchi = i+di;
                                    matchj = j+dj;
                                    match = true;
                                    System.out.println("match! max: " + max);
                                    break search;
                                }
                            }
                        }

                    }

                    if (match) {
                        fill(done, i, j, matchi, matchj);
                    }

                }

            }
        }

        System.out.println(max);
    }

    private static void fill(boolean[][] data, int i1, int j1, int i2, int j2) {
        if (i1 > i2) {
            int temp = i2;
            i2 = i1;
            i1 = temp;
        }
        if (j1 > j2) {
            int temp = j2;
            j2 = j1;
            j1 = temp;
        }

        for (; i1 <= i2; i1++) {
            for (; j1 <= j2; j1++) {
                data[i1][j1] = true;
            }
        }
    }

    private static int max(int... a) {
        int max = a[0];
        for (int i : a) {
            if (max < i) max = i;
        }
        return max;
    }

    private static int manhattan(int i1, int j1, int i2, int j2) {
        return Math.abs(i1-i2) + Math.abs(j1-j2);
    }

    private static boolean isInRange(int i, int j, int h, int w) {
        return 0 <= i && i < h && 0 <= j && j < w;
    }


}
