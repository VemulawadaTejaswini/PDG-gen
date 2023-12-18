import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String str = br.readLine();
            int k = Integer.parseInt(br.readLine());
            TreeMap<String, Integer> map = new TreeMap<String, Integer>();
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j <= str.length(); j++) {
                    String tmp = str.substring(i, j);
                    if (!map.containsKey(tmp)) {
                        map.put(tmp, 1);
                    }
                }
            }
            int count = 1;
            for(Map.Entry<String, Integer> entry : map.entrySet()) {
                if (count == k) {
                    System.out.println(entry.getKey());
                    break;
                }
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
