import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        solve();
        Stdin.flush();
    }

    static void solve() {
        int[] inputs = Stdin.receiveIntArray(" ");
        int problemNum = inputs[0];
        int answerNum = inputs[1];

        int correctNum = 0;
        int wrongNum = 0;
        boolean[] hasCorrects = new boolean[problemNum];
        Arrays.fill(hasCorrects, false);

        for (int i = 0; i < answerNum; i++) {
            String[] result = Stdin.receiveStringArray(" ");
            int id = Integer.parseInt(result[0]) - 1;
            boolean ac = result[1].equals("AC");

            if(!hasCorrects[id]) {
                if(ac) {
                    hasCorrects[id] = true;
                    correctNum++;
                } else {
                    wrongNum++;
                }
            }
        }

        Stdin.print(correctNum);
        Stdin.print(" ");
        Stdin.println(wrongNum);
    }

    static class ModCalculator {
        static final BigInteger MOD = BigInteger.valueOf((int) 1e9 + 7);
    }

    static class Calculator {
        static BigInteger gcd(BigInteger x, BigInteger y) {
            if (y.subtract(x).signum() > 0) {
                return gcd(y, x);
            }
            if (y.equals(BigInteger.ZERO)) {
                return x;
            }
            return gcd(y, x.remainder(y));
        }

        static BigInteger gcd(int x, int y) {
            return gcd(BigInteger.valueOf(x), BigInteger.valueOf(y));
        }

        static BigInteger gcd(BigInteger[] arr) {
            BigInteger gcd = arr[0];
            for (BigInteger i : arr) {
                gcd = gcd(gcd, i);
            }
            return gcd;
        }

        static BigInteger gcd(int[] arr) {
            BigInteger gcd = BigInteger.valueOf(arr[0]);
            for (int i : arr) {
                gcd = gcd(gcd, BigInteger.valueOf(i));
            }
            return gcd;
        }

        static BigInteger lcm(BigInteger x, BigInteger y) {
            return x.multiply(y).divide(gcd(x, y));
        }

        static BigInteger lcm(int x, int y) {
            return lcm(BigInteger.valueOf(x), BigInteger.valueOf(y));
        }

        static BigInteger lcm(BigInteger[] arr) {
            BigInteger lcm = BigInteger.ONE;
            for (BigInteger i : arr) {
                lcm = lcm(lcm, i);
            }
            return lcm;
        }

        static BigInteger lcm(int[] arr) {
            BigInteger lcm = BigInteger.ONE;
            for (int i : arr) {
                lcm = lcm(lcm, BigInteger.valueOf(i));
            }
            return lcm;
        }

        static int digits(int x) {
            return String.valueOf(x).length();
        }

        static BigInteger arraySum(BigInteger[] arr) {
            BigInteger ret = BigInteger.ZERO;
            for (BigInteger bi : arr) {
                ret = ret.add(bi);
            }
            return ret;
        }

        static BigInteger arraySum(int[] arr) {
            BigInteger ret = BigInteger.ZERO;
            for (int i : arr) {
                ret = ret.add(BigInteger.valueOf(i));
            }
            return ret;
        }
    }

    static class Stdin {
        static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        static final PrintWriter pw = new PrintWriter(System.out);

        enum Delimiter {
            NONE(""), SPACE(" "), DOT("\\."), COMMA(",");

            private String regex;

            private Delimiter(String regex) {
                this.regex = regex;
            }

            public static Delimiter of(String input) {
                try {
                    return Delimiter.valueOf(input);
                } catch (IllegalArgumentException e) {
                    return Arrays.stream(values()).filter(d -> d.getRegex().equals(input)).findFirst().orElse(SPACE);
                }
            }

            public String getRegex() {
                return regex;
            }
        }

        static String nextLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                throw new IllegalArgumentException(e);
            }
        }

        static int receiveInt() {
            return Integer.parseInt(nextLine());
        }

        static BigInteger receiveBigInteger() {
            return new BigInteger(nextLine());
        }

        static char receiveChar() {
            return nextLine().charAt(0);
        }

        static char[] receiveCharArray() {
            return nextLine().toCharArray();
        }

        static int[] receiveIntArray(Delimiter delimiter) {
            String[] inputs = nextLine().split(delimiter.getRegex());
            int[] ret = new int[inputs.length];
            for (int i = 0; i < inputs.length; i++) {
                ret[i] = Integer.parseInt(inputs[i]);
            }
            return ret;
        }

        static int[] receiveIntArray(String delimiterString) {
            return receiveIntArray(Delimiter.of(delimiterString));
        }

        static BigInteger[] receiveBigIntegerArray(Delimiter delimiter) {
            String[] inputs = nextLine().split(delimiter.getRegex());
            BigInteger[] ret = new BigInteger[inputs.length];
            for (int i = 0; i < inputs.length; i++) {
                ret[i] = new BigInteger(inputs[i]);
            }
            return ret;
        }

        static BigInteger[] receiveBigIntegerArray(String delimiterString) {
            return receiveBigIntegerArray(Delimiter.of(delimiterString));
        }

        static String[] receiveStringArray(Delimiter delimiter) {
            return nextLine().split(delimiter.getRegex());
        }

        static String[] receiveStringArray(String delimiterString) {
            return receiveStringArray(Delimiter.of(delimiterString));
        }

        static void print(Object obj) {
            pw.print(obj);
        }

        static void println(Object obj) {
            pw.println(obj);
        }

        static void println() {
            pw.println("");
        }

        static void flush() {
            pw.flush();
        }
    }
}
