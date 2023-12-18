import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]) + 1);
            } else {
                map.put(A[i], 1);
            }
        }
        Integer[] B = new Integer[map.size()];
        int index = 0;
        for (Integer i : map.keySet()) {
            B[index] = map.get(i);
            index++;
        }
        Arrays.sort(B, Collections.reverseOrder());

        System.out.println(N);

        for (int i = 2; i < N+1; i++) {
            Integer[] c = Arrays.copyOf(B, B.length);
            System.out.println(doSomething(i, c));
        }
    }

    private int doSomething(int j, Integer[] c) {
        Integer[] m = new Integer[j];
        int min = Integer.MAX_VALUE;
        Arrays.fill(m, 0);
        for (Integer integer : c) {
            m[j - 1] += integer;
            Arrays.sort(m, Collections.reverseOrder());
        }
        for (Integer integer : m) {
            min = Math.min(min, integer);
        }
        return min;
    }
}
