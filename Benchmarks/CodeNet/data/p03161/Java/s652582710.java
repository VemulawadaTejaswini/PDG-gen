import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static final int inf = 0x3f3f3f3f;
    public static void main(String[] args) {
        int N = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[N + 1],f = new int[N + 1];
        for(int i = 1; i <= N; i ++) a[i] = sc.nextInt();
//        f[0] = 0;f[1] = inf;
        for(int i = 2; i <= N; i++){
            for(int j = 1; j <= k; j ++){
                if(i > j){
                    if(f[i] > 0)f[i] = Math.min(Math.abs(a[i] - a[i - j]) + f[i - j],f[i]);
                    else f[i] = Math.abs(a[i] - a[i - j]) + f[i - j];
                }else break;
            }
        }
        System.out.println(f[N]);
    }
}