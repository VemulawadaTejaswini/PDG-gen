import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static int resolve(int n, int p, String s) {
        int counter = 0;
        BigInteger bp = new BigInteger(String.valueOf(p));
        BigInteger b0 = new BigInteger(String.valueOf(0));
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                // System.out.println(s.substring(i, j));
                BigInteger bi = new BigInteger(s.substring(i, j));
                if (bi.mod(bp).equals(b0)) {
                    //System.out.println(bi);
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        //System.out.println(resolve(1,3,"01230"));

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        String s = sc.next();
        System.out.println(resolve(n, p, s));
    }
}
