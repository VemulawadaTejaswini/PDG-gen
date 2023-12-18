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

        int x = Integer.valueOf(mylist.get(0));

        if (x == 2) {
            System.out.println(x);
        } else if (x == 3) {
            System.out.println(x);

        } else {

            Boolean chkflg = true;

            while (chkflg) {

                //                System.out.println(x);

                if (x % 2 == 0) {
                    x += 1;
                } else {

                    Boolean isPrime = true;
                    for (int i = 3; i < x; i++) {
                        if (x % i == 0) {
                            x += 1;
                            isPrime = false;
                            break;
                        }
                    }

                    if (isPrime) {
                        chkflg = false;
                    }

                }

            }

            System.out.println(x);

        }

    }

}
