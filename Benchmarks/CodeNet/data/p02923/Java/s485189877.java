import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

        List<String> list01 = Arrays.asList(arr02);

        List<Integer> list02 = list01.stream().map(Integer::valueOf).collect(Collectors.toList());

        //        System.out.println(list02);

        int maxdata = 0;
        int cnt = 0;

        for (int i = 0; i < list02.size() - 1; i++) {

            //            System.out.println(list02.get(i) + " " + list02.get(i + 1));
            if (list02.get(i) >= list02.get(i + 1)) {
                cnt += 1;
            } else {

                //                System.out.println(maxdata + " " + cnt);
                maxdata = Math.max(maxdata, cnt);
                cnt = 0;
            }
        }

        //        System.out.println(maxdata + " " + cnt);
        maxdata = Math.max(maxdata, cnt);

        System.out.println(maxdata);

    }

}
