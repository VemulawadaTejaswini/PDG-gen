import java.io.PrintWriter;
import java.util.*;
//https://qiita.com/p_shiki37/items/3902f4e3adc3aeb382f1

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        sc.close();

        int n = 0;
        outside: for (int j=2; j<N/2+1; j--) {
            for(int i=0; j<N-i-j+1; i++) {
                String s1 = S.substring(i, i + j);
                int es = S.indexOf(s1, i + j);
                if (es > 0) {
                    n = j;
                    break outside;
                }
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(n);
        out.flush();
    }
}