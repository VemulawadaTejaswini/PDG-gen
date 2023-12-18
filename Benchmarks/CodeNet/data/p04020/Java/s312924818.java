import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] A = new int[N];
        for (int i=0;i<N;i++) {
            A[i] = Integer.parseInt(sc.next());
        }
        long ans = 0L;
        for (int i=0;i<N;i++) {
            ans += A[i]/2;
            if (i<N-1 && A[i]%2==1) {
                if (A[i+1]>0) {
                    A[i]--;
                    A[i+1]--;
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}