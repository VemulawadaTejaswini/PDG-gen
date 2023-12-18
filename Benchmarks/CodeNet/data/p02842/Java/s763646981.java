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

        double temp = n / 1.08;
        int zeinuki = (int) temp;

        double temp2 = zeinuki * 1.08;
        int zeikomi1 = (int) temp2;
        double temp3 = (zeinuki + 1) * 1.08;
        int zeikomi2 = (int) temp3;

        if (n == zeikomi1) {
            System.out.println(zeinuki);
        } else if (n == zeikomi2) {
            System.out.println(zeinuki + 1);
        } else {
            System.out.println(":(");
        }

    }

}
