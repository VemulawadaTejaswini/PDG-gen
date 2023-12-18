import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        P[] Ps = new P[M];

        for (int m = 0; m < M; m++) {
            P p = new P();
            p.s = in.nextInt();
            p.c = in.next();
            Ps[m] = p;
        }

        for (int i = (int) Math.pow(10, N - 1); i < Math.pow(10, N); i++) {
            boolean b = true;
            for (P p : Ps) {
                String s = Integer.toString(i);
                if (s.charAt(p.s - 1) != p.c.charAt(0)) {
                    b = false;
                    break;
                }
            }

            if (b) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}

class P {
    public int s;
    public String c;
}

