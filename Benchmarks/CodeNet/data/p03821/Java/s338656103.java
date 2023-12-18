import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String st = br.readLine();
            int n = Integer.parseInt(st);
            BigInteger answer = BigInteger.ZERO;
            BigInteger x = BigInteger.ZERO;
            String[] ss = new String[n];
            for (int i = 0; i < n; i++) {
                ss[i] = br.readLine();
            }
            for(int i=n-1;i>=0;i--){
                String[] s = ss[i].split(" ", 0);
                BigInteger a = x.add(new BigInteger(String.valueOf(s[0])));
                BigInteger b = new BigInteger(String.valueOf(s[1]));
                BigInteger c = a.remainder(b);
                BigInteger ci = BigInteger.ZERO;
                if (b!=BigInteger.ONE&&c!=BigInteger.ZERO) {
                    ci = b.subtract(c);
                    x = x.add(ci);
                }
                answer = answer.add(ci);
            }
            System.out.println(answer);
        } catch (Exception ex) {
            System.exit(0);
        }
    }
}