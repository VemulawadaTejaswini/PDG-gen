import java.util.*;

public class Main {
    static int N;
    static int M;
    static int K;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        K = sc.nextInt();
        int pow2M =(int) Math.pow(2,M);
        if (K >= pow2M) {
            System.out.println(-1);
            return;
        } 
        if (M == 1 && K == 1) {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < pow2M; i++) {
            if (i != K) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.print(K);
        System.out.print(" ");
        for (int i = pow2M - 1; i >= 0; i--) {
            if (i != K) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.println(K);
   }
}