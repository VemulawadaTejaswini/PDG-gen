import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();
        
        int[] memo = new int[N];
        char[] chars = S.toCharArray();
        memo[0] = chars[0] == 'E' ? 1 : 0;
        for (int i = 1; i < N; i++) {
        	memo[i] = chars[i] == 'E' ? memo[i - 1] + 1 : memo[i - 1];
        }
        
        int ans = memo[N - 1] - memo[1];
        for (int i = 1; i < N; i++) {
        	int head = (i + 1) - (memo[i] - memo[0]);
        	int tail = memo[N - 1] - memo[i];
        	ans = Math.min(ans, head + tail);
        }
        
        System.out.println(ans);
        
    }
}
