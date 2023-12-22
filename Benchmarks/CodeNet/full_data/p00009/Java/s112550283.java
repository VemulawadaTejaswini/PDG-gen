
import java.util.*;

public class Main {

    /* static BitSet bset;
    static int MAX = 10000001;  
    public static void sieve() {
    bset = new BitSet(MAX);
    bset.set(2); //list.add(2);
    for (int j = 3; j < MAX; j+=2) bset.set(j);      
    int sqrt = (int) Math.sqrt(MAX);           
    for (int i = 3; i < sqrt; i+=2)
      if (bset.get(i)) {
        for (int j = i*i; j < MAX; j+=2*i) bset.clear(j);
        //list.add(i);
      }
     */
    //static BitSet bs;
    static int M = 1000001;
    static boolean[] k = new boolean[M];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder st = new StringBuilder();
        k[2] = true;
        for (int i = 3; i < M; i++) {
            int c = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    c++;
                    break;
                }
            }
            if (c == 0) {
                k[i] = true;
            }
        }
        while (in.hasNextInt()) {
            int p = in.nextInt();
            int x = 0;
            for (int i = 2; i <= p; i++) {
                if (k[i] == true) {
                    x++;
                }
            }
            System.out.println(x);
        }
    }
}

