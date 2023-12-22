import java.util.*;
import java.math.BigInteger;

public class Main {
   public static void main(String[] args) throws Exception {
	   
       String [] unit = {"","Man","Oku","Cho","Kei","Gai","Jo","Jou","Ko","Kan","Sei","Sai","Gok","Ggs","Asg","Nyt","Fks","Mts"};
       BigInteger k = BigInteger.valueOf(10000);
       Scanner sc = new Scanner(System.in);
       while(sc.hasNextInt()){
           BigInteger m = sc.nextBigInteger();
           int n = sc.nextInt();
           if(m.equals(BigInteger.ZERO) && n==0) break;
           BigInteger b = m.pow(n);
           String ans = "";
           for(int i=0;i<18;i++){
        	   BigInteger digit = b.remainder(k);
        	   if(!digit.equals(BigInteger.ZERO)){
        		   ans = digit + unit[i] + ans ;
        	   }
               b = b.divide(k);
           }
           System.out.println(ans);
       }
   }
}
