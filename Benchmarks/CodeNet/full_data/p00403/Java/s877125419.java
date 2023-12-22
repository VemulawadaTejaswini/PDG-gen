import java.io.*;
import java.util.*;


/**
 * AIZU ONLINE JUDGE
 * 0408
 *  2020/5/6
 */
public class Main {

    boolean main() throws IOException {

        Scanner sc = new Scanner(systemin);

        
        int L = sc.nextInt();
        int[] f = new int[100];
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0;; i++) {
            if (i >= L) {
                result.printf("OK\n");
                break;
            }
            int c = sc.nextInt();
            if (c > 0) {
                if (f[c - 1] > 0) {
                    result.printf("%d\n", i + 1);
                    break;
                }
                list.add(c);
                f[c - 1] = 1;
            }
            else {
                int r = -1;
                if (list.size() > 0)
                    r = list.remove(list.size() - 1);
                if (-c != r) {
                    result.printf("%d\n", i + 1);
                    break;
                }
                f[-c - 1] = 0;
            }
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


