import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class A {
    static final int MAX = 100100;
    InputStream in = System.in;
    PrintStream out = System.out;

    public void _main(String[] args) {
        Scanner sc = new Scanner(in);
        String s = sc.next();
        for(int i=0;i<s.length()-1;i++) {
            if (s.charAt(i)==s.charAt(i+1)) {
                out.println("Bad");
                return;
            }
        }
        out.println("Good");
    }

    public static void main(String[] args) {
        new A()._main(args);
    }
}
