import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+1];
        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }
        Map<Integer, Integer> diff = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            int d = i-A[i];
            diff.put(d, diff.getOrDefault(d,0)+1);
        }
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            int sum = i+A[i];
            ans += diff.getOrDefault(sum,0);
        }
        System.out.println(ans);
    }
}

