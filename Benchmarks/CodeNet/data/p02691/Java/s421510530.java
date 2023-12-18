import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                HashMap<Long, Long> ihash = new HashMap<Long, Long>();

                long N = scan.nextLong();

                long Aheight;
                long jminusA;
                long Aplusk;
                long count = 0;

                for (long k = 1; k <= N; k++) {
                        Aheight = scan.nextLong();

                        jminusA = k - Aheight;
                        if (ihash.containsKey(jminusA)) {
                                count += ihash.get(jminusA);
                        }

                        Aplusk = Aheight + k;
                        if (ihash.containsKey(Aplusk)) {
                                ihash.replace(Aplusk,ihash.get(Aplusk)+1);
                        } else {
                                ihash.put(Aplusk,(long)1);
                        }
                }

                System.out.println(count);

        }
}