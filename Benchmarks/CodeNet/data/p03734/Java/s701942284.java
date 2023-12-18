import java.io.PrintWriter;
import java.util.*;

import static java.lang.Math.max;

/**
 * Created by shoya on 2017/04/30.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = sc.nextInt();
        int W = sc.nextInt();
        HashMap<Integer, ArrayList<Integer>> hash = new HashMap<Integer, ArrayList<Integer>>();

        int min_w = -1;
        for (int i = 0; i < N; i++){
            int w = sc.nextInt();
            if (min_w == -1){
                min_w = w;
            }
            if (hash.get(w) == null) {
                hash.put(w, new ArrayList<Integer>());
            }
            hash.get(w).add(sc.nextInt());
        }

        for (int i = min_w; i <= min_w + 3; i++){
            if (hash.get(i) != null) {
                Collections.sort(hash.get(i));
            }
        }

        long ans = 0;
        for (int i = 0; i <= 25; i++){
            for (int j = 0; j <= 25; j++) {
                for (int k = 0; k <= 25; k++) {
                    for (int l = 0; l <= 25; l++) {
                        if ( i * min_w + j * (min_w + 1) + k * (min_w + 2) + l * (min_w + 3) > W){
                            continue;
                        }
                        long sum = 0;
                        if (hash.get(min_w) != null) {
                            sum += hash.get(min_w).stream().limit(i).mapToInt(x -> x.intValue()).sum();
                        }
                        if (hash.get(min_w + 1) != null) {
                            sum += hash.get(min_w + 1).stream().limit(j).mapToInt(x -> x.intValue()).sum();
                        }
                        if (hash.get(min_w + 2) != null) {
                            sum += hash.get(min_w + 2).stream().limit(k).mapToInt(x -> x.intValue()).sum();
                        }
                        if (hash.get(min_w + 3) != null) {
                            sum += hash.get(min_w + 3).stream().limit(l).mapToInt(x -> x.intValue()).sum();
                        }
                        ans = max(ans, sum);
                    }
                }
            }
        }


        pw.println(ans);
        pw.flush();
        return;
    }
}