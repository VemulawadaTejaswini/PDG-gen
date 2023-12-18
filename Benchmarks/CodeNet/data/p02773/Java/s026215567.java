import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s;
        Map<String, Integer> map = new TreeMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            s = br.readLine();
            int val = map.containsKey(s) ? map.get(s) + 1 : 1;
            map.put(s, val);
            max = Math.max(max, val);
        }

        br.close();

        final int MAX = max;
        map.forEach((key, val) -> {
            if (val == MAX) {
                System.out.println(key);
            }
        });

    }
}