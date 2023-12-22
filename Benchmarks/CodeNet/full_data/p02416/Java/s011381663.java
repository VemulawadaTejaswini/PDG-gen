import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Collections;
import java.math.BigDecimal;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        while (sc.hasNext()) {
            String s = sc.next();
            BigDecimal b = new BigDecimal(s);
            
            if (b.compareTo(new BigDecimal(0)) == 0) break;
            
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += Character.getNumericValue(s.charAt(i));
            }
            System.out.println(sum);
        }
    }
}