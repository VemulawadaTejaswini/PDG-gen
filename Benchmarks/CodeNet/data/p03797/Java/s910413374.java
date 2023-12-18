import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long ans = 0l;
        if(n >= m) {
            ans = m / 2;
        } else {
            long tmp1 = m - (n * 2);
            if(tmp1 < 4) {
                ans = n;
            } else {
                long tmp2 =  tmp1 / 4;
                ans = n + tmp2;
            }
        }
        System.out.println(ans);
    }
}