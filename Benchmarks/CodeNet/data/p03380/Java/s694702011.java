import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> numberList = new ArrayList<Long>();
        long max = -1;
        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            numberList.add(num);
            max = Math.max(max, num);
        }
        
        long r = -1;
        long maxWaru2 = max / 2;
        for (int i = 0; i < maxWaru2; i++) {
            if (numberList.contains(Long.valueOf(maxWaru2 + i))) {
                r = maxWaru2 + i;
                break;
            } else if (numberList.contains(Long.valueOf(maxWaru2 + i))) {
                r = maxWaru2 - i;
                break;
            }
        }
        
        if (r == -1) r = 0;
        System.out.println(max + " " + r);
    }
    
    public static long comb(long n, long k) {
        if (k > n / 2) {
            k = n - k;
        }
        long a = 1;
        for (long i = n; i > n - k; i--) {
            a *= i;
            System.out.println(a);
        }
        
        long b = 1;
        for (long i = k; i >= 1; i--) {
            b *= i;
        }
        
        return a / b;
    }
}