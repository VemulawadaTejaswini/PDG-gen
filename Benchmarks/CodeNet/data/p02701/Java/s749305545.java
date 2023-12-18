import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        abc164_c solver = new abc164_c();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc164_c {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long N = in.nextLong();
            //String S[] = new String[2147483647];
//          String S[] = new String[9999999];
            int brakecount = 0;
            HashMap<String, Integer> S = new HashMap<String, Integer>();
            for (long i = 0; i < N; i++) {
                String inS = in.next();
                if (!S.containsKey(inS)) {
                    S.put(inS, 0);
                    brakecount++;
                }
            }
        /*
        Arrays.sort(S);
        String oldS = "";
        for (String item :S
             ) {
            if (oldS.isEmpty()) {
                oldS = item;
            }
            if(item.compareTo(oldS)!=0){
                brakecount++;
            }
        }
        */
            out.println(brakecount);
        }

    }
}

