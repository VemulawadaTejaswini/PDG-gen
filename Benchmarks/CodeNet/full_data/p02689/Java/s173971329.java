import java.util.*;

public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        boolean[]goods = new boolean[N];

        int[]H = new int[N];
        for (int i = 0;i < N; i++) {
            H[i] = sc.nextInt();
        }

        for (int i = 0;i < M; i++) {
            int A = sc.nextInt() - 1;
            int B = sc.nextInt() - 1;

            if (H[A] > H[B]) {
                goods[A] = true;
                goods[B] = false;
            } else {
                goods[A] = false;
                goods[B] = true;
            }
        }
        
        int count = 0;
        for (int i = 0;i < N; i++) {
            if(goods[i]) {
                count++;
            }
            
        }
        System.out.println(count);
    }
}