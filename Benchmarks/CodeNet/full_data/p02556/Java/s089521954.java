import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        
        long maxA = 0;
        long minA = Long.MAX_VALUE;
        long maxB = 0;
        long minB = Long.MAX_VALUE;
        
        for (int i = 0; i < N; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            
            long a = x + y;
            long b = x - y;
            
            if (maxA < a) {
                maxA = a;
            }
            if (a < minA) {
                minA = a;
            }
            if (maxB < b) {
                maxB = b;
            }
            if (b < minB) {
                minB = b;
            }
        }
        
        System.out.println(Math.max(maxA - minA, maxB - minB));
    }
}
