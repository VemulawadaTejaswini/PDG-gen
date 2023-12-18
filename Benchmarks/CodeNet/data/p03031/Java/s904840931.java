import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            int n = sc.nextInt();
            int m = sc.nextInt();

            ArrayList[] l = new ArrayList[m];
            for (int i = 0; i < m; i++) {
                int cnt = sc.nextInt();
                l[i] = new ArrayList();
                for (int j = 0; j < cnt; j++) l[i].add(sc.nextInt() - 1);
            }

            int[] p = new int[m];
            for (int i = 0; i < p.length; i++) p[i] = sc.nextInt();

            int ret = 0;
            for (int st = 0; st < 1 << n; st++) {
                int lighted = 0;
                for (int i = 0; i < l.length; i++) {
                    ArrayList<Integer> wiring = l[i];

                    int acc = 0;
                    for (Integer w : wiring) {
                        acc = (acc + (st >>> w & 1)) % 2;
                    }

                    if (acc == p[i]) lighted++;
                }

                if (lighted == m) ret++;
            }

            out.println(ret);
        }
    }
    
}
