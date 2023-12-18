import java.util.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        String a = sc.nextLine();
        String[] ac = a.split("");
        int sum = 0;
        for (int i = 0; i < ac.length; i++) {
            sum = sum + Integer.valueOf(ac[i]);
        }
        BigDecimal b1 = new BigDecimal(a);
        BigDecimal[] r = b1.divideAndRemainder(new BigDecimal(sum));
        if (r[1].compareTo(BigDecimal.ZERO)==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}