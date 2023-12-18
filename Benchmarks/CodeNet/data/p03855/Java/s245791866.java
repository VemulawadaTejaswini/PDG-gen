import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();

        roads = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            roads[i] = i;
        }
        rails = roads.clone();

        for (int i = 0; i < k; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            if (roads[right] != roads[left]) {
                roads[roads[left]] = right;
            }
        }
        for (int i = 0; i < l; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            if (rails[right] != rails[left]) {
                rails[rails[left]] = right;
            }
        }
        for (int i = 1; i <= n; i++) {
            root(i);
            rootR(i);
//            System.out.println("road["+i+"] = " + root(i));
//            System.out.println("rail["+i+"] = " + rootR(i));
        }
        StringBuilder builder = new StringBuilder();
        int[] ans = new int[n + 1];
        Arrays.fill(ans, 1);
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (roads[i] == roads[j] && rails[i] == rails[j]) {
                    ans[i]++;
                    ans[j]++;
                }
            }
            builder.append(ans[i]).append(" ");
        }

        System.out.println( builder.deleteCharAt(builder.length() - 1));
    }

    private static int[] roads;
    private static int[] rails;

    private static int root(int x) {
        if (roads[x] == x) {
            return x;
        } else {
            return roads[x] = root(roads[x]);
        }
    }

    private static int rootR(int x) {
        if (rails[x] == x) {
            return x;
        } else {
            return rails[x] = rootR(rails[x]);
        }
    }
}