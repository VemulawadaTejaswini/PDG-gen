import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            BigDecimal a = new BigDecimal(sc.next());
            BigDecimal b = new BigDecimal(sc.next());
            BigDecimal n = new BigDecimal(sc.next());
            BigDecimal one = new BigDecimal("1");  


            BigDecimal ans = new BigDecimal("0");

            if(n.compareTo(one)){
                BigDecimal ans1 = a.multiply(one.divide(b));
                BigDecimal ans11 = ans1.setScale(0, BigDecimal.ROUND_DOWN);
                BigDecimal ans2 = one.divide(b);
                BigDecimal ans22 = ans2.setScale(0, BigDecimal.ROUND_DOWN);

                ans = ans11.subtract(a.multiply(ans22));
            }else if(b.compareTo(n) == 1){
                BigDecimal ans1 = a.multiply(n.divide(b));
                BigDecimal ans11 = ans1.setScale(0, BigDecimal.ROUND_DOWN);
                BigDecimal ans2 = n.divide(b);
                BigDecimal ans22 = ans2.setScale(0, BigDecimal.ROUND_DOWN);

                ans = ans11.subtract(a.multiply(ans22));
            }else{
                BigDecimal ans1 = a.multiply((n.subtract(one)).divide(b));
                BigDecimal ans11 = ans1.setScale(0, BigDecimal.ROUND_DOWN);
                BigDecimal ans2 = (n.subtract(one)).divide(b);
                BigDecimal ans22 = ans2.setScale(0, BigDecimal.ROUND_DOWN);

                ans = ans11.subtract(a.multiply(ans22));
            }

            System.out.println((long)ans);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}