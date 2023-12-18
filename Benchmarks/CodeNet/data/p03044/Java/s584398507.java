import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<HashMap<Integer, Boolean>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new HashMap<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            boolean c = (sc.nextInt() % 2 == 1);
            graph.get(a).put(b, c);
            graph.get(b).put(a, c);
        }
        boolean[] ans = new boolean[n];
        setAns(0, 0, false, graph, ans);
        StringBuilder sb = new StringBuilder();
        for (boolean b : ans) {
            if (b) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
    
    static void setAns(int idx, int parent, boolean value, ArrayList<HashMap<Integer, Boolean>> graph, boolean[] ans) {
        ans[idx] = value;
        for (Map.Entry<Integer, Boolean> entry : graph.get(idx).entrySet()) {
            if (entry.getKey() == parent) {
                continue;
            }
            boolean next = value;
            if (entry.getValue()) {
                next ^= true;
            }
            setAns(entry.getKey(), idx, next, graph, ans);
        }
    }
}