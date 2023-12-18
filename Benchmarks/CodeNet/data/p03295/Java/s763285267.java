import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] memo = new int[n-1];
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = a-1; j < b-1; j++) {
                memo[j]++;
            }

            list.add(new int[]{a, b});
        }

        int count = 0;
        boolean[] memo2 = new boolean[n-1];
        for (int[] ab : list) {
            int a = ab[0] - 1;
            int b = ab[1] - 1;
            int max = 0;
            int maxBridge = 0;
            for (int i = a; i < b; i++) {
                if (max < memo[i]) {
                    max = memo[i];
                    maxBridge = i;
                }
            }
            if (!memo2[maxBridge]) {
                memo2[maxBridge] = true;
                count++;
            }
        }
        System.out.println(count);
    }
}
