import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<HashSet<Integer>> list = new ArrayList<>();

        HashSet<Integer> zero = new HashSet<>();
        for (int i = 1; i <= m; i++) {
            zero.add(i);
        }
        list.add(zero);
        for (int i = 1; i <= m; i++) {
            HashSet<Integer> hs = new HashSet<>();
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    hs.add(j);
                    hs.add((i / j));
                }
            }
            list.add(hs);
        }

        int[] d = new int[m + 1];
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            HashSet<Integer> h = new HashSet<>();
            for (int j = l; j <= r; j++) {
                HashSet<Integer> hs = list.get(j);
                h.addAll(hs);
            }

            for (Integer num : h) {
                d[num]++;
            }
        }

        for (int i = 1; i <= m; i++) {
            System.out.println(d[i]);
        }
    }
}
