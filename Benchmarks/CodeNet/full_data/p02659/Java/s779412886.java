import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble(),B = sc.nextDouble();
        String S = BigDecimal.valueOf((double) A*B).toPlainString();
        if(S.contains(".")){
            System.out.println(S.substring(0,S.indexOf('.')));
        }else{
            System.out.println(S);
        }
    }
}
