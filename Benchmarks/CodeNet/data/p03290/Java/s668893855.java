import java.util.*;
//https://atcoder.jp/contests/abc104/tasks/abc104_c

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int D = Integer.parseInt(sc.next());
        final int G = Integer.parseInt(sc.next())/100;
        int p[] = new int[D];
        int c[] = new int[D];
        int m[] = new int[D];
        int n[] = new int[D];
        for (int i=0; i<D; i++) {
            p[i] = Integer.parseInt(sc.next());
            c[i] = Integer.parseInt(sc.next())/100;
            m[i] = p[i]*(i+1);
            n[i] = m[i]+c[i];
        }
        sc.close();

        boolean f = false;
        int min = Integer.MAX_VALUE;
        for (int i=D-1; i>=0; i--) {
            if (m[i]>=G) {
                f = true;
                for (int j=0; j<p[i]; j++) {
                    if ((i+1)*(j+1)>=G && min>j) {
                        min = j;
                    }
                }
            }
        }
        for (int i=0; i<D; i++) {
            if (n[i]>=G) {
                f = true;
                if (min>p[i]+1)
                    min = p[i];
            }
        }
        if (f) {
            System.out.println(min);
            return;
        }
        int sum = n[D-1];
        int cnt = p[D-1];
        for (int i= D-2; i>=0; i--) {
            if (sum+n[i]==G) {
                System.out.println(cnt+p[i-1]);
                return;
            } else if (sum+n[i]>G) {
                for (int j=0; j<p[i]; j++) {
                    sum += i+1;
                    if (sum>=G) {
                        System.out.println(cnt+j+1);
                        return;
                    }
                }
                sum += c[i];
            } else {
                sum += n[i];
                cnt += p[i];
            }
        }
    }
}