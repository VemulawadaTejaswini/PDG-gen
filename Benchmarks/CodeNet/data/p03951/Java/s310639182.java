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

        Integer n = Integer.valueOf(mylist.get(0));
        String s = mylist.get(1);
        String t = mylist.get(2);

        if (s.equals(t)) {
            System.out.println(n);
        } else {

            for (int i = 0; i < n; i++) {

                String stemp = s.substring(n - i - 1, n - i);
                String ttemp = t.substring(i, i + 1);
//                System.out.println(stemp + " " + ttemp);
                if (!stemp.equals(ttemp)) {
                    System.out.println(n * 2 - i);
                    return;
                }

            }
            System.out.println(n * 2 - 1);
        }

    }

}
