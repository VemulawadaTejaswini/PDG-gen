import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        DecimalFormat df = new DecimalFormat("0.00000000");

        final int N = Integer.parseInt(sc.next());
        final int A = Integer.parseInt(sc.next());
        final int B = Integer.parseInt(sc.next());
        char[] ch = sc.next().toCharArray();
        int pass = 0;
        int rank = 0;
        for (int i=0; i<N; i++) {
            if (ch[i] == 'b')   rank++;
            if (ch[i] == 'a' && pass < A+B) {
                out.println("Yes");
                pass++;
            } else if (ch[i] == 'b' && pass < A+B && rank <= B) {
                out.println("Yes");
                pass++;
            } else {
                out.println("No");
            }
        }
        
        out.flush();
    }
}