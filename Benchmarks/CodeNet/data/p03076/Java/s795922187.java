import java.util.function.Function;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        int[] t = new int[5];
        int[] p = new int[5];
        int min = 700;
        for (int i = 0; i < 5; i++) {
            t[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < 5; i++) {
            p[i] = i;
        }
        Function<Integer, Integer> order = (i) -> t[i] % 10 == 0 ? t[i] : t[i] + (10 - (t[i] % 10));
        
        do {
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                sum += order.apply(p[i]);
            }
            sum += t[p[4]];
            min = Math.min(min, sum);
        } while (nextPermutation(p));
        
        out.println(min);
        
        out.flush();
    }
}