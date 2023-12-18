import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * @Author: Harry
 * @Date: 2019-11-17
 * @Version 1.0
 */
public class Main {
    static BigInteger mod = new BigInteger(String.valueOf(1000000000 + 7));

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        static int arr[], t, n, arr2[];

        public void solve(int testNumber, InputReader input, PrintWriter out) {
//            while (true) {
                long x = input.nextLong();
                long y = input.nextLong();

                long n = (2 * y - x) / 3;
                long m = (2 * x - y) / 3;

                if(judge(x,y,n,m)){
                    out.println(cal(n,m).toString());
                }
                else{
                    out.println(0);
                }

            out.flush();
//            }
        }

    }


    public static BigInteger cal(long n,long m){
        BigInteger nn = BigInteger.valueOf(n);
        BigInteger mm = BigInteger.valueOf(m);

        return cn(nn.add(mm),BigInteger.valueOf(Math.min(n,m)));
    }

    public static BigInteger cn(BigInteger n,BigInteger m){
        if(m.equals(BigInteger.ZERO)){
            return BigInteger.ONE;
        }

        int nn = n.intValue();
        int mm = m.intValue();
        BigInteger fac[] = new BigInteger[nn + 5];
        BigInteger inv[] = new BigInteger[nn + 5];

        fac[0] = BigInteger.ONE;
        inv[0] = BigInteger.ONE;

        for(int i = 1;i <= nn;i++){
            fac[i] = fac[i - 1].multiply(BigInteger.valueOf(i)).mod(mod);
        }

        inv[nn] = get_inv(fac[nn]);
        for(int i = nn - 1;i >= 1;i--){
            inv[i] = inv[i + 1].multiply(BigInteger.valueOf(i + 1)).mod(mod);
        }

        BigInteger ans = fac[nn];

        ans = ans.multiply(inv[nn - mm]).mod(mod);
        ans = ans.multiply(inv[mm]).mod(mod);

        return ans.mod(mod);

    }

    public static boolean judge(long x,long y,long n,long m){
        if((x + y) % 3 != 0){
            return false;
        }


        if(n < 0 || m < 0){
            return false;
        }

//        System.err.println(n + " " + m);

        return true;
    }


    static BigInteger quickpow(BigInteger a,BigInteger b){
        BigInteger ans = BigInteger.ONE;
        BigInteger two = new BigInteger("2");
        while(!b.equals(BigInteger.ZERO)){
            if(!b.mod(two).equals(BigInteger.ZERO)){
                ans = ans.multiply(a).mod(mod);
            }
            a = a.multiply(a).mod(mod);

            b = b.shiftRight(1);
        }

        return ans;
    }

    static BigInteger get_inv(BigInteger x){
        BigInteger two = new BigInteger("2");
        return quickpow(x,mod.subtract(two));
    }


    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public float nextFloat() {
            return Float.parseFloat(next());
        }

        public BigInteger nextBigInteger(){
            return new BigInteger(next());
        }


    }
}