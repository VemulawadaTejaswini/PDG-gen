import java.io.*;
import java.util.*;


/**
 * AIZU ONLINE JUDGE
 * 3116
 *  2020/5/4
 */
public class Main {


    boolean main() throws IOException {

        Scanner sc = new Scanner(systemin);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] a = new int[N];
        for(int n = 0; n < N; n++) {
            a[n] = sc.nextInt() * 2;
        }
        Arrays.sort(a);

        for(int i = 0; i < Q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            int lidx = Arrays.binarySearch(a, l * 2 - 1);
            if (lidx < 0) {
                lidx = -lidx - 1;
            }
            int ridx = Arrays.binarySearch(a, r * 2 + 1);
            if (ridx < 0) {
                ridx = -ridx - 1;
            }
            result.printf("%d\n", ridx - lidx);
        }

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


