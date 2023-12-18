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

        int n = Integer.valueOf(arr01[0]);
        String arr02[] = mylist.get(1).split(" ");

        int mysum1 = 0;
        int mysum2 = 0;
        int before1 = 0;
        int before2 = 0;

        Boolean chkflg = true;
        for (int i = 1; i < 1 + n; i++) {

            if (i == n) {

                if (chkflg) {

                    mysum1 += Math.abs(Integer.valueOf(arr02[before1]) - Integer.valueOf(arr02[n - 1]));
                } else {

                    mysum2 += Math.abs(Integer.valueOf(arr02[before2]) - Integer.valueOf(arr02[n - 1]));

                }
                break;
            }

            if (chkflg) {

                mysum1 += Math.abs(Integer.valueOf(arr02[before1]) - Integer.valueOf(arr02[i]));
                chkflg = false;
                before1 = i;

            } else {

                mysum2 += Math.abs(Integer.valueOf(arr02[before2]) - Integer.valueOf(arr02[i]));
                chkflg = true;
                before2 = i;
            }
        }

        System.out.println(mysum1 >= mysum2 ? mysum2 : mysum1);

    }

}