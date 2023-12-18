
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] map = new int[H][W];
        ArrayList<ArrayList<HashSet<Integer>>> aval = new ArrayList<ArrayList<HashSet<Integer>>>(H);
        for (int y = 0; y < H; y++) {
            aval.add(new ArrayList<HashSet<Integer>>(W));
            for (int x = 0; x < W; x++) {
                aval.get(y).add(new HashSet<Integer>());
                map[y][x] = sc.nextInt();
            }
        }
        for (int y = 0; y < H; y++) {
            for (int x = 0; x < W; x++) {
                map[y][x] -= sc.nextInt();
            }
        }
        aval.get(0).get(0).add(map[0][0]);
        for (int x = 1; x < W; x++) {
            int y = 0;
            for (int num : aval.get(y).get(x - 1)) {
                aval.get(y).get(x).add(num + map[y][x]);
                aval.get(y).get(x).add(num - map[y][x]);
            }
        }
        for (int y = 1; y < H; y++) {
            int x = 0;
            for (int num : aval.get(y - 1).get(x)) {
                aval.get(y).get(x).add(num + map[y][x]);
                aval.get(y).get(x).add(num - map[y][x]);
            }
        }
        for (int y = 1; y < H; y++) {
            for (int x = 1; x < W; x++) {
                for (int num : aval.get(y).get(x - 1)) {
                    if (Math.abs(num) > 200)
                        continue;
                    aval.get(y).get(x).add(num + map[y][x]);
                    aval.get(y).get(x).add(num - map[y][x]);
                    // aval.get(y).get(x).add(-num + map[y][x]);
                    // aval.get(y).get(x).add(-num - map[y][x]);
                }
                for (int num : aval.get(y - 1).get(x)) {
                    if (Math.abs(num) > 200)
                        continue;
                    aval.get(y).get(x).add(num + map[y][x]);
                    aval.get(y).get(x).add(num - map[y][x]);
                    // aval.get(y).get(x).add(-num + map[y][x]);
                    // aval.get(y).get(x).add(-num - map[y][x]);
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int num : aval.get(H - 1).get(W - 1)) {
            ans = Math.min(ans, Math.abs(num));
        }
        System.out.println(ans);
        // for (int y = 0; y < H; y++) {
        //     for (int x = 0; x < W; x++) {
        //         System.out.print(Arrays.toString(aval.get(y).get(x).toArray()) + " ");
        //     }
        //     System.out.println();
        // }
    }
}