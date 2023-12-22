import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author : Ritchie Zhang
 * @date : 2020/5/10
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 */
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        System.out.println(change(a));


    }

    public static String change(long n){
        String s = "";
        while (n>0){
            long m = n % 26;
            if (m == 0)
            {
                m = 26;
            }
            s = (char)(m + 96) + s;
            n = (n - m) / 26;
        }
        return s;
    }
}


