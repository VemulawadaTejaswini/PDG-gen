import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                HashMap<Integer, Integer> ihash = new HashMap<Integer, Integer>();

                int N = scan.nextInt();

                int[] Aheight = new int[N];
                for (int i = 0; i < N; i++) {
                        Aheight[i] = scan.nextInt();
                }

                int count = 0;

                for (int k = 0; k < N; k++) {
                        int jminusA = k+1 - Aheight[k];
                        if (ihash.containsKey(jminusA)) {
                                count += ihash.get(jminusA);
                        }
                        int Aplusk = Aheight[k] + k+1;
                        if (ihash.containsKey(Aplusk)) {
                                ihash.replace(Aplusk,ihash.get(Aplusk)+1);
                        } else {
                                ihash.put(Aplusk,1);
                        }
                }

                System.out.println(count);

        }
}