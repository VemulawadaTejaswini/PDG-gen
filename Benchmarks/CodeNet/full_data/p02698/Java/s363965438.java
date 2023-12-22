import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] values;
    static int[] ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        ans = new int[n];
        int[] lis = new int[n + 1];
        lis[0] = 0;
        Arrays.fill(lis, Integer.MAX_VALUE);
        search(0, 0, 0, lis);
        StringBuilder sb = new StringBuilder();
        for (int x : ans) {
            sb.append(x).append("\n");
        }
        System.out.print(sb);
    }
    
    static void search(int idx, int parent, int max, int[] lis) {
        int left = 0;
        int right = lis.length - 1;
        while (right - left > 1) {
            int m = (left + right) / 2;
            if (lis[m] > values[idx]) {
                right = m;
            } else {
                left = m;
            }
        }
        int saveIdx = right;
        int saveValue = lis[right];
        lis[right] = values[idx];
        max = Math.max(max, right);
        ans[idx] = max;
        for (int x : graph.get(idx)) {
            if (x == parent) {
                continue;
            }
            search(x, idx, max, lis);
        }
        lis[saveIdx] = saveValue;
    }
}