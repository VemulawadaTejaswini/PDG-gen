import java.util.*;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[m];
        int[] y = new int[m];
        int[] id = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
            y[i] = sc.nextInt();
            id[i] = p[i] * 1000000;
        }
        for (int nn = 0; nn < n; nn++) {
            ArrayList<Integer> year = new ArrayList<>();
            Map<Integer, Integer> key = new HashMap<>();
            for (int i = 0; i < m; i++) {
                if (p[i] - 1 == nn) {
                    year.add(y[i]);
                    key.put(y[i], i);
                }
            }
            Collections.sort(year);
            if (year.size() != 0) {
                for (int i = 0; i < year.size(); i++) {
                    if (p[key.get(year.get(i))] - 1 == nn) id[key.get(year.get(i))] += (i + 1);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.println(String.format("%012d", id[i]));
        }
    }
}
