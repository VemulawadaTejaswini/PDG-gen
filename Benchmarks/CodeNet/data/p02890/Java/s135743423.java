import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Integer> freq = new HashMap<>();
        int[] amts = new int[n + 1];
        for (int j = 0; j < n; j++) {
            int k = in.nextInt();
            if (!freq.containsKey(k)) {
                freq.put(k, 1);
            } else {
                freq.put(k, freq.get(k) + 1);
            }
            amts[freq.get(k)]++;
        }
        StringBuilder builder = new StringBuilder();
        int k = 1;
        int nTemp = n;
        for (int m = n; m > 0; m--) {
            while (k <= nTemp / m) {
                builder.append(m);
                builder.append('\n');
                k++;
            }
            nTemp -= amts[m];
        }
        while (k <= n) {
            builder.append("0\n");
            k++;
        }
        System.out.print(builder);
    }
}
