import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);

        ArrayList<String> mylist = new ArrayList<>();

        // 標準入力からの値を変数strinputに代入
        String strinput = reader.readLine();

        while (strinput != null) {

            mylist.add(strinput);
            strinput = reader.readLine();

        }

        int n = Integer.valueOf(mylist.get(0).split(" ")[0]);

        double mysum = 0;
        for (int i = 1; i < 1 + n; i++) {
            for (int j = i + 1; j < 1 + n; j++) {
                String arr_temp01[] = mylist.get(i).split("\\s");
                String arr_temp02[] = mylist.get(j).split("\\s");

                int x1 = Integer.valueOf(arr_temp01[0]);
                int y1 = Integer.valueOf(arr_temp01[1]);
                int x2 = Integer.valueOf(arr_temp02[0]);
                int y2 = Integer.valueOf(arr_temp02[1]);

                double x_long = Math.pow(x1 - x2, 2);
                double y_long = Math.pow(y1 - y2, 2);
                double xy = Math.sqrt(x_long + y_long);
                //拠点間の合計をプラス
                mysum += xy;

            }

        }
        //階乗計算
        int k = 1;
        for (int i = 1; i <= n; i++) {
            k *= i;
        }
        k /= 2;

        int goukei = k * (n - 1) / (n * (n - 1) / 2 * 1);

        System.out.println(mysum * goukei / k);

    }

}
