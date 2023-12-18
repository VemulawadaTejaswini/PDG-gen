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

        int mysum = 0;
        int temp = 0;
        for (int i = 1; i < 1 + n; i++) {
            String arr_temp[] = mylist.get(i).split(" ");

            String s = arr_temp[0];
            int t = Integer.valueOf(arr_temp[1]);
            mysum += t;
            //            System.out.println(s + " " + t + " " + mysum + " " + mylist.get(n + 1));
            if (s.equals(mylist.get(n + 1))) {
                temp = mysum;
            }

        }

        System.out.println(mysum - temp);
    }

}
