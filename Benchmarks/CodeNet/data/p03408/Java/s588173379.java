import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (map.containsKey(s)) {
                map.put(s, map.get(s) - 1);
            } else {
                map.put(s, -1);
            }
        }

        br.close();

        int max = 0;
        for (var entry : map.entrySet()) {
            max = Math.max(max, entry.getValue());
        }

        bw.write(String.valueOf(max));

        bw.flush();

    }
}