import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arg = sc.nextLine().split(" ");
        int n = Integer.parseInt(arg[0]);
        String d = arg[1];

        int count = 0;
        for (int i = 0; i < n; i++) {
            String[] value = sc.nextLine().split(" ");
            BigInteger x = new BigInteger(value[0]);
            BigInteger y = new BigInteger(value[1]);
            BigInteger xs = x.multiply(x);
            BigInteger ys = y.multiply(y);
            BigInteger comp = xs.add(ys);
            BigInteger dd = new BigInteger(d);
            BigInteger ds = dd.multiply(dd);
            if(comp.compareTo(ds) <= 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
