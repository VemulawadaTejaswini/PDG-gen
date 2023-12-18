import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
        int m = Integer.valueOf(arr01[1]);

        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

        for (int i = 1; i < 1 + m; i++) {

            String arr_temp[] = mylist.get(i).split(" ");

            int p = Integer.valueOf(arr_temp[0]);
            int y = Integer.valueOf(arr_temp[1]);
            List<Integer> list_temp = new LinkedList<Integer>();
            if (map.containsKey(p)) {

                list_temp = map.get(p);
                list_temp.add(y);
                map.put(p, list_temp);

            } else {

                list_temp.add(y);
                map.put(p, list_temp);
            }
            //            System.out.println(list_temp);
            //昇順でソート
            Collections.sort(list_temp);
            //            System.out.println(list_temp);

        }

        for (int i = 1; i < 1 + m; i++) {

            String arr_temp[] = mylist.get(i).split(" ");

            int p = Integer.valueOf(arr_temp[0]);
            int y = Integer.valueOf(arr_temp[1]);

            List<Integer> list01 = new ArrayList<Integer>();
            list01 = map.get(p);

            //            System.out.println(list01 + " " + y + " " + list01.indexOf(y));

            int cnt = list01.indexOf(y);
            cnt += 1;

            //System.out.printf("%06d%06d\n", p, cnt);
            String ptemp = "000000" + String.valueOf(p);
            String ctemp = "000000" + String.valueOf(cnt);

            System.out.println(ptemp.substring(ptemp.length() - 6) + " " + ctemp.substring(ctemp.length() - 6));
        }

    }

}
