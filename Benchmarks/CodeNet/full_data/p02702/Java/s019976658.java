import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int len = S.length();
        BigDecimal d2019 = new BigDecimal("2019");
        BigDecimal d0 = new BigDecimal("0");
        int count=0;
        for(int i=0;i<len-4;i++){
            for(int j=4;j<=len-i;j++){
                BigDecimal d = new BigDecimal(S.substring(i,i+j));
                BigDecimal remainder = d.remainder(d2019);
                if(d0.compareTo(remainder) == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}