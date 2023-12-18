import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), T = sc.nextInt(), c, t, ans = Integer.MAX_VALUE;
        for (int i = 0; i < N; ++i) {
            c = sc.nextInt();
            t = sc.nextInt();
            if (t <= T) ans = Math.min(c, ans);
        }
        sc.close();
        if (ans == Integer.MAX_VALUE) System.out.print("TLE");
        else System.out.print(ans);
    }
}