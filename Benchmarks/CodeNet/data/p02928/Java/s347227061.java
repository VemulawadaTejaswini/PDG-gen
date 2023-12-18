import java.util.*;

public class Main {
    static int MAX = 10010017;
    static int MOD = 1000000007;
    static long[] fac;  // 階乗
    static long[] finv;
    static long[] inv;  // 逆元
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        // ans: 連続部分列の和が0になるi, jのパターン数
        long ans = 0;
        
        long count = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (array[i] > array[j]) count++;
            }
        }
        long count2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i] > array[j]) count2++;
            }
        }
        
        
        
        
        long tmp1 = (count * k) % MOD;
        long tmp2 = (((k * (k-1) / 2)%MOD)*count2)%MOD;
        long tmp = (tmp1+tmp2)%MOD;
        System.out.println(tmp);
        
    }
}