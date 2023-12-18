import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void exec(InputStream in, PrintStream out){
        Scanner sc = new Scanner(in);
        out.println(sc.nextInt() == sc.nextInt() ? "Yes" : "No");
    }

    public static InputStream makeInputStream(String body) {
        return new ByteArrayInputStream(body.getBytes(StandardCharsets.UTF_8));
    }

    public static void test(String in, String out) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        exec(makeInputStream(in), new PrintStream(baos));
        String result = new String(baos.toByteArray());
        System.out.println("-----------" + (out.equals(result) ? "【OK】" : "NG..."));
        System.out.println("[in]");
        System.out.println(in);
        System.out.println("[result]");
        System.out.println(result);
        if (!out.equals(result)) {
            System.out.println("[expected]");
            System.out.println(out);
        }
    }

    public static void main(String[] args) {
        exec(System.in, System.out);
    }
}