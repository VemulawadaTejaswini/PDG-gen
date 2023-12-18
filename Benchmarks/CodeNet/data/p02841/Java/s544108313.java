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
        String arr02[] = mylist.get(1).split(" ");

        int m1 = Integer.valueOf(arr01[0]);
        int d1 = Integer.valueOf(arr01[1]);
        int m2 = Integer.valueOf(arr02[0]);
        int d2 = Integer.valueOf(arr02[1]);

        if (m1 == 11 && d1 == 30 && m2 == 12 && d2 == 1) {
            System.out.println("1");
        } else {
            System.out.println("0");

        }

    }

}
