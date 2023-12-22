import java.util.*;
import java.io.*;
import java.math.*;

class Main
{
    public static void main(String[] args) throws IOException{
        PrintWriter out = new PrintWriter(System.out);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long X = Long.parseLong(st.nextToken());
        long K = Long.parseLong(st.nextToken());
        long D = Long.parseLong(st.nextToken());

        X = Math.abs(X);
        BigInteger best = BigInteger.valueOf(X).subtract(BigInteger.valueOf(K).multiply(BigInteger.valueOf(D)));
        if (best.compareTo(BigInteger.ZERO)>=0) {
            out.println(best.longValue());
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
