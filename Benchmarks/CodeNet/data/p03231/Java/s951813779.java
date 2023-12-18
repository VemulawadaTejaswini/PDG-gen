import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        char[] sa = s.toCharArray();
        String t = sc.next();
        char[] ta = t.toCharArray();

        int l = lcm(n, m);

        char[] x = new char[l];

        for (int i = 0; i < sa.length; i++) {
            if (i == 0) {
                x[i] = sa[i];
            } else {
                 x[i * (l/sa.length) + 1] = sa[i];
            }
        }

        int rel = l;
        for (int i = 0; i < ta.length; i++) {
            if (i == 0) {
                if (x[i] != ta[i]) {
                    rel = -1;
                    break;
                } 
            } else {
                char tt = x[i * (l/ta.length) + 1];
                 if (tt != '\u0000' && tt != ta[i]) {
                    rel = -1;
                    break;
                 }
            }
        }

        System.out.println(rel);
        sc.close();
    }

    static int lcm (int a, int b) {
        int temp;
        long c = a;
        c *= b;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return (int)(c/b);
    }
}
