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
        StringBuilder sb = new StringBuilder();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        sb.append(s);
        s1.append(s.substring(0, s.length() / 2));
        s2.append(s.substring((s.length() / 2) + 1, s.length()));

        //        System.out.println(s1 + " " + s2 + " " + s1.equals(s2));

        Boolean chkflg = false;
        if (s.substring(0, s.length() / 2).equals(s.substring((s.length() / 2) + 1, s.length()))) {
            if (s1.equals(s1.reverse())) {
                chkflg = true;
            }
        }

        System.out.println(chkflg ? "Yes" : "No");
    }

}
