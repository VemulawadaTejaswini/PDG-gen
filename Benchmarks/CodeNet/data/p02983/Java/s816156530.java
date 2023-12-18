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
        long temp = l;
        ArrayList<Long> list01 = new ArrayList<Long>();
        Boolean chkflg = false;

        if (r <= target) {
            list01.add(l);
            list01.add(l + 1);

        } else {
            while (list01.size() < 2) {

                if (chkflg) {
                    target += 1;
                }
                for (long i = l; i <= r; i++) {

                    //                    System.out.println(i + " " + i % target);
                    if (i % target == 0) {
                        //                        System.out.println(i);
                        list01.add(i);
                        temp = i;
                        break;
                    }
                }
                //            System.out.println(temp);
                for (long j = temp + 1; j <= r; j++) {
                    if (j % target == 0) {
                        //                        System.out.println(j);

                        list01.add(j);
                        break;
                    }

                }
                chkflg = true;

            }
        }
        System.out.println((list01.get(0) * list01.get(1)) % 2019);

    }

}
