import java.util.*;

/**
 * Created by Seiya on 2016/10/16.
 */
public class Main {
     static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N, A, B;
        int[] X = new int[100002];

        N = scanner.nextInt();
        A = scanner.nextInt();
        B = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            X[i] = scanner.nextInt();
        }

        long ans = 0;
        for (int i = 1; i < N; i++) {
            if((X[i] - X[i - 1]) * A < B){
                ans += (X[i] - X[i - 1]) * A;
            }else{
                ans += B;
            }
        }

        System.out.println(ans);


    }





}


