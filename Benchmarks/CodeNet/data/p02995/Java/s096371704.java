import java.util.Scanner;

/**
 * @author yoshizaki
 *131
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        long min = scanner.nextLong();
        long max = scanner.nextLong();
        long divider1 = scanner.nextLong();
        long divider2 = scanner.nextLong();
        long ans = 0l;
        
        if(min == max && (min == divider1 || min == divider2)) {
            ans = 0;
        } else {
            
        long min1 = min / divider1;
        if (min % divider1 == 0) min1 -=1;
        long max1 = max / divider1;
        
        long min2 = min / divider2;
        if (min % divider2 == 0) min2 -=1;
        long max2 = max / divider2;
        
        long crossDivider = lcm(divider1, divider2);
        long crossmin = min / crossDivider;
        if (min % crossDivider == 0) crossmin -=1;
        long crossmax = max / crossDivider;
        
        long mm = max1 - min1;
        long nn = max2 - min2;
        long cc = crossmax - crossmin;
        ans = (max - min + 1) -(mm + nn - cc);
        }
        
        System.out.println(ans);
    }
    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }
    
    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}
