import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static final int inf = 0x3f3f3f3f;
    public static void main(String[] args) {
        int N = sc.nextInt(), W = sc.nextInt();
        int bound = 100 * 1000;
        int[] v = new int[N + 1], w = new int[N + 1];
        long[] f = new long[bound  + 1];
        Arrays.fill(f,inf);
        f[0] = 0;
        for(int i = 1; i <= N; i ++){
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }
        for(int i = 1; i <= N; i++){
            for(int j = bound; j >= w[i]; j --){
                f[j] = Math.min(f[j],f[j - w[i]] + v[i]);
            }
        }
        int res = 0;
        for(int i = 0; i <= bound; i ++){
            if(f[i] <= W)res = i;
        }
//        for(int i = 1; i <= 300; i ++) {
//            if(i % 10 == 0) System.out.println();
//            System.out.print(f[i] + " ");
//        }
        System.out.println(res);
    }
}