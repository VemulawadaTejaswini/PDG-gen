import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            char[] input = sc.nextLine().toCharArray();
            int key = calcByteVal(input);
            map.merge(key, 1, (v1, v2) -> v1 + v2);
        }

        int ans = 0;
        for (Integer count : map.values()) {
            if (count != 1) {
                ans += count;
            }
        }
        if (ans == 0) {
            System.out.println(0);
        } else {
            System.out.println(ans - 1);
        }
    }

    private static int calcByteVal(char[] input) {
        int ret = 0;
        for (char c : input) {
            ret += c;
        }
        return ret;
    }
}
