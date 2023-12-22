
import java.io.*;
import java.util.*;

/**
 * AIZU ONLINE JUDGE
 * 2837 Cryptex
 *    2018/02/17
 */
public class Main {

    int N;
    int M;
    int[] T;
    int nidx; // 負になる場所

    int sov() {return 0; }
    int solv() {return 0; }
    int min() {return 0; }

    boolean main() throws IOException {
        Scanner sc = new Scanner(systemin);

        //int[] ir = readIntArray();
        N = sc.nextInt();//ir[0];
        M = sc.nextInt();//ir[1];
        log.printf("%d %d\n",  N, M);

        //ir = readIntArray();
        //int[] T = ir;
        T = new int[N];
        for(int i = 0; i < N; i++) {
            T[i] = sc.nextInt();
        }
        int ret = 0;
        if (N == 2 && T[0] != T[1]) {
            ret = -1;
        }
        else if (N == 3 && T[0] == 1 || T[1] == 1 || T[2] == 1) {
            ret = 3;
        }
        else {
//            Arrays.sort(T);
            nidx = -1; // 負になる場所
            for(int i = 0; i < N; i++) {
                if (T[i] > M / 2) {
                    if (nidx < 0)
                        nidx = i;
                    T[i] -= M;
                }
            }
            if (nidx < 0)
                nidx = M;
//            log.printf("%s nidx = %d\n",  Arrays.toString(T), nidx);
            int min = min();
//            log.printf("%s min = %.1f\n",  Arrays.toString(T), min() / 2.);
            if (M % 2 == 0 && min % 2 != 0) {
                ret = -1;
            }
            else {
                ret = sov();
            }
        }

        result.printf("%d\n", ret);
        //sc.close();
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

		int N = Integer.MAX_VALUE;
		//int N = readIntArray()[0];

		for(int i = 0; i < N; i++) {
			boolean b = instance.main();
			if (!b)
				break;
		}

        instance.systemin.close();
	}


}


