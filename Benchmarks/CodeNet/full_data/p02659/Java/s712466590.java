

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String[] s = in.nextLine().split(" ");
        final BigDecimal first = new BigDecimal(s[0]);
        final BigDecimal second = new BigDecimal(s[1]);
        System.out.println(first.multiply(second).setScale(0, RoundingMode.FLOOR));
    }
}
