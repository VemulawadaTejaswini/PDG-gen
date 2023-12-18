import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] P = new int[N];
        for (int i=0;i<N;i++) {
            P[i] = Integer.parseInt(sc.next());
        }
        int ans = 0;

        int upward = 0;
        int val = 1;
        for (int i=0;i<N;i++) {
            if (P[i]==val) {
                upward++;
                val++;
                if (val>N) break;
            }
        }

        int downward = 0;
        val = N;
        for (int i=N-1;i>=0;i--) {
            if (P[i]==val) {
                downward++;
                val--;
                if (val<0) break;
            }
        }

        System.out.println(Math.min(N-upward, N-downward));
    }
}