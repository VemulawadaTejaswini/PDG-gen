import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] in = br.readLine().split(" ");
        BigInteger[] a = new BigInteger[n];
        for(int i = 0; i < n; i++) {
            a[i] = new BigInteger(in[i]);
        }
        BigInteger l = new BigInteger(a[0].toString());
        for(int i = 1; i < n; i++) l = l.divide(l.gcd(a[i])).multiply(a[i]);

        BigInteger ans = new BigInteger(String.valueOf(0));
        for(int i = 0; i < n; i++) {
            ans = ans.add(l.divide(a[i]));
        }
        BigInteger mod = new BigInteger(String.valueOf(1000000007));
        System.out.println(ans.remainder(mod).toString());
    }
}
