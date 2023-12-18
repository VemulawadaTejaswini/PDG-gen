import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.next());
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        // 主処理
        Map<String, Integer> map = new HashMap<>();
        int max = 0;
        List<String> list = new ArrayList<>();
        for (String str : s) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
            if (max == map.get(str)) {
                list.add(str);
            } else if (max < map.get(str)) {
                list = new ArrayList<>();
                list.add(str);
            }
            max = Math.max(max, map.get(str));
        }
        String[] arr = list.toArray(new String[list.size()]);
        Arrays.sort(arr);

        String result = String.join("\r\n", arr);

        // 出力
        System.out.println(result);
        sc.close();
    }
}
