import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] P = new int[M];
        int[] Y = new int[M];
        for (int i = 0; i < M; i++) {
            P[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }

        // N県のM番目の生まれた年齢
        HashMap<Integer, PriorityQueue<Integer>> birth = new HashMap<Integer, PriorityQueue<Integer>>();
        for (int i = 0; i < M; i++) {
            PriorityQueue queue = new PriorityQueue<Integer>();
            if (birth.containsKey(P[i])) {
                queue = birth.get(P[i]);
            }
            queue.add(Y[i]);
            birth.put(P[i], queue);
        }

        for (int i = 0; i < M; i++) {
            Object[] src = birth.get(P[i]).toArray();
            int[] years = new int[src.length];
            for (int j = 0; j < src.length; j++) {
                years[j] = (Integer) src[j];
            }

            int index = binarySearch(years, Y[i]);
            out.printf("%06d%06d%n", P[i], index + 1);
        }
    }

    public static int binarySearch(int[] array, int num) {
        int result = Arrays.binarySearch(array, num);
        return (result >= 0) ? result : ~result;
    }
}
