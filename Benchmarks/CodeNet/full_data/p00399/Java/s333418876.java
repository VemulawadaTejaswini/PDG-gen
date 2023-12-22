import java.io.*;
import java.util.*;


/**
 * AIZU ONLINE JUDGE
 * 0404
 *  2020/5/6
 */
public class Main {



    boolean main() throws IOException {

        Scanner sc = new Scanner(systemin);

        result.printf("%d\n", sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt());

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


