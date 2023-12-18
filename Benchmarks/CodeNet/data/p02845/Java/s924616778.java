import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        long ans = 1;
        int[] num = new int[N+2];
        num[0] = 3;
        for (int i = 0; i < N; i++) {
            if (num[A[i]] == 0) {
                ans = 0;
                break;
            }

            ans *= num[A[i]];
            ans %= 1_000_000_007;;

            num[A[i]]--;
            num[A[i]+1]++;
        }
        
        System.out.println(ans);
    }
}
