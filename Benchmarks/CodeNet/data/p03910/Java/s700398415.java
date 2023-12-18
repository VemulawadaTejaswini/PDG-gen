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

        String arr_temp[] = mylist.get(0).split(" ");
        int x = Integer.valueOf(arr_temp[0]);

        if (x == 1) {
            System.out.println(1);
        } else if (x == 2) {

            System.out.println(2);

        } else if (x == 3) {

            System.out.println(2);
            System.out.println(1);

        } else if (x == 4) {

            System.out.println(3);
            System.out.println(1);

        } else if (x == 5) {
            System.out.println(3);
            System.out.println(2);

        } else {
            if (x % 2 == 1) {
                int halfdata = x / 2;

                System.out.println(halfdata + 1);
                System.out.println(halfdata - 1);

            } else {
                int halfdata = x / 2;

                System.out.println(halfdata);
                System.out.println(halfdata - 1);
            }

            System.out.println(1);

        }
    }

}
