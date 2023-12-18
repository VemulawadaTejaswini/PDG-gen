import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        Map<Integer, Long> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            char[] input = sc.nextLine().toCharArray();
            int key = calcByteVal(input);
            if (map.get(key) == null) {
                map.put(key, 1L);
            } else {
                map.merge(key, 1L, (v1, v2) -> v1 + v2);
            }
        }
        long ans = 0;
        for (Long v : map.values()) {
            ans += v * (v - 1) / 2;
        }

        System.out.println(ans);
    }

    private static int calcByteVal(char[] input) {
        int ret = 0;
        for (char c : input) {
            ret += c;
        }
        return ret;
    }
}
