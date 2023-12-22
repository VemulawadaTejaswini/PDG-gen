

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public final class Main {
    
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final int m = in.nextInt();
        final int x = in.nextInt();
        in.nextLine();
        int[][] books = new int[n][m + 1];
        int[] max = new int[m];
        for (int i = 0; i < n; i++) {
            int[] book = new int[m + 1];
            for (int z = 0; z < m + 1; z++) {
                book[z] = in.nextInt();
                if (z > 0) {
                    max[z - 1] += book[z];
                }
            }
            in.nextLine();
            books[i] = book;
        }
        if (Arrays.stream(max).anyMatch(skill -> skill < x)) {
            System.out.println(-1);
            return;
        }
        int [] res = { (int) 1e9 };
        knapsack(books, new int[m], x, 0, 0, new boolean[n], res);
        System.out.println(res[0]);
    }

    private static void knapsack(int[][] books, int[] pick, int x, int i, int cost, boolean[] taken, int[] res) {
        if (Arrays.stream(pick).noneMatch(tt -> tt < x)) {
            res[0] = Math.min(res[0], cost);
        }
        for (int t = i; t < books.length; t++) {
            if (!taken[t]) {
                taken[t] = true;
                for (int z = 1; z < books[t].length; z++) {
                    pick[z - 1] += books[t][z];
                }
                knapsack(books, pick, x, t, cost + books[t][0], taken, res);
                taken[t] = false;
                for (int z = 1; z < books[t].length; z++) {
                    pick[z - 1] -= books[t][z];
                }
            }
        }
    }
}
