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

        int n = Integer.valueOf(mylist.get(0));

        int i = 1;

        int cnt = 0;
        cnt = countup(n, i, cnt);

    }

    public static int countup(int n, int i, int cnt) {

        if (n == 0) {
            System.out.println(cnt);
        } else {

            if (n >= Math.pow(9, i) || n >= Math.pow(6, i)) {
                countup(n, i + 1, cnt);

            } else {

                int amari1 = n % (int) Math.pow(9, i - 1);
                int amari2 = n % (int) Math.pow(6, i - 1);

                //                System.out.println(amari1 + " " + amari2);

                if (amari1 <= amari2) {

                    //                    System.out
                    //                            .println("9=" + cnt + " " + n + " " + Math.pow(9, i - 1) + " " + (n - Math.pow(9, i - 1)));
                    n -= Math.pow(9, i - 1);

                    cnt += 1;

                    countup(n, 1, cnt);
                } else if (n >= Math.pow(6, i - 1)) {

                    //                    System.out
                    //                            .println("6=" + cnt + " " + n + " " + Math.pow(6, i - 1) + " " + (n - Math.pow(6, i - 1)));
                    n -= Math.pow(6, i - 1);
                    cnt += 1;

                    countup(n, 1, cnt);

                }
            }
        }

        return cnt;

    }

}
