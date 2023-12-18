import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        int[]  t = new int[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            t[i] = sc.nextInt();
        }

        String x  = sc.next();

        // logic
        int v;
        for (v = 0; v < n; v++) {
            if (x.contains(s[v])) break;
        }

        long ct = 0;
        for (int i = v + 1; i < n; i++) {
            ct += t[i];
        }
        System.out.println(ct);
    }
}