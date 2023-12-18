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

        int n = Integer.valueOf(arr01[0]);

        String arr02[] = mylist.get(1).split(" ");
        String arr03[] = mylist.get(2).split(" ");

        List<String> listA_temp = Arrays.asList(arr02);
        List<String> listB_temp = Arrays.asList(arr03);

        List<Long> listA = listA_temp.stream().map(Long::valueOf).collect(Collectors.toList());
        List<Long> listB = listB_temp.stream().map(Long::valueOf).collect(Collectors.toList());

        long mysum = 0;
        long nokori = listA.get(0);

        for (int i = 0; i < listB.size(); i++) {

            long a = listB.get(i);
            long goukei = nokori + listA.get(i + 1);
            if (goukei <= a) {

                mysum += goukei;
                nokori = 0;

            } else {

                mysum += a;
                if (a <= nokori) {
                    nokori = listA.get(i + 1);
                } else {
                    nokori = listA.get(i + 1) + nokori - a;
                }
            }
        }

        System.out.println(mysum);

    }

}
