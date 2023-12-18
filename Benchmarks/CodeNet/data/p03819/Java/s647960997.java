import java.util.*;

/**
 * Created by zzt on 17-1-29.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> stations = new ArrayList<>();
        for (int i = 0; i <= m; i++) {
            stations.add(new ArrayList<>());
        }

        int l, r;
        for (int i = 0; i < n; i++) {
            l = scanner.nextInt();
            r = scanner.nextInt();
            for (int j = l; j <= r; j++) {
                stations.get(j).add(i);
            }
        }

        Set<Integer> s = new TreeSet<>();
        for (int i = 1; i <= m; i++) {
            s.clear();
            for (int j = 0; j <= m; j++) {
                if (j % i == 0)
                    s.addAll(stations.get(j));
            }
            System.out.println(s.size());
        }
    }
}