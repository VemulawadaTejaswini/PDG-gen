import java.util.*;

public class Main {
    private static final long INF = 1L<<60;
    private static long[] dp = new long[100010];
    public static void main(String[] args) throws Exception {
        Arrays.fill(dp,INF);
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        List<Integer> steps = new ArrayList<>();
        for(int i=0;i<N;i++){
            steps.add(Integer.parseInt(sc.next()));
        }
        dp[0] = 0;
        dp[1] = Math.abs(steps.get(0) - steps.get(1));
        for(int i=2;i<N;i++){
            dp[i] = Math.min(dp[i-1] + Math.abs(steps.get(i) - steps.get(i-1)) ,dp[i-2] + Math.abs(steps.get(i) - steps.get(i-2)));
        }
        System.out.println(dp[N-1]);
    }
}
