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

        long mysum = 0;

        int cnt = 0;

        while (cnt <= n) {

            if (!(cnt % 3 == 0 || cnt % 5 == 0)) {
                mysum += cnt;
            }

            cnt += 1;

        }

        System.out.println(mysum);

    }

}
