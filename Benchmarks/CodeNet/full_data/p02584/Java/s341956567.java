import java.math.BigDecimal;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigDecimal X = new BigDecimal(Math.abs(sc.nextLong()));
        BigDecimal K = new BigDecimal(sc.nextLong());
        BigDecimal D = new BigDecimal(sc.nextLong());

        BigDecimal ans = BigDecimal.ZERO;
        BigDecimal KD = K.multiply(D);
        if(X.compareTo(KD) >=0 ){
            ans = X.subtract(KD);
        }else{
            BigDecimal t = new BigDecimal(Math.min(X.longValue()/D.longValue(),K.longValue()));
            K = K.subtract(t) ;
            X = X.subtract(t.multiply(D));
            if(K.longValue()%2==0){
                ans= X;
            }else{
                ans =X.subtract(D);
            }
        }

        System.out.println(Math.abs(ans.longValue()));}}