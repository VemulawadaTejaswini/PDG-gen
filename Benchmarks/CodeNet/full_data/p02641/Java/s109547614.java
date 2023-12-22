

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeSet;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int x = in.nextInt();
        final int n = in.nextInt();
        in.nextLine();
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 1; i <= 100; i++) {
            ts.add(i);
        }
        for (int i = 0; i < n; i++) {
            ts.remove(in.nextInt());
        }
        int diff = Integer.MAX_VALUE;
        int res = -1;
        for (int item : ts) {
            if (Math.abs(item - x) < diff) {
                diff = Math.abs(item - x);
                res = item;
            }
        }
        System.out.println(res);
    }
}
