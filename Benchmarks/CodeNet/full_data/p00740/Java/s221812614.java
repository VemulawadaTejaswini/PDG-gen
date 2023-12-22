import java.util.Scanner;

/**
 * @author yousack
 */
public class Main {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (true) {
            int n = in.nextInt();
            int p = in.nextInt();
            if (n == 0 && p == 0) {
                break;
            } else {
                solve(n, p);
            }
        }
    }
    
    public static void solve(int n, int p) {
        int[] cand = new int[n];
        int tmpP = p;
        cand[0] += 1;
        tmpP -= 1;

        for (int i = 1; ; i = (i + 1) % n) {
            if (tmpP == 0) {
                tmpP = cand[i];
                cand[i] = 0;
            } else {
                tmpP -= 1;
                cand[i] += 1;
            }
            
            if (cand[i] == p) {
                System.out.println(i);
                break;
            }
        }
    }
}