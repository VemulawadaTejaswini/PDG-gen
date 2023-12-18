
import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    static int a;
    static int b;
    static int c;
    static int x;

    public static void main(String[] args) {
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        x = sc.nextInt();
        System.out.println(solve());
    }

    /**
     * 1000
     * 500*2 0
     * 500 100*2
     * 0 100*10
     */

    /**
     * 1200
     * 500*2 100*2
     * 500*1 100*7
     * 500*0 100*12
     */
    private static int solve() {
        int count = 0;
        int i = (x / 500) > a ? a : (x / 500);
        while (i >= 0) {
            int tmpa = i == 0 ? x : x % (i * 500);
            int j = (tmpa / 100) > b ? b : (tmpa / 100);
            while (j >= 0) {
                int tmpb = j == 0 ? tmpa : tmpa % (j * 100);
                int tmpc = tmpb % (50);
                if (tmpc == 0 && tmpc / 50 > 0) {
                    count++;
                }
                j--;
            }
            i--;
        }
        return count;
    }
}
