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

        char ch[] = new char[n];
        for (int i = 0; i < n; i++) {
            ch[i] = 'x';
        }

        for (int i = 1; i < m + 1; i++) {

            String arr_temp[] = mylist.get(i).split(" ");
            int s = Integer.valueOf(arr_temp[0]);

            char c = arr_temp[1].charAt(0);

            if (ch[s - 1] != 'x' && ch[s - 1] != c) {
                System.out.println(-1);
                return;
            }

            if (ch[s - 1] == 'x') {
                ch[s - 1] = c;
            }

        }

//        System.out.println(ch);

        if (ch[0] == 'x') {

            ch[0] = '1';
        }

        String res = String.valueOf(ch);

        res = res.replaceAll("x", "0");

        if (Integer.valueOf(res) == 0 && n > 1) {
            System.out.println(-1);
        } else {
            System.out.println(Integer.valueOf(res));
        }
    }

}
