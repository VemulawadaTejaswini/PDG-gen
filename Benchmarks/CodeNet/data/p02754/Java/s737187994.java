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

        int n = Integer.valueOf(arr01[0]);
        int a = Integer.valueOf(arr01[1]);
        int b = Integer.valueOf(arr01[2]);

        int sho = n / (a + b);
        int amari = n % (a + b);

        int ball1 = a * sho;
        int ball2 = Math.min(amari, a);

        System.out.println(ball1 + ball2);

    }

}
