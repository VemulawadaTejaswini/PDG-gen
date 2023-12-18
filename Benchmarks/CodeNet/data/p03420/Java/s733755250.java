import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        // ans: n以下の(a, b)で、a % b >= kになるパターン数
        long ans = 0;
        
        // 2 5 8 ... 
        // 2 3 6 7 ...
        // 2 3 4 7 8 9
        
        // [k, i]
        
        // 15 / 4 3
        // 10 / 3 3
        
        for (int i = k + 1; i <= n; i++) {
            long block = n / i;
            long start = block * i + (k-1);
            long end = n;
            
            ans += block * (i-k);
            if (start <= end) {
                ans += end - start;
            }
        }
        System.out.println(ans);
    }
}