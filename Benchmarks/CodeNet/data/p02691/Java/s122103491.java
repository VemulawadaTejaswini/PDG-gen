
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] A = new int[N];
        for (int i=0;i<N;i++) A[i] = in.nextInt();

        // j - i == Ai + Aj
        // j - Aj == i + Ai

        Map<Integer, Integer> m1 = new HashMap<>(), m2 = new HashMap<>();
        for (int i=0;i<N;i++) {
            m1.put(i+1+A[i], m1.getOrDefault(i+1+A[i], 0) + 1);
            m2.put(i+1-A[i], m2.getOrDefault(i+1-A[i], 0) + 1);
        }

        int ret = 0;
        for (int k : m1.keySet()) {
            if (!m2.containsKey(k)) continue;
            ret += m1.get(k) * m2.get(k);
        }

        System.out.println(ret);
    }
}
