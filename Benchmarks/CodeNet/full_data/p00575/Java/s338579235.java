import java.io.*;
import java.util.*;


/**
 * AIZU ONLINE JUDGE
 * 0652
 *  2020/5/5
 */
public class Main {


    boolean main() throws IOException {

        Scanner sc = new Scanner(systemin);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int w = A * 7 + B;
        int ret = C / w * 7 + Math.min(7, (C % w + A - 1) / A);
        result.printf("%d\n", ret);

        sc.close();
        return false;
    }



    PrintStream log;
    PrintStream result = System.out;
    BufferedReader systemin;

    static Main instance = new Main();

    Main() {
        systemin = new BufferedReader(new InputStreamReader(System.in));
        log = new PrintStream(new OutputStream() { public void write(int b) {} } );
    }

    public static void main(String[] args) throws IOException {

        instance.main();
        instance.systemin.close();
    }


}


