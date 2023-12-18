import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    static class Pair {
        int left;
        int right;
        Pair(int l, int r) {
            left = l;
            right = r;
        }
    }


    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int m = std.nextInt();
        int Q = std.nextInt();
        List<Pair> rails = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int l = std.nextInt() - 1;
            int r = std.nextInt() - 1;
            rails.add(new Pair(l, r));
        }
        int[] ans = new int[Q];
        for (int i = 0; i < Q; i++) {
            int p = std.nextInt() - 1;
            int q = std.nextInt() - 1;
            for (Pair r : rails) {
                if (p - r.left <= 0 && q - r.right >= 0) {
                    ans[i]++;
                }
            }
        }

        Arrays.stream(ans).forEach(System.out::println);
    }
}