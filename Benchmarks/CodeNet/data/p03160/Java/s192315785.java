import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] stones = new int[N];
        for(int i = 0; i < N; i++){
            stones[i] = s.nextInt();
        }

        int[] memo = new int[N];
        memo[0] = 0;
        memo[1] = Math.abs(stones[1] - stones[0]);
        for(int i = 2; i < N; i++){
            memo[i] = Math.min(memo[i-2] + Math.abs(stones[i] - stones[i-2]), memo[i-1] + Math.abs(stones[i] - stones[i-1]));
        }
        System.out.println(memo[N-1]);
    }
}
