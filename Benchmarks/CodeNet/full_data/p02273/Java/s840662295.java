import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] p1 = {0, 0};
        double[] p2 = {100, 0};

        print(p1);
        koch(n, p1, p2);
        print(p2);

        sc.close();
    }

    private static void koch(int n, double[] p1, double[] p2) {
        if(n == 0) return;

        double[] s = new double[2];
        double[] u = new double[2];
        double[] t = new double[2];

        s[0] = (p1[0] * 2 + p2[0]) / 3;
        s[1] = (p1[1] * 2 + p2[1]) / 3;
        t[0] = (p1[0] + p2[0] * 2) / 3;
        t[1] = (p1[1] + p2[1] * 2) / 3;

        u[0] = (t[0] - s[0]) * Math.cos(Math.PI / 3) - (t[1] - s[1]) * Math.sin(Math.PI / 3) + s[0];
        u[1] = (t[0] - s[0]) * Math.sin(Math.PI / 3) + (t[1] - s[1]) * Math.cos(Math.PI / 3) + s[1];

        koch(n - 1, p1, s);
        print(s);
        koch(n - 1, s, u);
        print(u);
        koch(n - 1, u, t);
        print(t);
        koch(n - 1, t, p2);
    }

    private static void print(double[] p) {
        System.out.printf("%.8f %.8f\n", p[0], p[1]);
    }
}
