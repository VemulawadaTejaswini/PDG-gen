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
        int a = Integer.valueOf(arr_temp[0]);
        int b = Integer.valueOf(arr_temp[1]);
        int c = Integer.valueOf(arr_temp[2]);

        double ans1 = Math.sqrt((double) a) + Math.sqrt((double) b);
        double ans2 = Math.sqrt((double) c);

        System.out.println(ans1 < ans2 ? "Yes" : "No");

    }

}
