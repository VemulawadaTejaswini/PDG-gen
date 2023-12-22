import java.util.Scanner;
import java.io.InputStream;
import java.math.BigDecimal;

public class Main {
    
    public static void main(String[] args) {
        new Main().excute(System.in);
    }

    public void excute(InputStream in) {
        Scanner sc = new Scanner(in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        BigDecimal ba = new BigDecimal(a);
        BigDecimal bb = new BigDecimal(b);
        BigDecimal ans = ba.multiply(bb);
        int c = ans.intValue();
        System.out.println(c);
        sc.close();
    }

}