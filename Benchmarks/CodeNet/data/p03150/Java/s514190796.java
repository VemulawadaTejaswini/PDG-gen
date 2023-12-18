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

        String s = mylist.get(0);

        String stemp = "keyence";
        int sposi = 0;
        Boolean chkflg = true;
        for (int i = 0; i < stemp.length(); i++) {
            String temp = stemp.substring(i, i + 1);

            if (s.indexOf(temp, sposi) >= 0) {

                sposi = s.indexOf(temp, sposi) + 1;

                //                System.out.println(temp + " " + sposi);

            } else {
                chkflg = false;
                break;
            }

        }

        System.out.println(chkflg ? "YES" : "NO");

    }

}
