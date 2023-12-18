import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                HashMap<Integer, Integer> ihash = new HashMap<Integer, Integer>();

                int N = scan.nextInt();

                int Aheight;
                int jminusA;
                int Aplusk;
                int count = 0;

                for (int k = 1; k <= N; k++) {
                        Aheight = scan.nextInt();
                        jminusA = k - Aheight;
                        if (ihash.containsKey(jminusA)) {
                                count += ihash.get(jminusA);
                        }

                        Aplusk = Aheight + k;
                        if (ihash.containsKey(Aplusk)) {
                                ihash.replace(Aplusk,ihash.get(Aplusk)+1);
                        } else {
                                ihash.put(Aplusk,1);
                        }
                }

                System.out.println(count);

        }
}