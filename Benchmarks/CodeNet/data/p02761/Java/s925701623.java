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

        int n = Integer.valueOf(mylist.get(0).split(" ")[0]);
        int m = Integer.valueOf(mylist.get(0).split(" ")[1]);

        char[] ch = { 'x', 'x', 'x' };

        for (int i = 1; i < m + 1; i++) {

            String arr_temp[] = mylist.get(i).split(" ");
            int s = Integer.valueOf(arr_temp[0]);

            char c = arr_temp[1].charAt(0);
            //
            //            //          System.out.println(ch);
            //            System.out.println(ch[s - 1]);
            //            System.out.println(s);
            //            System.out.println(c);

            if (ch[s - 1] != 'x' && ch[s - 1] != c) {
                System.out.println(-1);
                return;
            }

            if (ch[s - 1] == 'x') {
                ch[s - 1] = c;
            }

        }

        String res = String.valueOf(ch);

        if (ch[0] == '0') {
            System.out.println(-1);
        } else {
            System.out.println(res.replaceAll("x", "0"));
        }

    }

}
