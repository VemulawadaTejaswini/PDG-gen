import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();;
    static int[] values;
    static int[] longest;
    static int[] ans;
    static boolean[] used;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
            graph.add(new ArrayList<>());
        }
        longest = new int[n + 1];
        Arrays.fill(longest, Integer.MAX_VALUE);
        longest[0] = 0;
        ans = new int[n];
        used = new boolean[n];
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        search(0);
        StringBuilder sb = new StringBuilder();
        for (int x : ans) {
            sb.append(x).append("\n");
        }
        System.out.print(sb);
    }
    
    static void search(int idx) {
        if (used[idx]) {
            return;
        }
        used[idx] = true;
        int left = 0;
        int right = n + 1;
        while (right - left > 1) {
            int m = (left + right) / 2;
            if (longest[m] < values[idx]) {
                left = m;
            } else {
                right = m;
            }
        }
        int save = longest[left + 1];
        longest[left + 1] = Math.min(longest[left + 1], values[idx]);
        ans[idx] = left + 1;
        for (int x : graph.get(idx)) {
            search(x);
        }
        longest[left + 1] = save;
    }
}