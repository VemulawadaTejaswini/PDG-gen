import java.math.BigDecimal;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int length = sc.nextInt();
        sc.nextLine();
        String[] arr = sc.nextLine().split(" ");
        BigDecimal ans = BigDecimal.ONE;
        for(String str : arr){
            ans = ans.multiply(new BigDecimal(str));
        }
        if(ans.compareTo(new BigDecimal(("1000000000000000000"))) <= 0){
            System.out.println(ans);
        }else {
            System.out.println(-1);
        }
    }
}