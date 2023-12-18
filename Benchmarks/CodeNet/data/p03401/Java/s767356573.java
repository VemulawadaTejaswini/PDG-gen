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
        String arr_temp[] = mylist.get(1).split(" ");
        Integer arr01[] = new Integer[n + 2];

        int mysum = 0;

        arr01[0] = 0;
        for (int i = 1; i <= n; i++) {
            arr01[i] = Integer.valueOf(arr_temp[i - 1]);
        }
        arr01[n + 1] = 0;

        for (int j = 0; j < n + 1; j++) {
            int temp1 = arr01[j];
            int temp2 = arr01[j + 1];
            mysum += Math.abs(temp1 - temp2);
        }
        for (int k = 0; k < n; k++) {

            int temp1 = arr01[k];
            int temp2 = arr01[k + 1];
            int temp3 = arr01[k + 2];

            //            System.out.println(temp1 + " " + temp2 + " " + temp3);

            int minus = Math.abs(temp1 - temp2);
            minus += Math.abs(temp2 - temp3);

            int plus = Math.abs(temp1 - temp3);
            System.out.println(mysum - minus + plus);

        }

    }

}
