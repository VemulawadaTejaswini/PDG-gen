import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ps = new int[m];
        int[] ys = new int[m];
        int[][] pyMap = new int[n][m];
        for (int[] years : pyMap) {
            Arrays.fill(years, Integer.MAX_VALUE);
        }
        
        for (int i = 0; i < m; i++) {
            ps[i] = sc.nextInt();
            ys[i] = sc.nextInt();
            pyMap[ps[i] - 1][i] = ys[i];
        }

        for (int[] years : pyMap) {
            Arrays.sort(years);
        }

        for (int i = 0; i < m; i++) {
            int order = Arrays.binarySearch(pyMap[ps[i] - 1], ys[i]) + 1;
            System.out.printf("%06d%06d%n", ps[i], order);
        }
    }
}
