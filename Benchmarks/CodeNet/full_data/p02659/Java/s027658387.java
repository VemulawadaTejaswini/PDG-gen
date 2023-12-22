import java.util.*;
import java.math.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble()*100;
        System.out.println(BigDecimal.valueOf(Math.floor(a*b/100)).toPlainString());
    }
}