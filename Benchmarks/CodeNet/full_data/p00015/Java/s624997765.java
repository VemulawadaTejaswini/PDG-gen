import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.math.BigInteger;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            BigInteger a = new BigInteger(reader.readLine());
            BigInteger b = new BigInteger(reader.readLine());
            String result = "overflow";
            if (!isOverflow(a) && !isOverflow(b)) {
                BigInteger c = a.add(b);
                if (!isOverflow(c)) {
                    result = c.toString();
                }
            }
            out.println(result);
        }
    }
    
    static boolean isOverflow(BigInteger bi) {
        return bi.abs().toString().length() > 80;
    }
}