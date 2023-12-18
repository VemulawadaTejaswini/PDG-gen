import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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

        String arr02[] = mylist.get(1).split(" ");
        int n = Integer.valueOf(arr01[0]);
        int m = Integer.valueOf(arr01[1]);

        int mysum = 0;

        for (String s : arr02) {
            mysum += Integer.valueOf(s);
        }

        Stream<String> stream = Arrays.stream(arr02);
        int arr03[] = stream.mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr03);

        System.out.println(Arrays.toString(arr03));

        Boolean chkflg = true;
        double data = (double) 1 / (4 * m);

        for (int j = n - 1; j >= n - m; j--) {
            double temp = (double) arr03[j] / mysum;
//            System.out.println(temp + " " + data);

            if (temp < data) {
                chkflg = false;
                break;
            }

        }

        System.out.println(chkflg ? "Yes" : "No");

    }

}