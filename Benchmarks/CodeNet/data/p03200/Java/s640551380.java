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

        String s = mylist.get(0).split(" ")[0];

        int cnt = 0;

        while (s.indexOf("BW") >= 0) {

            for (int i = 0; i < s.length() - 1; i++) {

                String stemp = s.substring(i, i + 2);
                //                System.out.println(stemp);
                if (stemp.equals("BW")) {
                    cnt += 1;
                }

            }

            s = s.replaceAll("BW", "WB");

        }

        System.out.println(cnt);
    }

}
