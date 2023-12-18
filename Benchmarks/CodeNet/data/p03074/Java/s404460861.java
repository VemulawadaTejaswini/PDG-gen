import java.util.*;

public class Main {
    public static void main(String[] args) {
        // read inputs
        Scanner in = new Scanner(System.in);
        final int N = in.nextInt();
        final int K = in.nextInt();
        final String s = in.next();

        List<int[]> zeros = new ArrayList<>();
        int len = s.length();
        int idx = 0;
        while (idx < len) {
            int j = idx;
            while (idx < len && s.charAt(idx) == '0') idx++;
            while (idx < len && s.charAt(idx) == '1') idx++;
            zeros.add(new int[] {j, idx});
        }

        int max = 0;
        if (zeros.size() <= K) max = len;
        for (int i = K; i < zeros.size(); i++) {
            int l = zeros.get(i-K)[0];
            int r = zeros.get(i)[1]-1;
            max = Math.max(max, r-l);
        }
        System.out.println(max);
    }
}