import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int T = in.nextInt();
        long s = 0;
        int t_prev = in.nextInt();
        for(int i=2; i<=n; i++) {
            int t = in.nextInt();
            s += Math.min(T, t-t_prev);
            t_prev = t;
        }
        s += T;
        System.out.println(s);
    }
}
