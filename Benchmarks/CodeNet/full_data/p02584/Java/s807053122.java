import java.util.*;
import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException{
        PrintWriter out = new PrintWriter(System.out);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long X = Long.parseLong(st.nextToken());
        long K = Long.parseLong(st.nextToken());
        long D = Long.parseLong(st.nextToken());

        long best = Math.abs(X)-K*D;
        if (best>=0) {
            out.println(best);
        }
        else {
            K-=X/D;
            X=X%D;
            long b = Math.abs(X-D);
            if (K%2==0) {
                out.println(X);
            }
            else
                out.println(b);
        }


        out.close();
    }

    

}
