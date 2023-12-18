import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; ++i) {
            A[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(A);
        int lot = X;
        int ans = 0;
        for (int i = 0; i < N; ++i) {
            if(X < A[0]){
                break;
            }
            lot -= A[i];
            if(lot <= 0) {
                ans = i - 1;
                break;
            }
            ans = i;
        }
        System.out.println(ans);
    }
}