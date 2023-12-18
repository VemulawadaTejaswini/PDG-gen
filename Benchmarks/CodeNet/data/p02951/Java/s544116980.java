
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
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

        List<String> list01 = Arrays.asList(mylist.get(0).split(" "));

        //String arr[] = mylist.get(0).split(" ");
        int a = Integer.valueOf(list01.get(0));
        int b = Integer.valueOf(list01.get(1));
        int c = Integer.valueOf(list01.get(2));

        int nokori = a - b > 0 ? a - b : 0;

        if (nokori == 0) {
            System.out.println(c);
        } else {
            if (c >= nokori) {
                System.out.println(c - nokori);
            } else {
                System.out.println(0);
            }

        }
    }

}