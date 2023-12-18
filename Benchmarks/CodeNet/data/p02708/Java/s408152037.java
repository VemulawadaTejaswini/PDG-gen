import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long ans = 0;
        for (int i=1;i<=(n+1);i++) {
            if (i>=k) {
                ans += (n - i + 2) * i - (i - 1);
                while (ans>1000000007) {
                    ans-=1000000007;
                }
            }
        }
        System.out.println(ans);
    }
}
