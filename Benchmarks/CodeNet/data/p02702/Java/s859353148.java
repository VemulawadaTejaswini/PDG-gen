import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = in.nextLine();
        Set<String> vals = new HashSet<>();
        int res = 0;
        BigInteger mod = BigInteger.valueOf(2019);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                if (vals.contains(substring)) {
                    res++;
                } else {
                    BigInteger b = new BigInteger(substring);
                    if (b.mod(mod).equals(BigInteger.ZERO)) {
                        vals.add(substring);
                        res++;
                    }
                }
            }
        }
        System.out.println(res);
    }
}