import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(sc.next()) - 1;
            int b = Integer.parseInt(sc.next()) - 1;
            if (!map.containsKey(a)) {
                map.put(a, new ArrayList<>());
            }
            map.get(a).add(b);
            if (!map.containsKey(b)) {
                map.put(b, new ArrayList<>());
            }
            map.get(b).add(a);
        }
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(0);
        while (!dq.isEmpty()) {
            int temp = dq.poll();
            List<Integer> list = map.get(temp);
            for (int num : list) {
                if (ans[num] == -1) {
                    ans[num] = temp;
                    dq.add(num);
                }
            }
        }
        System.out.println("Yes");
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n; i++) {
            sb.append(ans[i] + 1);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}