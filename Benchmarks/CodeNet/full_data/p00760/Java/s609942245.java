import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int mi = 196470;
    public static long res;
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int y = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();
            res = 0;
            int ty = (y+1)%3;
            int tty = (y-1)/3;
            res += tty * 590;
            if (ty%3==0) {
                res += 195;
                res += calc(m);
                res += d;
            } else if (ty%3==1) {
                res += 390;
                res += (m-1)*20;
                res += d;
            } else if (ty%3==2) {
                res += calc(m);
                res += d;
            }
            System.out.println(mi - res + 1);
        }
    }
    
    public static int calc(int m) {
        int res = 0;
        for (int i = 1; i < m; i++) {
            if (i%2==0) {
                res += 19;
            } else {
                res += 20;
            }
        }
        return res;
    }
}