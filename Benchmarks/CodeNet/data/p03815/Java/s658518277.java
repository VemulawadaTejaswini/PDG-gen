import java.util.Scanner;

public class Main {
    static long x;
    static int mod = 1000000007;
    static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        x = sc.nextLong();
        long ans = 2* (x/11);
        if (x%11 < 7 && x%11 > 0) {
            ans += 1;
        } else if (x%11 > 8){
            ans += 2;
        }
        System.out.println(ans);
    }
}
