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
            int x = 0;
            String[] ss = new String[n];
            for (int i = 0; i < n; i++) {
                ss[i] = br.readLine();
            }
            for(int i=n-1;i>=0;i--){
                String[] s = ss[i].split(" ", 0);
                int a = x + Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);
                int c = a % b;
                BigInteger ci = BigInteger.ZERO;
                if (b != 1&&c!=0) {
                    x += b-c;
                    ci = BigInteger.valueOf(b - c);
                }
                answer = answer.add(ci);
            }
            System.out.println(answer);
        } catch (Exception ex) {
            System.exit(0);
        }
    }
}