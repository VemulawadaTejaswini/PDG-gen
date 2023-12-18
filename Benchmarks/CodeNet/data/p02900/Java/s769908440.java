import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        Set<Integer> so = new HashSet<>();
        int gcd = gcd(A, B);
        so.add(gcd);
        for(int i = 1; i < gcd; i++) {
            if(gcd % i == 0) {
                so.add(i);
            }
        }
        int ans = 0;
        boolean flag;
        for(Integer s : so) {
            flag = true;
            for(Integer ss : so) {
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

    static int gcd (int x,int y) {
        return y>0?gcd(y,x%y):x;}
}