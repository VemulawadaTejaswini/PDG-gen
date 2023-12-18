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

        int n = Integer.valueOf(arr01[0]);

        int mindata = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {

            String l = s.substring(i, i + 1);
            String stemp1;
            if (i != 0) {
                stemp1 = s.substring(0, i + 1);
            } else {
                stemp1 = "";
            }
            String stemp2 = s.substring(i + 1);

            int wcnt = 0;
            for (char x : stemp1.toCharArray()) {
                if (x == 'W') {
                    wcnt += 1;
                }
            }
            int ecnt = 0;
            for (char x : stemp2.toCharArray()) {
                if (x == 'E') {
                    ecnt += 1;
                }
            }

            mindata = Math.min(mindata, wcnt + ecnt);

            //            System.out.println(stemp1 + " " + stemp2 + " " + l + " " + wcnt + " " + ecnt);

        }
        System.out.println(mindata);

    }

}
