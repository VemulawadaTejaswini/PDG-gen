
import java.util.*;

public class Main {
    static int n;
    static int m;
    static List<List<Integer>> children;
    static int[] degree;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        children = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            children.add(new ArrayList<>());
        }
        degree = new int[n];
        for (int i = 0; i < m+n-1; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            degree[b]++;
            children.get(a).add(b);
        }
        List<Integer> sorted = new ArrayList<>();
        Queue<Integer> s = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if(degree[i] == 0) {
                s.add(i);
                sorted.add(i);
            }
        }
        while (!s.isEmpty()) {
            int node = s.poll();
            for (Integer child: children.get(node)) {
                if(--degree[child] == 0) {
                    s.add(child);
                    sorted.add(child);
                }
            }
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int node = sorted.get(n- i-1);
            for(Integer child: children.get(node)) {
                if(ans[child] == 0) {
                    ans[child] = node + 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }


}