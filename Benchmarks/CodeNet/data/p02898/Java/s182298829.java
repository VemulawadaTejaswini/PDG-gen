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

        List<String> list01 = Arrays.asList(mylist.get(0).split(" "));
        List<String> list02 = Arrays.asList(mylist.get(1).split(" "));

        int n = Integer.valueOf(list01.get(0));
        int k = Integer.valueOf(list01.get(1));

        List<Integer> list03 = list02.stream().map(Integer::valueOf).collect(Collectors.toList());

        Long result1 = list03.stream().filter(s -> s >= k).count();
        System.out.println(result1);

    }

}
