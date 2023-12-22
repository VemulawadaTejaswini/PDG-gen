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

        int a = Integer.valueOf(arr01[0]);
        int b = Integer.valueOf(arr01[1]);
        int c = Integer.valueOf(arr01[2]);
        int d = Integer.valueOf(arr01[3]);

        Boolean chkflg = true;
        Boolean isT = true;

        while (chkflg) {
            if (isT) {
                c -= b;
                if (c <= 0) {
                    System.out.println("Yes");
                    break;
                }

                isT = false;
            } else {

                a -= d;
                if (a <= 0) {
                    System.out.println("No");
                    break;
                }

                isT = true;
            }
        }

    }

}
