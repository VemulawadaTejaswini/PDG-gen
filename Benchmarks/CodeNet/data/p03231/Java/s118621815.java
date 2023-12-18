import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String s = in.next();
        String t = in.next();

        int l = max(n, m);
        while(true) {
            if(l % n != 0 || l % m != 0) {
                l++;
            } else {
                break;
            }
        }

        boolean flag = true;
        int ln = l / n;
        int lm = l / m;
        String x = "";

        for(int i=0; i<l; i++) x.charAt(i) = ' ';

        for(int i=0; i<n; i++) {
            int d = i * ln + 1 - 1;
            x.charAt(d) = s.charAt(i);
        }

        for(int i=0; i<m; i++) {
            int e = i * lm + 1 - 1;
            char tc = t.charAt(i);
            if(x.charAt(e) == ' ' || x.charAt(e) == tc) {
                x.charAt(e) = t.charAt(i);
            } else {
                flag = false;
                break;
            }
        }

        if(flag) {
            System.out.println(l);
        } else {
            System.out.println(-1);
        }
    }
}