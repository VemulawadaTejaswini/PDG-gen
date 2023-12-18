import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int n = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            for (int i = 0; i < n; i++) {
                String str = br.readLine();
                if (map.containsKey(str)) {
                    int val = map.get(str) + 1;
                    map.put(str, val);
                } else {
                    map.put(str, 1);
                }
            }
            int m = Integer.parseInt(br.readLine());
            for (int j = 0; j < m; j++) {
                String str = br.readLine();
                if (map.containsKey(str)) {
                    int val = map.get(str) - 1;
                    map.put(str, val);
                } else {
                    map.put(str, -1);
                }
            }
            String ansKey = "";
            int max = 0;
            boolean flag = false;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String key = entry.getKey();
                int val = entry.getValue();
                if (flag) {
                    if (max < val) {
                        ansKey = key;
                        max = val;
                    }
                } else {
                    ansKey = key;
                    max = val;
                    flag = true;
                }
            }
            if (max < 0) {
                System.out.println(0);
            } else {
                System.out.println(max);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
