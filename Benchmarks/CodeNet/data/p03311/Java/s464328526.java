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

        int arr02[] = new int[n];

        int cnt = 0;
        for (String s : mylist.get(1).split(" ")) {

            arr02[cnt] = Integer.valueOf(s);
            cnt += 1;
        }
        //        System.out.println(Arrays.toString(arr02));

        int maxdata = arr02[cnt - 1];
        //        System.out.println(maxdata);

        int mindata = Integer.MAX_VALUE;
        for (int b = maxdata * -1; b < maxdata; b++) {
            int temp = 0;
            for (int k = 0; k < n; k++) {
                temp += Math.abs(arr02[k] - (b + k + 1));
            }
            //            System.out.println(b + " " + temp);
            mindata = Math.min(mindata, temp);

        }

        System.out.println(mindata);

    }

}
