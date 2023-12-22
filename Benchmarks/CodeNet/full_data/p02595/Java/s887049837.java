import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long d = sc.nextLong();
        d = d * d;

        int ans = 0;
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            
            long dist = x * x + y * y;
            
            if (dist <= d) {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}