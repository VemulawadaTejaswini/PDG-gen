import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }
        Arrays.sort(cards);
        
        int[][] ab = new int[m][2];
        for (int i = 0; i < m; i++) {
            ab[i][0] = sc.nextInt();
            ab[i][1] = sc.nextInt();
        }
        
        Arrays.sort(ab, (x, y) -> Integer.compare(y[0], x[0]));
        
        int idx = 0;
        for (int i = 0; i < m; i++) {
            int k = ab[i][0];
            int v = ab[i][1];
            
            for (int j = 0; j < k; j++) {
                if (cards[idx] >= v) break;
                cards[idx] = v;
                idx++;
            }
        }
        
        long answer = 0;
        for (int val : cards) {
            answer += (long)val;
        }
        
        System.out.println(answer);
    }
}