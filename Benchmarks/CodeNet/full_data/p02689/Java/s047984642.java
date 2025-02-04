

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final int m = in.nextInt();
        int[] obs = new int[n];
        in.nextLine();
        for (int i = 0; i < n; i++) {
            obs[i] = in.nextInt();
        }
        in.nextLine();
        Map<Integer, List<Integer>> roads = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            roads.computeIfAbsent(a, v -> new ArrayList<>()).add(b);
            roads.computeIfAbsent(b, v -> new ArrayList<>()).add(a);
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            int currH = obs[i];
            boolean good = true;
            for (int next : roads.getOrDefault(i + 1, Collections.emptyList())) {
                if (currH <= obs[next-1]) {
                    good = false;
                    break;
                }
            }
            if (good) { res++; }
        }
        System.out.println(res);
    }
}
