import java.io.*;
import java.util.*;


/**
 * AIZU ONLINE JUDGE
 * 0407
 *  2020/5/6
 */
public class Main {



    boolean main() throws IOException {

        Scanner sc = new Scanner(systemin);

        int N = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++) {
            int x = sc.nextInt();
            max = Math.max(max,  x);
            min = Math.min(min,  x);
        }
        result.printf("%d\n", (max - min + 1) / 2);

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


