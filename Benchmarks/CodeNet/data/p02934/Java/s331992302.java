import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BigDecimal x1 = new BigDecimal("1");
        BigDecimal y = new BigDecimal("30");
        BigDecimal z = new BigDecimal("10");

        //足し算
        //        BigDecimal z1 = x.add(y);
        //        //引き算
        //        BigDecimal z2 = x.subtract(y);
        //        //掛け算
        //        BigDecimal z3 = x.multiply(y);
        //割り算
        BigDecimal z4 = x1.divide(y, 5, BigDecimal.ROUND_FLOOR);
        //割り算
        BigDecimal z5 = x1.divide(z, 5, BigDecimal.ROUND_FLOOR);

        BigDecimal z1 = new BigDecimal("1");
        BigDecimal z6 = z1.add(z4);

        //        System.out.println(z1);
        //        System.out.println(z2);
        //        System.out.println(z3);
        //        System.out.println(z4);
        //        System.out.println(z5);
        //        System.out.println(z6);

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

        String s1 = arr01[0];
        Integer n = Integer.valueOf(s1);

        BigDecimal bd[] = new BigDecimal[n];

        BigDecimal mysum = new BigDecimal("0");

        BigDecimal x = new BigDecimal("1");
        for (int i = 0; i < n; i++) {
            bd[i] = new BigDecimal(arr02[i]);

            BigDecimal temp = x.divide(bd[i], 10, BigDecimal.ROUND_FLOOR);
            mysum = mysum.add(temp);

        }

        BigDecimal result = x.divide(mysum, 10, BigDecimal.ROUND_FLOOR);

        System.out.println(result);

    }

}