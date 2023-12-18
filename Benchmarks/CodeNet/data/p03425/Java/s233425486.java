import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Character, Integer> map = new HashMap<Character, Integer>() {
        {
            put('M', 0);
            put('A', 1);
            put('R', 2);
            put('C', 3);
            put('H', 4);
        }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        long[] cnt = new long[5];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            char c = s[i].charAt(0);
            if (!map.containsKey(c)) {
                continue;
            }
            cnt[map.get(c)]++;
        }
        long sum = 0;
        for (int i = 0; i < map.size(); i++) {
            for (int j = i + 1; j < map.size(); j++) {
                for (int k = j + 1; k < map.size(); k++) {
                    sum += cnt[i] * cnt[j] * cnt[k];
                }
            }
        }
        System.out.println(sum);
    }

}
