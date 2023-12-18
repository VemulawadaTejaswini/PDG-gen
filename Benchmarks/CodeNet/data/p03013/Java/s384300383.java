import java.util.*;

public class Main {
    static int MOD = 1000000007;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] broken = new int[m];
        for (int i = 0; i < m; i++) {
            broken[i] = sc.nextInt();
            
            if (i > 0 && broken[i] - broken[i - 1] == 1) {
                System.out.println("0");
                return;
            }
        }
        
        int oldNum = 0;
        long count = 1;
        
        for (int i = 0; i < m; i++) {
            int num = broken[i];
            count = count * fibonacci((num - 1) - oldNum) % MOD;
            oldNum = num + 1;
        }
        
        count = count * fibonacci(n - oldNum) % MOD;
        
        System.out.println(count);
    }
    
    public static long fibonacci(long n) {
        long num1 = 1;
        long num2 = 1;
        long tmp = 1;
        
        for (long i = 1; i < n; i++) {
            tmp = (num1 + num2) % MOD;
            num1 = num2;
            num2 = tmp;
        }
        
        return tmp;
    }
}
