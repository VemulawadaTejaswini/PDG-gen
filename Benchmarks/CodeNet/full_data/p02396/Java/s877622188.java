import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        in = new BufferedReader(new InputStreamReader(System.in));

        try {
            c = in.read();

            int i = 1;
            while (getToken() == TK_NUM && num != 0) {
                System.out.print("Case ");
                System.out.print(i++);
                System.out.print(": ");
                System.out.println(num);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static final int TK_END = 1;
    private static final int TK_NUM = 2;

    private static BufferedReader in;
    private static int c;
    private static int num;

    public static int getToken() throws IOException {
        if (c == -1) {
            return TK_END;
        } else if (Character.isDigit(c)) {
            num = Character.getNumericValue(c);
            while (Character.isDigit(c = in.read()))
                num = num * 10 + Character.getNumericValue(c);
            return TK_NUM;
        }
        while ((c = in.read()) != -1 && !Character.isDigit(c))
            ;
        return getToken();
    }
}