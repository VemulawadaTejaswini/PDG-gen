import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] w = br.readLine().toCharArray();

        br.close();

        Map<Character, Integer> map = new HashMap<>();
        for (char c : w) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (var entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                bw.write("No");
                bw.flush();
                return;
            }
        }

        bw.write("Yes");
        bw.flush();

    }
}