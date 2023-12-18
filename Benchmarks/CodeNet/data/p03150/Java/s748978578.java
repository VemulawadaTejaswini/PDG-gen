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
        int cnt = 0;
        int sposi = 0;

        if (s.substring(0, 7).equals("keyence")) {
            System.out.println("YES");
            return;
        } else if (s.substring(s.length() - 7).equals("keyence")) {
            System.out.println("YES");
            return;
        } else {

            String arr[] = { "k", "e", "y", "e", "n", "c", "e" };

            for (int i = 0; i < arr.length; i++) {

                if (s.indexOf(arr[i], sposi) >= 0) {

                    if (sposi - s.indexOf(arr[i], sposi) != 0) {

                        cnt += 1;

                    }

                    sposi = s.indexOf(arr[i], sposi);

                    sposi += 1;

                } else {

                    System.out.println("NO");
                    return;
                }

            }
            //            System.out.println(cnt + " " + sposi);
            //            System.out.println(s.substring(sposi));

            if (cnt == 1 && s.substring(sposi).length() == 0) {
                System.out.println("YES");
                return;
            } else {
                System.out.println("NO");
                return;
            }
        }

    }

}
