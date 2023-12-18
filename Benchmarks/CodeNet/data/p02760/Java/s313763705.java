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
        String arr02[] = mylist.get(1).split(" ");
        String arr03[] = mylist.get(2).split(" ");
        String arr04[] = mylist.get(3).split(" ");

        int a11 = Integer.valueOf(arr01[0]);
        int a12 = Integer.valueOf(arr01[1]);
        int a13 = Integer.valueOf(arr01[2]);

        int a21 = Integer.valueOf(arr02[0]);
        int a22 = Integer.valueOf(arr02[1]);
        int a23 = Integer.valueOf(arr02[2]);

        int a31 = Integer.valueOf(arr03[0]);
        int a32 = Integer.valueOf(arr03[1]);
        int a33 = Integer.valueOf(arr03[2]);

        int n = Integer.valueOf(arr04[0]);

        int array_data[][] = { { a11, a12, a13 }, { a21, a22, a23 }, { a31, a32, a33 } };
        Boolean array_result[][] = { { false, false, false }, { false, false, false }, { false, false, false } };

        for (int i = 4; i < 4 + n; i++) {
            String arr_temp[] = mylist.get(i).split(" ");
            int num = Integer.valueOf(arr_temp[0]);

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (array_data[j][k] == num) {
                        array_result[j][k] = true;
                    }
                }
            }
        }

        if (array_result[0][0] && array_result[0][1] && array_result[0][2]
                ||
                array_result[1][0] && array_result[1][1] && array_result[1][2]
                ||
                array_result[2][0] && array_result[2][1] && array_result[2][2]
                ||
                array_result[0][0] && array_result[1][0] && array_result[2][0]
                ||
                array_result[0][1] && array_result[1][1] && array_result[2][1]
                ||
                array_result[0][2] && array_result[1][2] && array_result[2][2]
                ||
                array_result[0][0] && array_result[1][1] && array_result[2][2]
                ||
                array_result[2][0] && array_result[1][1] && array_result[0][2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
