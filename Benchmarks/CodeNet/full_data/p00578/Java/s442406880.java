import java.io.*;
import java.util.*;


/**
 * AIZU ONLINE JUDGE
 * 0654
 *  2020/5/5
 */
public class Main {


    class Mnt {
        int a;
        int m; // 1山 0谷
        public Mnt(int a, int m) {
            this.a = a;
            this.m = m;
        }
    }


    boolean main() throws IOException {

        Scanner sc = new Scanner(systemin);

        int N = sc.nextInt();
        boolean up = true;
        int old = -1;
        boolean all0 = true;
        List<Mnt> list = new ArrayList<>();
        for(int i = 0;i <= N; i++) {
            int A;
            if (N == i)
                A = 0; // 最後
            else
                A = sc.nextInt();
            if (A != 0)
                all0 = false;
            if (up && A < old) {
                list.add(new Mnt(old, 1)); // 山
                up = false;
            }
            else if (!up && A > old) {
                list.add(new Mnt(old, 0)); // 谷
                up = true;
            }
            old = A;
        }
        
        list.sort((a, b) -> a.a - b.a);

        int max = 1;
        int sima = 1;
        old = -1;
        for(int i = 0; i < list.size(); i++) {
            Mnt m = list.get(i);
            if (m.a != old) {
                max = Math.max(max,  sima);
            }
            if (m.m > 0)
                sima--;
            else sima++;
            log.printf("list a = %d m = %d sima = %d max = %d\n", m.a, m.m, sima, max);
            old = m.a;
        }

        if (all0)
            max = 0;
        
        result.printf("%d\n",  max);

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


