import java.util.Scanner;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        
        double ave = ((double)a) + ((double)b) / 2;
        BigDecimal bd = new BigDecimal(ave);
        BigDecimal bd1 = bd.setScale(0, BigDecimal.ROUND_HALF_UP);
        System.out.println(bd1);
    }
}
