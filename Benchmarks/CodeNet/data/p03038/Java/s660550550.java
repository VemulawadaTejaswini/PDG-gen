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
        
        while (m-- > 0) {
            Arrays.sort(cards);
            int k = sc.nextInt();
            int v = sc.nextInt();
            for (int i = 0; i < k; i++) {
                if (cards[i] >= v) break;
                cards[i] = v;
            }
        }
        
        long answer = 0;
        for (int val : cards) {
            answer += (long)val;
        }
        
        System.out.println(answer);
    }
}