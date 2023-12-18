import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

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

        String s1 = arr01[0];
        Integer a = Integer.valueOf(s1);
        String s2 = arr01[1];
        Integer b = Integer.valueOf(s2);

        //        System.out.println(a + " " + b);

        for (int i = 1; i <= 20; i++) {

            if (a + (i - 1) * a >= b) {
                System.out.println(i);
                break;
            }
        }

    }

}