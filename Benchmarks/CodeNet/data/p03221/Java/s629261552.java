import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int M = Integer.parseInt(scanner.next());

        // 県ごとに年を持つ
        TreeMap<Integer, int[]> yearMap = new TreeMap<>();
        for (int i = 0; i < M; i++) {
            int prefectureId = Integer.parseInt(scanner.next());
            int year = Integer.parseInt(scanner.next());

            int[] array = new int[2];
            array[0] = prefectureId;
            array[1] = i;
            yearMap.put(year, array);
        }

        String[] ans = new String[M];
        int[] indexArray = new int[N + 1];

        for (int[] array : yearMap.values()) {
            indexArray[array[0]]++; // 県ごとのindex
            ans[array[1]] = String.format("%06d%06d", array[0], indexArray[array[0]]);
        }
        for (int i = 0; i < M; i++) {
            System.out.println(ans[i]);
        }

        scanner.close();
    }
}
