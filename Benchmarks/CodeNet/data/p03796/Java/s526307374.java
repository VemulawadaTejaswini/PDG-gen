import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        sc.close();

        int mod = 1000000007;
        long p = 1;
        
        for(long i=1; i<=n; i++) {
            p = p * i % mod;
        }
        System.out.println(p);
    }
}
