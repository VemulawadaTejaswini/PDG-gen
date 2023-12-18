import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long ans = Long.MAX_VALUE;
        for(long a=1; a*a<=n; a++) {
            if(n % a == 0) {
                long b = n / a;
                int digits = Math.max(String.valueOf(a).length(), String.valueOf(b).length());
                ans = Math.min(ans,digits);
            }
        }
        System.out.println(ans);
    }
}
