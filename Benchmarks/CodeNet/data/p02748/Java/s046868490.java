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
        String arr03[] = mylist.get(2).split(" ");

        int a = Integer.valueOf(arr01[0]);
        int b = Integer.valueOf(arr01[1]);
        int m = Integer.valueOf(arr01[2]);

        Stream<String> stream02 = Arrays.stream(arr02);
        int arr02_temp[] = stream02.mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr02_temp);

        Stream<String> stream03 = Arrays.stream(arr03);
        int arr03_temp[] = stream03.mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr03_temp);

        long mysum = arr02_temp[0] + arr03_temp[0];

        for (int i = 3; i < 3 + m; i++) {

            String arr_temp[] = mylist.get(i).split(" ");

            int x = Integer.valueOf(arr_temp[0]);
            int y = Integer.valueOf(arr_temp[1]);
            int c = Integer.valueOf(arr_temp[2]);

            long mytemp = arr02_temp[x - 1] + arr03_temp[y - 1] - c;

            mysum = Math.min(mysum, mytemp);

        }

        System.out.println(mysum);

    }

}
