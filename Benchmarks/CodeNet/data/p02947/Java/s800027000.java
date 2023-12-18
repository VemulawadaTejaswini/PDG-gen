import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);

        List<String> mylist = new ArrayList<>();

        // 標準入力からの値を変数strinputに代入
        String strinput = reader.readLine();

        while (strinput != null) {

            mylist.add(strinput);
            strinput = reader.readLine();

        }

        String arr01[] = mylist.get(0).split(" ");

        int n = Integer.valueOf(arr01[0]);

        List<String> result = new ArrayList<>();
        for (int i = 1; i < 1 + n; i++) {
            String s = mylist.get(i);

            HashMap<String, Integer> map = new HashMap<String, Integer>();

            for (int j = 0; j < s.length(); j++) {
                String stemp = s.substring(j, j + 1);

                if (map.containsKey(stemp)) {
                    map.put(stemp, map.get(stemp) + 1);
                } else {
                    map.put(stemp, 1);
                }

            }
            List<String> sortedKeys = new ArrayList<String>(map.keySet());
            Collections.sort(sortedKeys);

            String sb = "";
            for (String key : sortedKeys) {
                for (int k = 0; k < map.get(key); k++) {
                    sb += key;
                }
            }
            result.add(sb);
        }

        //昇順でソート
        Collections.sort(result);

        //配列を出力(昇順ソート出力)
        //        System.out.println(result);

        HashMap<String, Integer> map_result = new HashMap<String, Integer>();
        for (int k = 0; k < result.size(); k++) {

            String stemp = result.get(k);

            if (map_result.containsKey(stemp)) {
                map_result.put(stemp, map_result.get(stemp) + 1);
            } else {
                map_result.put(stemp, 1);
            }

        }

        //        System.out.println(map_result);

        long cnt = 0;
        for (Integer v : map_result.values()) {

            cnt += v * (v - 1) / 2;
            //            System.out.println(v);

        }

        System.out.println(cnt);

    }

}
