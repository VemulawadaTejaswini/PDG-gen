import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;

import lib.io.ExtendedScanner;
import lib.io.Out;

public class A {
    public static void main(String[] args) throws Exception {
        Field f = System.out.getClass().getDeclaredField("autoFlush");
        f.setAccessible(true);
        f.set(System.out, false);
        execute(System.in, System.out);
    }

    public static void execute(InputStream in, OutputStream out) {
        ExtendedScanner s = new ExtendedScanner(System.in);
        Out o = new Out(System.out);
        solve(s, o);
        o.flush();
        o.close();
    }

    public static void solve(ExtendedScanner sc, Out out) {
        out.write(10 - sc.nextInt() / 200).write('\n');
    }
}
