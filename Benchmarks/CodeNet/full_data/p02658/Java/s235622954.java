import java.math.BigDecimal;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
      	BigDecimal maximum = new BigDecimal("1000000000000000000");
        // 整数の入力
        int N = sc.nextInt();
        boolean isbiggerthan = false;
		BigDecimal bdNum1 = new BigDecimal(sc.next());
        for(int i=1;i<N;i++){
          String s = sc.next();
          if(s.equals("0")){
			System.out.println(0);
			return;
          }
          if (!isbiggerthan){
          BigDecimal bdNumx = new BigDecimal(s);
          bdNum1 = bdNum1.multiply(bdNumx); 
          }
         if(bdNum1.compareTo(maximum) == 1){
            isbiggerthan = true;
         }
        }
        if(isbiggerthan){
          System.out.println(-1);
        }else{
        System.out.println(bdNum1);
        
    }
        }
}