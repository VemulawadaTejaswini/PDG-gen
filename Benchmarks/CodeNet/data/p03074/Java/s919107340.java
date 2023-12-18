import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
*/public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}
static class TaskD   {
public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        int K = in.nextInt();
        String S = in.next();

        String st = "1";
        String fin = "1_";
        StringBuilder buf = new StringBuilder();
        buf.append(st);
        buf.append(S);
        buf.append(fin);
        S = buf.toString();

        int s1[] = new int[N];
        int f1[] = new int[N];
        int fi = 0;
        int si = 1;
        int cou = 0;

        loop:while(true){
            while(S.charAt(cou) == "1".charAt(0)){
                cou++;
                if(S.charAt(cou) == "_".charAt(0)){
                    f1[fi] = cou-1;
                    break loop;
                }
            }
            f1[fi] = cou-1;
            fi++;
            while(S.charAt(cou) == "0".charAt(0)){
                cou++;
            }
            s1[si] = cou-1;
            si++;
        }
        f1[fi]--;

        if(K >= si-1){
            out.println(S.length()-3);
        } else {
            int max = 0;
            for(int i=0; i<=si-1 - K + 1; i++){
                max = Math.max(max, f1[K+i]-s1[i]);
            }
            out.println(max);
        }

    }

}
}

