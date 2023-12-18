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

        //        int arrcheck[] = { 0, 0, 0, 0 };
        Boolean arrchk[] = { false, false, false, false };
        
        

        for (int i = 0; i < 3; i++) {

            String arr01[] = mylist.get(i).split(" ");

            int a = Integer.valueOf(arr01[0]);
            int b = Integer.valueOf(arr01[1]);

            if (!arrchk[a - 1] && !arrchk[b - 1]) {
                //                arrcheck[a - 1] = 1;
                //                arrcheck[b - 1] = 1;
                arrchk[a - 1] = true;
                arrchk[b - 1] = true;

            }

        }

        //        int mysum = Arrays.stream(arrcheck).sum();

        if (arrchk[0] == true && arrchk[1] == true && arrchk[2] == true && arrchk[3] == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }

        //        System.out.println(mysum == 4 ? "YES" : "NO");

    }
}
