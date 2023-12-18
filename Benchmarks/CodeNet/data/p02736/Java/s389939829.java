import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Main {
    private static int MOD = 1000000007;

    private static Map<String, Integer> ans = new HashMap<>();

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        int n = Integer.parseInt(s);
        char[] chars = br.readLine().toCharArray();
        int[] x = new int[chars.length];
        int i = 0;
        for (char c : chars) {
            x[i] = Character.getNumericValue(c);
            i++;
        }

        while (true) {
            x = calc(x);
            if (x.length == 1) {
                System.out.println(x[0]);
                return;
            }
        }
    }

    private static int[][] a = {{0, 1, 2, 3}, {1, 0, 1, 2}, {2, 1, 0, 1}, {3, 2, 1, 0}};

    private static int[] calc(int[] x) {
        int[] r = new int[x.length - 1];
        for (int i = 0; i < x.length - 1; i++) {
            r[i] = a[x[i]][x[i + 1]];
        }
        return r;
    }
}

