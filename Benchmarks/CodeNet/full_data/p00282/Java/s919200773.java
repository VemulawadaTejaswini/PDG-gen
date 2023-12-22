
import java.math.BigInteger;
import java.util.*;

import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {
    int INF = 1 << 28;
    String[] unit = {  "",  "Man", "Oku", "Cho", "Kei", 
                     "Gai",  "Jo", "Jou",  "Ko", "Kan", 
                     "Sei", "Sai", "Gok", "Ggs", "Asg", 
                     "Nyt", "Fks", "Mts"};
    void run() {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int m = sc.nextInt(), n = sc.nextInt();
            if ((m|n) == 0) break;
            BigInteger bi = BigInteger.valueOf(m);
            bi = bi.pow(n);
            String ans = ""; int p = 0;
            while (!bi.equals(BigInteger.ZERO)) {
                BigInteger[] dr = bi.divideAndRemainder(BigInteger.valueOf(10000));
                int a = dr[1].intValue();
                if (a != 0) ans = "" + a + unit[p] + ans;
                bi = dr[0]; p++;
            }
            System.out.println(ans);
        }
    }
    
    void debug(Object...os) {
        System.out.println(deepToString(os));
    }
    
    public static void main(String[] args) {
        new Main().run();
    }
}