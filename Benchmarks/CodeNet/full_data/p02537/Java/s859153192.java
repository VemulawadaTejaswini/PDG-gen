import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int tmp = A[0];
        int count = 0;
        for (int i = 1; i < N; i++) {
            int now = A[i];
            int abs = Math.abs(now-tmp);
            if (abs <= K) {
                count++;
                tmp = now;
            }
        }
        System.out.println(count+1);
    }
}
