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
        String arr[] = { "k", "e", "y", "e", "n", "c", "e" };

        if (s.substring(0, 7).equals("keyence")) {
            System.out.println("YES");
            return;
        } else if (s.substring(s.length() - 7).equals("keyence")) {
            System.out.println("YES");
            return;
        } else {

            Boolean chkflg = true;
            int sposi = 0;

            for (int i = 0; i < arr.length; i++) {

                if (s.indexOf(arr[i], sposi) >= 0) {
                    int sposi_temp = s.indexOf(arr[i], sposi);

                    if (sposi_temp != sposi) {
                        if (chkflg) {
                            chkflg = false;
                        } else {
                            System.out.println("NO");
                            return;
                        }
                    }

                    sposi = sposi_temp + 1;

                } else {
                    chkflg = false;
                    System.out.println("NO");
                    return;
                }

            }
        }

        System.out.println("YES");

    }

}
