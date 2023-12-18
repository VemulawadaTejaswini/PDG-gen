import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        Set<Long> so = new HashSet<>();
        long gcd = gcd(A, B);
        so.add(gcd);
        for(long i = 1; i < gcd; i++) {
            if(gcd % i == 0) {
                so.add(i);
            }
        }
        int ans = 0;
        boolean flag;
        for(Long s : so) {
            flag = true;
            for(Long ss : so) {
                if(s <= ss) continue;
                if(gcd(s, ss) != 1) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    static long gcd (long x,long y) {
        return y>0?gcd(y,x%y):x;}
}