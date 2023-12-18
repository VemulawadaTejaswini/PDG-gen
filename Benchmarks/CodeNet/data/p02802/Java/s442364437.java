import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] t = new int[n];
        int[] f = new int[n];

        for (int i = 0; i < m; i++) {
            int v = sc.nextInt() - 1;
            String s = sc.next();
            if (s.contains("AC")) {
                t[v] = 1;
            } else {
                f[v] = 1;
            }
        }

        //解析
        int ct_t = 0;
        int ct_f = 0;
        for (int i = 0; i < n; i++) {
            ct_t += (t[i] == 0)? 0 : 1;
            ct_f += (f[i] == 0)? 0 : 1;
        }

        System.out.println(ct_t + " " + ct_f);
    }
}