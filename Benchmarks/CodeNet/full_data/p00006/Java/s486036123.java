
import java.io.*;

public class Main {

    public static void main(String[] argv) throws IOException {
        //*
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String s = in.readLine();
            if (s == null) {
                break;
            }
            f(s);
        }
        //*/
    }

    public static void f(String s) {
        char[] c = s.toCharArray();
        char[] r = new char[c.length];
        for(int i = 0; i < c.length; i++) {
            r[c.length - i - 1] = c[i];
        }
        System.out.println(r);
    }
}