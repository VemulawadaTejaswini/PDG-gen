

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public final class Main {

    static class Pair {
        int key;
        int dir;

        Pair(int key, int dir) {
            this.key = key;
            this.dir = dir;
        }
    }

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = Integer.parseInt(in.nextLine());
        final Map<Integer, List<Pair>> lr = new HashMap<>();
        final Map<Integer, List<Pair>> du = new HashMap<>();
        final Map<Integer, List<Pair>> ul = new HashMap<>();
        final Map<Integer, List<Pair>> ur = new HashMap<>();
        final Map<Integer, List<Pair>> dl = new HashMap<>();
        final Map<Integer, List<Pair>> dr = new HashMap<>();
        for (int i = 0; i < n; i++) {
            final String[] line = in.nextLine().split(" ");
            final int x = Integer.parseInt(line[0]);
            final int y = Integer.parseInt(line[1]);
            final char c = line[2].charAt(0);
            if (c == 'D') {
                du.computeIfAbsent(x, k -> new ArrayList<>()).add(new Pair(y, -1));
                dl.computeIfAbsent(x + y, k -> new ArrayList<>()).add(new Pair(x, 1));
                dr.computeIfAbsent(x - y, k -> new ArrayList<>()).add(new Pair(x, -1));
            }
            if (c == 'U') {
                du.computeIfAbsent(x, k -> new ArrayList<>()).add(new Pair(y, 1));
                ul.computeIfAbsent(x - y, k -> new ArrayList<>()).add(new Pair(x, 1));
                ur.computeIfAbsent(x + y, k -> new ArrayList<>()).add(new Pair(x, -1));
            }
            if (c == 'L') {
                lr.computeIfAbsent(y, k -> new ArrayList<>()).add(new Pair(x, -1));
                dl.computeIfAbsent(x + y, k -> new ArrayList<>()).add(new Pair(x, -1));
                ul.computeIfAbsent(x - y, k -> new ArrayList<>()).add(new Pair(x, -1));
            }
            if (c == 'R') {
                lr.computeIfAbsent(y, k -> new ArrayList<>()).add(new Pair(x, 1));
                dr.computeIfAbsent(x - y, k -> new ArrayList<>()).add(new Pair(x, 1));
                ur.computeIfAbsent(x + y, k -> new ArrayList<>()).add(new Pair(x, 1));
            }
        }
        long ans = Integer.MAX_VALUE;
        for (List<Pair> pairs : lr.values()) {
            ans = Math.min(ans, 5 * solve(pairs));
        }
        for (List<Pair> pairs : du.values()) {
            ans = Math.min(ans, 5 * solve(pairs));
        }
        for (List<Pair> pairs : dr.values()) {
            ans = Math.min(ans, 10 * solve(pairs));
        }
        for (List<Pair> pairs : dl.values()) {
            ans = Math.min(ans, 10 * solve(pairs));
        }
        for (List<Pair> pairs : ur.values()) {
            ans = Math.min(ans, 10 * solve(pairs));
        }
        for (List<Pair> pairs : ul.values()) {
            ans = Math.min(ans, 10 * solve(pairs));
        }
        System.out.println(ans >= Integer.MAX_VALUE ? "SAFE" : ans);
    }

    private static long solve(List<Pair> li) {
        long ans = Integer.MAX_VALUE;
        li.sort(Comparator.comparing(p -> p.key));
        for (int i = 1; i < li.size(); i++) {
            if (li.get(i - 1).dir == 1 && li.get(i).dir == -1) {
                ans = Math.min(ans, li.get(i).key - li.get(i - 1).key);
            }
        }
        return ans;
    }
}
