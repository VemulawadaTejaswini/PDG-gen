

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static Scanner in;
    private static int n, m;
    private static HashMap<Integer, ArrayList<Integer>> g;
    private static int[] mem;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        g = new HashMap<>();
        mem = new int[n];

        Arrays.fill(mem, -1);

        for(int i=0; i<n; i++) {
            g.put(i, new ArrayList<Integer>());
        }

        for(int i=0; i<m; i++) {
            int p = in.nextInt()-1;
            int q = in.nextInt()-1;
            g.get(p).add(q);
        }

        int ans = 0;
        for(int i=0; i<n; i++) {
            ans = Math.max(ans, solve(i));
        }

        System.out.println(ans);
	}

    private static int solve(int u) {
        if (mem[u]!=-1) return mem[u];

        int ans = 0;

        for(int v: g.get(u)) {
            ans = Math.max(ans, 1+solve(v));
        }

        return mem[u] = ans;
    }

}

