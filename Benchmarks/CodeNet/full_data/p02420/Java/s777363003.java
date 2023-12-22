import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        try {
            int m, i, j, k, wl;
            Scanner sc = new Scanner(System.in);
            String s;
            String[] r = new String[10];
            char[] t = new char[200];
            int[] h = new int[100];

            for (i = 0; true; i++) {
                s = sc.nextLine();
                if (s.equals("-")) break;

                wl = s.length();

                char[] w = new char[wl];

                for (j = 0; j < wl; j++) {
                    w[j] = s.charAt(j);
                }

                s = sc.nextLine();
                m = Integer.parseInt(s);

                for (j = 0; j < m; j++) {
                    s = sc.nextLine();
                    h[j] = Integer.parseInt(s);
                }

                for (j = 0; j < m; j++) {
                    for (k = 0; k < h[j]; k++) {
                        t[k] = w[k];
                    }
                    for (k = h[j]; k < wl; k++) {
                        w[k-h[j]] = w[k];
                    }
                    for (k = wl-h[j]; k < wl; k++) {
                        w[k] = t[k-wl+h[j]];
                    }
                }
                r[i] = new String(w);
            }
            sc.close();

            int I = i;

            for (i = 0; i < I; i++) {
                System.out.println(r[i]);
            }
        }
        catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}
