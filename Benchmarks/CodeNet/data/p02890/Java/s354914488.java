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

        for (int i = 1; i < N; i++) {
            Integer[] c = Arrays.copyOf(B, B.length);
            System.out.println(doSomething(i, c));
        }
    }

    private int doSomething(int i, Integer[] c) {
        int ans = 0;
        if(c.length <= i) return 0;
        while(true){
            int min = c[i];
            ans += min;
            for (int j = 0; j < i + 1; j++) {
                if (c[j] == 0) return ans;
                c[j] -= min;
            }
            Arrays.sort(c, Collections.reverseOrder());
        }
    }
}
