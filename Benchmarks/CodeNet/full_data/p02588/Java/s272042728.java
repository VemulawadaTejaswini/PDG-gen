import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.regex.Pattern;

public class Main {
    static final boolean DEBUG = false;

    static final int N_MIN = 2;
    static final int N_MAX = 200000;

    static final double A_MIN = 0.;
    static final double A_MAX = 10000.;

    static final int A_MIN_PREC = 0;
    static final int A_MAX_PREC = 9;

    public static void main(String[] args) throws Exception {
        var in = DEBUG ? new FileInputStream(new File("test/in")) : System.in;
        var sc = new InputVerifier(in);
        var pw = new PrintWriter(System.out);
        int n = sc.nextInt(N_MIN, N_MAX);
        sc.readEOL();
        while (n --> 0) {
            double a = sc.nextDoubleStrict(A_MIN, A_MAX, A_MIN_PREC, A_MAX_PREC);
            pw.println(a);
            sc.readEOL();
        }
        sc.readEOF();
        sc.close();
        pw.flush();
        pw.close();
    }
}

class InputVerificationException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private static final String errorMessageFormat = "Verification failed at line %d.\n\texpected: %s\n\tactual: %s";

    private static final int OMIT_THRETHOLD = 1000;
    
    public InputVerificationException(int line, String expected, String actual) {
        super(String.format(errorMessageFormat, line, expected, actual.length() >= OMIT_THRETHOLD ? "(omit)" : actual));
    }
}

class InputVerifier implements AutoCloseable {

    private static final int BUFFER_SIZE = 1024;

    private InputStream in;

    private byte[] buf = new byte[BUFFER_SIZE];
    private int bufptr = 0;
    private int buflen = 0;

    private byte[] undo = new byte[BUFFER_SIZE];
    private int undoptr = 0;
    private int undolen = 0;

    private int line = 1;

    public InputVerifier(InputStream in) {
        Objects.requireNonNull(in);
        this.in = in;
    }

    public InputVerifier() {
        this(System.in);
    }

    private boolean hasNextByte() {
        if (undoptr < undolen) return true;
        undoptr = undolen = 0;
        if (bufptr < buflen) return true;
        bufptr = 0;
        try {
            buflen = in.read(buf);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return buflen > 0;
    }

    private int readByte() {
        int b;
        if (undoptr < undolen) {
            b = undo[undoptr++];
        } else if (hasNextByte()) {
            b = buf[bufptr++];
            if (isNewLine(b)) line++;
        } else {
            b = -1;
        }
        return b;
    }

    private void undo(int b) {
        if (b != -1) undo[undolen++] = (byte) b;
    }

    public char nextChar() {
        return (char) readByte();
    }
    
    public void readEOF() {
        if (hasNextByte()) {
            int b = readByte();
            throw new InputVerificationException(line, "EOF", toReadableString(b));
        }
    }

    public void readEOL() {
        if (!hasNextByte()) {
            throw new InputVerificationException(line, "EOL", "EOF");
        }
        int b = readByte();
        if (!isNewLine(b)) {
            throw new InputVerificationException(line, "EOL", toReadableString(b));
        }
    }

    public void readSpace() {
        if (!hasNextByte()) {
            throw new InputVerificationException(line, "Space", "EOF");
        }
        int b = readByte();
        if (!isSpace(b)) {
            throw new InputVerificationException(line, "Space", toReadableString(b));
        }
    }

    public char nextLowerCaseCharacter() {
        if (!hasNextByte()) {
            throw new InputVerificationException(line, "Lower-case character", "EOF");
        }
        int b = readByte();
        if (!isLowerCaseAlphabet(b)) {
            throw new InputVerificationException(line, "Lower-case character", toReadableString(b));
        }
        return (char) b;
    }

    public char nextUpperCaseCharacter() {
        if (!hasNextByte()) {
            throw new InputVerificationException(line, "Upper-case character", "EOF");
        }
        int b = readByte();
        if (!isUpperCaseAlphabet(b)) {
            throw new InputVerificationException(line, "Upper-case character", toReadableString(b));
        }
        return (char) b;
    }

    public String nextLine() {
        if (!hasNextByte()) {
            throw new InputVerificationException(line, "Line", "EOF");
        }
        var sb = new StringBuilder();
        for (int b = readByte(); !isNewLine(b); b = readByte()) {
            sb.appendCodePoint(b);
        }
        return sb.toString();
    }

    public String nextToken() {
        if (!hasNextByte()) {
            throw new InputVerificationException(line, "Token", "EOF");
        }
        var sb = new StringBuilder();
        int b = readByte();
        for (;isPrintableAsciiCharacter(b); b = readByte()) {
            sb.appendCodePoint(b);
        }
        if (sb.length() == 0) {
            throw new InputVerificationException(line, "Token", toReadableString(b));
        }
        undo(b);
        return sb.toString();
    }

    public String nextToken(int expectedLength) {
        var token = nextToken();
        int actualLength = token.length();
        if (actualLength != expectedLength) {
            throw new InputVerificationException(line, String.format("Token with the length %d", expectedLength), String.format("Token with the length %d", actualLength));
        }
        return token;
    }

    public String nextToken(int minLengthInclusive, int maxLengthInclusive) {
        if (minLengthInclusive > maxLengthInclusive) {
            throw new IllegalArgumentException("Empty range.");
        }
        var token = nextToken();
        int length = token.length();
        if (length < minLengthInclusive || length > maxLengthInclusive) {
            throw new InputVerificationException(line, String.format("Token with the length from %d to %d (both inclusive)", minLengthInclusive, maxLengthInclusive), String.format("Token with the length %d", length));
        }
        return token;
    }

    public String nextToken(Pattern regexPattern) {
        var token = nextToken();
        if (!regexPattern.matcher(token).matches()) {
            throw new InputVerificationException(line, String.format("token that matches with %s.", regexPattern.toString()), token);
        }
        return token;
    }

    public String nextToken(Pattern regexPattern, int minLengthInclusive, int maxLengthInclusive) {
        var token = nextToken(minLengthInclusive, maxLengthInclusive);
        if (!regexPattern.matcher(token).matches()) {
            throw new InputVerificationException(line, String.format("token that matches with %s.", regexPattern.toString()), token);
        }
        return token;
    }

    public String[] nextTokens(int size, char delimiter) {
        var tokens = new String[size];
        for (int i = 0; i < size; i++) {
            tokens[i] = nextToken();
            if (i < size - 1) {
                int b = readByte();
                if (b != delimiter) {
                    throw new InputVerificationException(line, toReadableString(delimiter), toReadableString(b));
                }
            }
        }
        return tokens;
    }

    public String[] nextTokens(int size, int minLengthInclusive, int maxLengthInclusive, char delimiter) {
        var tokens = new String[size];
        for (int i = 0; i < size; i++) {
            tokens[i] = nextToken(minLengthInclusive, maxLengthInclusive);
            if (i < size - 1) {
                int b = readByte();
                if (b != delimiter) {
                    throw new InputVerificationException(line, toReadableString(delimiter), toReadableString(b));
                }
            }
        }
        return tokens;
    }

    public String[] nextTokens(int size, Pattern regex, char delimiter) {
        var tokens = new String[size];
        for (int i = 0; i < size; i++) {
            tokens[i] = nextToken(regex);
            if (i < size - 1) {
                int b = readByte();
                if (b != delimiter) {
                    throw new InputVerificationException(line, toReadableString(delimiter), toReadableString(b));
                }
            }
        }
        return tokens;
    }

    public String[] nextTokens(int size, Pattern regex, int minLengthInclusive, int maxLengthInclusive, char delimiter) {
        var tokens = new String[size];
        for (int i = 0; i < size; i++) {
            tokens[i] = nextToken(regex, minLengthInclusive, maxLengthInclusive);
            if (i < size - 1) {
                int b = readByte();
                if (b != delimiter) {
                    throw new InputVerificationException(line, toReadableString(delimiter), toReadableString(b));
                }
            }
        }
        return tokens;
    }

    public String nextLowerCaseToken() {
        var token = nextToken();
        if (!token.codePoints().allMatch(InputVerifier::isLowerCaseAlphabet)) {
            throw new InputVerificationException(line, "lower-case token", token);
        }
        return token;
    }

    public String nextLowerCaseToken(int expectedLength) {
        var token = nextLowerCaseToken();
        int actualLength = token.length();
        if (actualLength != expectedLength) {
            throw new InputVerificationException(line, String.format("token with the length %d", expectedLength), String.format("token with the length %d", actualLength));
        }
        return token;
    }

    public String nextLowerCaseToken(int minLengthInclusive, int maxLengthInclusive) {
        if (minLengthInclusive > maxLengthInclusive) {
            throw new IllegalArgumentException("Empty range.");
        }
        var token = nextLowerCaseToken();
        int length = token.length();
        if (length < minLengthInclusive || length > maxLengthInclusive) {
            throw new InputVerificationException(line, String.format("Token with the length from %d to %d (both inclusive)", minLengthInclusive, maxLengthInclusive), String.format("Token with the length %d", length));
        }
        return token;
    }

    public String[] nextLowerCaseTokens(int size, char delimiter) {
        var tokens = new String[size];
        for (int i = 0; i < size; i++) {
            tokens[i] = nextLowerCaseToken();
            if (i < size - 1) {
                int b = readByte();
                if (b != delimiter) {
                    throw new InputVerificationException(line, toReadableString(delimiter), toReadableString(b));
                }
            }
        }
        return tokens;
    }

    public String[] nextLowerCaseTokens(int size, int minLengthInclusive, int maxLengthInclusive, char delimiter) {
        var tokens = new String[size];
        for (int i = 0; i < size; i++) {
            tokens[i] = nextLowerCaseToken(minLengthInclusive, maxLengthInclusive);
            if (i < size - 1) {
                int b = readByte();
                if (b != delimiter) {
                    throw new InputVerificationException(line, toReadableString(delimiter), toReadableString(b));
                }
            }
        }
        return tokens;
    }

    public String nextUpperCaseToken() {
        var token = nextToken();
        if (!token.codePoints().allMatch(InputVerifier::isUpperCaseAlphabet)) {
            throw new InputVerificationException(line, "upper-case token", token);
        }
        return token;
    }

    public String nextUpperCaseToken(int expectedLength) {
        var token = nextUpperCaseToken();
        int actualLength = token.length();
        if (actualLength != expectedLength) {
            throw new InputVerificationException(line, String.format("token with the length %d", expectedLength), String.format("token with the length %d", actualLength));
        }
        return token;
    }

    public String nextUpperCaseToken(int minLengthInclusive, int maxLengthInclusive) {
        if (minLengthInclusive > maxLengthInclusive) {
            throw new IllegalArgumentException("Empty range.");
        }
        var token = nextUpperCaseToken();
        int length = token.length();
        if (length < minLengthInclusive || length > maxLengthInclusive) {
            throw new InputVerificationException(line, String.format("Token with the length from %d to %d (both inclusive)", minLengthInclusive, maxLengthInclusive), String.format("Token with the length %d", length));
        }
        return token;
    }

    public String[] nextUpperCaseTokens(int size, char delimiter) {
        var tokens = new String[size];
        for (int i = 0; i < size; i++) {
            tokens[i] = nextUpperCaseToken();
            if (i < size - 1) {
                int b = readByte();
                if (b != delimiter) {
                    throw new InputVerificationException(line, toReadableString(delimiter), toReadableString(b));
                }
            }
        }
        return tokens;
    }

    public String[] nextUpperCaseTokens(int size, int minLengthInclusive, int maxLengthInclusive, char delimiter) {
        var tokens = new String[size];
        for (int i = 0; i < size; i++) {
            tokens[i] = nextUpperCaseToken(minLengthInclusive, maxLengthInclusive);
            if (i < size - 1) {
                int b = readByte();
                if (b != delimiter) {
                    throw new InputVerificationException(line, toReadableString(delimiter), toReadableString(b));
                }
            }
        }
        return tokens;
    }

    public long nextLong() {
        if (!hasNextByte()) {
            throw new InputVerificationException(line, "long", "EOF");
        }
        boolean isNegetive = false;
        long n = 0;
        int b = readByte();
        if (b == '-') {
            isNegetive = true;
            b = readByte();
        }
        if (!isDigit(b)) {
            throw new InputVerificationException(line, "long", toReadableString(b));
        }
        if (b == '0') {
            b = readByte();
            if (isDigit(b)) {
                throw new InputVerificationException(line, "long", "0" + toReadableString(b));
            } else if (!isPrintableAsciiCharacter(b)) {
                undo(b);
                return 0;
            } else {
                throw new InputVerificationException(line, "long", "0" + toReadableString(b));
            }
        }
        while (true) {
            if (isDigit(b)) {
                // long : -9223372036854775808 ~ 9223372036854775807
                if (n < 922337203685477580l) {
                    n = n * 10 + b - '0';
                } else if (n == 922337203685477580l) {
                    if (isNegetive) {
                        if (b > '8') {
                            throw new InputVerificationException(line, "long", "big integer");
                        } else {
                            n = -n * 10 - (b - '0');
                        }
                    } else {
                        if (b > '7') {
                            throw new InputVerificationException(line, "long", "big integer");
                        } else {
                            n = n * 10 + b - '0';
                        }
                    }
                    b = readByte();
                    if (isDigit(b)) {
                        throw new InputVerificationException(line, "long", "big integer");
                    } else if (!isPrintableAsciiCharacter(b)) {
                        undo(b);
                        return n;
                    } else {
                        throw new InputVerificationException(line, "long", toReadableString(b));
                    }
                } else {
                    throw new InputVerificationException(line, "long", "big integer");
                }
            } else if (!isPrintableAsciiCharacter(b)) {
                undo(b);
                return isNegetive ? -n : n;
            } else {
                throw new InputVerificationException(line, "long", toReadableString(b));
            }
            b = readByte();
        }
    }

    public long nextLong(long minInclusive, long maxInclusive) {
        if (minInclusive > maxInclusive) {
            throw new IllegalArgumentException("Empty range.");
        }
        long v = nextLong();
        if (v < minInclusive || v > maxInclusive) {
            throw new InputVerificationException(line, String.format("long in [%d, %d]", minInclusive, maxInclusive), String.valueOf(v));
        }
        return v;
    }

    public long[] nextLongs(int size, long minInclusive, long maxInclusive, char delimiter) {
        var longs = new long[size];
        for (int i = 0; i < size; i++) {
            longs[i] = nextLong(minInclusive, maxInclusive);
            if (i < size - 1) {
                int b = readByte();
                if (b != delimiter) {
                    throw new InputVerificationException(line, toReadableString(delimiter), toReadableString(b));
                }
            }
        }
        return longs;
    }

    public int nextInt() {
        long n = nextLong();
        try {
            return Math.toIntExact(n);
        } catch (ArithmeticException e) {
            throw new InputVerificationException(line, "int", String.format("long %d", n));
        }
    }

    public int nextInt(int minInclusive, int maxInclusive) {
        if (minInclusive > maxInclusive) {
            throw new IllegalArgumentException("Empty range.");
        }
        int v = nextInt();
        if (minInclusive > v || v > maxInclusive) {
            throw new InputVerificationException(line, String.format("int in [%d, %d]", minInclusive, maxInclusive), String.valueOf(v));
        }
        return v;
    }

    public int[] nextInts(int size, int minInclusive, int maxInclusive, char delimiter) {
        var ints = new int[size];
        for (int i = 0; i < size; i++) {
            ints[i] = nextInt(minInclusive, maxInclusive);
            if (i < size - 1) {
                int b = readByte();
                if (b != delimiter) {
                    throw new InputVerificationException(line, toReadableString(delimiter), toReadableString(b));
                }
            }
        }
        return ints;
    }

    private double nextDoubleStrict(int minAfterPointDigitCountInclusive, int maxAfterPointDigitCountInclusive) {
        if (minAfterPointDigitCountInclusive > maxAfterPointDigitCountInclusive) {
            throw new IllegalArgumentException("Empty Range");
        }
        if (minAfterPointDigitCountInclusive < 0) {
            throw new IllegalArgumentException("The minimum value of the digits after the decimal point must be non-negative.");
        }
        if (!hasNextByte()) {
            throw new InputVerificationException(line, "double", "EOF");
        }
        var sb = new StringBuilder();
        boolean isNegetive = false;
        int b = readByte();
        if (b == '-') {
            isNegetive = true;
            b = readByte();
        }
        if (b == '0') {
            sb.appendCodePoint(b);
            b = readByte();
            if (isDigit(b)) {
                throw new InputVerificationException(line, "double", sb.toString() + toReadableString(b));
            }
        } else if (isDigit(b)) {
            do {
                sb.appendCodePoint(b);
                b = readByte();
            } while (isDigit(b));
        } else {
            throw new InputVerificationException(line, "double", sb.toString() + toReadableString(b));
        }
        boolean point = false;
        int afterPointDigitCount = 0;
        if (b == '.') {
            point = true;
            do {
                sb.appendCodePoint(b);
                b = readByte();
                afterPointDigitCount++;
            } while (isDigit(b));
            afterPointDigitCount--;
        }
        if (isPrintableAsciiCharacter(b)) {
            throw new InputVerificationException(line, "double", sb.toString() + toReadableString(b));
        }
        if (afterPointDigitCount < minAfterPointDigitCountInclusive || afterPointDigitCount > maxAfterPointDigitCountInclusive) {
            throw new InputVerificationException(line, String.format("a double value that has [%d, %d] digits after the decimal point", minAfterPointDigitCountInclusive, maxAfterPointDigitCountInclusive), sb.toString());
        }
        undo(b);
        int i = sb.length() - 1;
        double d = 0;
        if (point) {
            while (true) {
                char c = sb.charAt(i--);
                if (c == '.') break;
                d = (d + c - '0') / 10.;
            }
        }
        double pow = 1.;
        for (int j = i; j >= 0; j--) {
            d += pow * (sb.charAt(j) - '0');
            pow *= 10;
        }
        return isNegetive ? -d : d;
    }

    public double nextDouble() {
        return nextDoubleStrict(0, Integer.MAX_VALUE);
    }

    public double nextDouble(double minInclusive, double maxInclusive) {
        if (minInclusive > maxInclusive) {
            throw new IllegalArgumentException("Empty range.");
        }
        double v = nextDouble();
        if (v < minInclusive || v > maxInclusive) {
            throw new InputVerificationException(line, String.format("double in [%f, %f]", minInclusive, maxInclusive), String.valueOf(v));
        }
        return v;
    }

    public double nextDoubleStrict(double minInclusive, double maxInclusive, int minAfterPointDigitCountInclusive, int maxAfterPointDigitCountInclusive) {
        if (minInclusive > maxInclusive || minAfterPointDigitCountInclusive > maxAfterPointDigitCountInclusive) {
            throw new IllegalArgumentException("Empty range.");
        }
        double v = nextDoubleStrict(minAfterPointDigitCountInclusive, maxAfterPointDigitCountInclusive);
        if (v < minInclusive || v > maxInclusive) {
            throw new InputVerificationException(line, String.format("double in [%f, %f]", minInclusive, maxInclusive), String.valueOf(v));
        }
        return v;
    }

    public double[] nextDoubles(int size, double minInclusive, double maxInclusive, char delimiter) {
        var doubles = new double[size];
        for (int i = 0; i < size; i++) {
            doubles[i] = nextDouble(minInclusive, maxInclusive);
            if (i < size - 1) {
                int b = readByte();
                if (b != delimiter) {
                    throw new InputVerificationException(line, toReadableString(delimiter), toReadableString(b));
                }
            }
        }
        return doubles;
    }

    public double[] nextDoublesStrict(int size, double minInclusive, double maxInclusive, int minAfterPointDigitCountInclusive, int maxAfterPointDigitCountInclusive, char delimiter) {
        var doubles = new double[size];
        for (int i = 0; i < size; i++) {
            doubles[i] = nextDoubleStrict(minInclusive, maxInclusive, minAfterPointDigitCountInclusive, maxAfterPointDigitCountInclusive);
            if (i < size - 1) {
                int b = readByte();
                if (b != delimiter) {
                    throw new InputVerificationException(line, toReadableString(delimiter), toReadableString(b));
                }
            }
        }
        return doubles;
    }

    private static String toReadableString(int codePoint) {
        if (!Character.isDefined(codePoint)) {
            return "undefined";
        }
        if (isNewLine(codePoint)) {
            return "EOL";
        }
        if (Character.isWhitespace(codePoint)) {
            return "white space";
        }
        if (Character.isISOControl(codePoint)) {
            return "control character";
        }
        return Character.toString(codePoint);
    }

    private static boolean isNewLine(int codePoint) {
        return codePoint == '\n';
    }

    private static boolean isSpace(int codePoint) {
        return codePoint == ' ';
    }

    private static boolean isLowerCaseAlphabet(int codePoint) {
        return 'a' <= codePoint && codePoint <= 'z';
    }

    private static boolean isUpperCaseAlphabet(int codePoint) {
        return 'A' <= codePoint && codePoint <= 'Z';
    }

    private static boolean isDigit(int codePoint) {
        return '0' <= codePoint && codePoint <= '9';
    }

    private static boolean isPrintableAsciiCharacter(int codePoint) {
        return 32 < codePoint && codePoint < 127;
    }

    public void close() {
        try {
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
