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
        int n = Integer.valueOf(mylist.get(0));
        String arr[] = mylist.get(1).split(" ");

        int cnt = 0;
        int num = 1;
        for (int i = 0; i < n; i++) {
            Integer a = Integer.valueOf(arr[i]);
            if (num == a) {
                cnt += 1;
                num += 1;
            }
        }

        if (cnt == 0) {
            System.out.println(-1);
        } else {
            System.out.println(n - cnt);
        }

    }

}
