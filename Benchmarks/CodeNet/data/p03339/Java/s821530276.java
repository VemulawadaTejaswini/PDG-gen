
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        String s = mylist.get(1);
        int cnt = 0;

        while (s.indexOf("WE") >= 0) {
            int idx = s.indexOf("WE");

            if (idx >= 0) {

                String stemp1 = s.substring(0, idx);
                String stemp2 = s.substring(idx + 2);

                cnt += 1;
                s = stemp1 + stemp2;
            }
            //            System.out.println(s);
        }
        System.out.println(cnt);

    }

}
