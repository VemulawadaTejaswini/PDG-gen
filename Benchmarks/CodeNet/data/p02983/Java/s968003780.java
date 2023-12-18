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

        long l = Long.valueOf(arr01[0]);
        long r = Long.valueOf(arr01[1]);
        int target = 2019;

        ArrayList<Long> list01 = new ArrayList<Long>();
        Boolean chkflg = true;

        for (long i = l; i <= r; i++) {

            if (i % target == 0) {
                list01.add(i);
                list01.add(i + 1);

                chkflg = false;
                break;
            }
        }

        if (chkflg) {

            long lamari = l % target;
            long ramari = r % target;

            long lmin = Math.min(lamari, target - lamari);
            long rmin = Math.min(ramari, target - ramari);

            //            System.out.println(lmin + " " + rmin);

            list01.add(Math.min(lmin, rmin));

            list01.add(Math.min(lmin, rmin) + 1);
        }

        System.out.println((list01.get(0) * (list01.get(1))) % 2019);

    }

}
