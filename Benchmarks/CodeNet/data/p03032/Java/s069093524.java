import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    // static final int modnum = 1e9 + 7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        LinkedList<Integer> value = new LinkedList<Integer>();

        for (int i = 0; i < N; i++) {
            int in = sc.nextInt();
            value.add(in);
        }

        // Node[] dp = new Node[K+1];
        // dp[0] = new Node(new LinkedList<Integer>(), new LinkedList<Integer>(value));
        // dp[1] =

        long ans = 0;
        for (int al = 0; al <= N && al <= K; al++) {
            int i,j;
            for (i = 0; i <= al; i++) {
                for (j = 0; j < al - i; j++) {
                    LinkedList<Integer> hand = new LinkedList<Integer>();
                    
                    
                    for(int u=0;u<i;u++){
                        hand.add(value.get(u));
                    }
                    for(int u=0;u<j;u++){
                        hand.add(value.get(value.size() - u - 1));
                    }

                    Collections.sort(hand);
                    // System.out.println(al+":"+i+":"+j+Arrays.toString(hand.toArray()));
                    for (int k = 0; k <= K - al && hand.size() > 0; k++) {
                        if (hand.get(0) < 0)
                            hand.remove(0);
                        else
                            break;
                    }
                    // System.out.println(al+":"+i+":"+j+Arrays.toString(hand.toArray()));
                    long ret = 0;
                    for (int num : hand) {
                        ret += num;
                        ans = Math.max(ans, ret);
                    }

                }
            }
        }
        
        System.out.println(ans);
    }
}