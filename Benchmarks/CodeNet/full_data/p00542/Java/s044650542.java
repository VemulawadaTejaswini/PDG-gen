import java.io.*;
import java.util.*;


/**
 * AIZU ONLINE JUDGE
 * 0619
 *  2020/5/5
 */
public class Main {


    boolean main() throws IOException {

        Scanner sc = new Scanner(systemin);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int F = sc.nextInt();

        int sum = A + B + C + D - Math.min(Math.min(A, B), Math.min(C, D)) + Math.max(E, F);
        result.printf("%d\n",  sum);

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


