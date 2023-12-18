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
        int m = Integer.valueOf(arr01[1]);

        int cnt1 = 0;
        int cnt2 = 0;
        Boolean chkflg = true;
        int before_data = 0;

        ArrayList<String> list01 = new ArrayList<String>();
        ArrayList<String> list02 = new ArrayList<String>();
        for (int i = 1; i < 1 + m; i++) {

            String arr_temp[] = mylist.get(i).split(" ");
            String p = arr_temp[0];
            String s = arr_temp[1];

            if (s.equals("AC")) {
                if (!list01.contains(p)) {
                    list01.add(p);
                }
            } else {
                if (!list01.contains(p)) {
                    list02.add(p);
                }

            }

        }

        System.out.println(list01.size() + " " + list02.size());

    }

}
