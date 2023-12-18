import java.util.*;

public class Main {

    static int nAsInt;
    static int count;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        int[][] prefYears = new int[M][2];
        Map<Integer, List<Integer>> prefectureToYears = new HashMap<>();

        for (int i = 0; i < M; i++) {
            int p = in.nextInt();
            int y = in.nextInt();
            prefYears[i] = new int[] {p, y};
            if (!prefectureToYears.containsKey(p)) {
                prefectureToYears.put(p, new ArrayList<>());
            }
            List<Integer> ys = prefectureToYears.get(p);
            ys.add(y);
            prefectureToYears.put(p, ys);
        }

        for (Integer p : prefectureToYears.keySet()) {
            List<Integer> ys = prefectureToYears.get(p);
            Collections.sort(ys);
        }

        for (int i = 0; i < M; i++) {
            int p = prefYears[i][0];
            int y = prefYears[i][1];

            List<Integer> years = prefectureToYears.get(p);
            int ans = Arrays.binarySearch(years.toArray(), y) + 1;
            System.out.println(String.format("%06d", p) + String.format("%06d", ans));
        }
    }
}
