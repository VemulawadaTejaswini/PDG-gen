import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] H = new int[N+1];
        for (int i = 1; i <= N; i++) {
                H[i] = sc.nextInt();
        }
        boolean[] b = new boolean[N+1];
        for (int i = 0; i < M; i++) {
                int A1 = sc.nextInt();
                int B1 = sc.nextInt();
                if (H[A1] < H[B1]) {
                        b[A1] = true;
                } else if (H[A1] > H[B1]) {
                        b[B1] = true;
                } else {
                        b[A1] = true;
                        b[B1] = true;
                }
        }
        int count = 0;
        for (int i = 1; i < b.length; i++) {
                if (!b[i]) count++;
        }
        System.out.println(count);
    }
}