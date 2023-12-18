
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

        String s = mylist.get(0);
        String t = mylist.get(1);

        int cnt = 0;

        int j = 0;
        while (j < s.length()) {

            if (s.substring(j,j+1).equals(t.substring(j,j+1))) {
                cnt += 1;
            } 
            j++;

        }

        System.out.println(cnt);

    }

}
