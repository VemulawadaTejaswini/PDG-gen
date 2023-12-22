import java.util.Scanner;

public class Main {
    private static final long MAX = 1000000000000000000L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long ans = 1;
        boolean overflg = false;
        boolean zeroflg = false;

        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            ans *= a;

            if (ans < 0) {
                overflg = true;
            }
            
            if (a == 0) {
                zeroflg = true;
            }
        }
        
        if ( (!zeroflg && overflg) || ans > MAX) {
            System.out.println("-1");
        } else {
            System.out.println(ans);
        }
    }
}