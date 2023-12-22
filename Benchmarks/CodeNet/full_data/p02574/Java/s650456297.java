import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        boolean[] sieve =  new boolean[1000000];
        for (int i = 2; i < 1000000; i++) if (!sieve[i]) {
            for (int j = i + i; j < 1000000; j += i)
                sieve[j] = true;
        }
        List<Integer> prime = new ArrayList<>();
        for (int i = 2; i < 1000000; i++) if (!sieve[i]) {
            prime.add(i);
        }
        boolean[] b = new boolean[prime.size()];
        boolean pc = true;
        int gcd = 0;
        for (int N = in.nextInt(); N > 0; N--) {
            int A = in.nextInt();
            if (gcd == 0) {
                gcd = A;
            } else if (gcd != 1) {
                gcd = gcd(gcd, A);
            }
            if (pc) {
                for (int i = 0; A != 1; i++) {
                    int p = prime.get(i);
                    if (A % p != 0) continue;
                    if (b[i]) {
                        pc = false;
                        break;
                    }
                    b[i] = true;
                    while (A % p == 0) A /= p;
                }
            }
        }
        if (pc)
            out.println("pairwise coprime");
        else if (gcd == 1)
            out.println("setwise coprime");
        else
            out.println("not coprime");

        out.flush();
    }

    static int gcd(int p, int q) {
        if (p < q) {
            int tmp = p;
            p = q;
            q = tmp;
        }
        while(q != 0) {
            int tmp = p % q;
            p = q;
            q = tmp;
        }
        return p;
    }

    static class Input {
        private BufferedReader br;
        private String[] buff;
        private int index = 0;

        Input(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }
        String nextLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        String next() {
            while (buff == null || index >= buff.length) {
                buff = nextLine().split(" ");
                index = 0;
            }
            return buff[index++];
        }
        byte nextByte() {
            return Byte.parseByte(next());
        }
        short nextShort() {
            return Short.parseShort(next());
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        float nextFloat() {
            return Float.parseFloat(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        BigInteger nextBigInteger() {
            return new BigInteger(next());
        }
        BigDecimal nextBigDecimal() {
            return new BigDecimal(next());
        }
    }
}
