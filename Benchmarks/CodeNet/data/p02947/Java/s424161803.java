import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            String[] S = new String[N];
            for (int i = 0; i < N; i++) {
                char[] chars = sc.next().toCharArray();
                Arrays.sort(chars);
                S[i] = new String(chars);
            }

            Map<String, Integer> count = new HashMap<>();
            for (String s : S) {
                Integer c = count.get(s);
                if (c == null) {
                    count.put(s, 1);
                } else {
                    count.put(s, c + 1);
                }
            }

            int ans = 0;
            for (Integer value : count.values()) {
                if (value >= 2) {
                    ans += value * (value - 1) / 2;
                }
            }

            System.out.println(ans);
        }
    }

}
