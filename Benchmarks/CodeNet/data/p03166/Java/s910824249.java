
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer, Set<Integer>> nodes = new HashMap<>();
        for (int i = 1; i <= m; ++i) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Set<Integer> formers = nodes.getOrDefault(y, new HashSet<>());
            formers.add(x);
            nodes.put(y, formers);
        }
        int [] path = new int[n + 1];
        boolean isUpdate = true;
        while (isUpdate) {
            isUpdate = false;
            for (int i = 1; i <= n; ++i) {
                for (Integer former : nodes.getOrDefault(i, new HashSet<>())) {
                    if (path[i] < path[former] + 1) {
                        path[i] =  path[former] + 1;
                        isUpdate = true;
                    }
                }
               // System.out.println("path[" + i + "]: " + path[i]);
            }
        }
        int maxPath = 0;
        for (int i = 1; i <= n; ++i) {
            maxPath = Math.max(maxPath, path[i]);
        }
        System.out.println(maxPath);
    }
}
