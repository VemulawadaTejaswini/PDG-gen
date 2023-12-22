import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve2(N, A));
    }

    private static int solve2(int N, int[] A) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<N; i++) {
            count += map.getOrDefault(i - A[i], 0);
            int val = map.getOrDefault(i+A[i], 0);
            map.put(i+A[i], val+1);
        }

        return count;
    }
}