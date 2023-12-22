import java.math.BigDecimal;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        BigDecimal a = new BigDecimal(Long.toString(scan.nextLong()));
        BigDecimal b = new BigDecimal(Double.toString(scan.nextDouble()));
        System.out.println(a.multiply(b).setScale(0, BigDecimal.ROUND_DOWN));
        scan.close();
    }
}