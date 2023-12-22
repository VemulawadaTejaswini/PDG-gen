import java.util.*;

public class Main {
   public static void main(String[] args) throws Exception {
       String [] unit = {"","Man","Oku","Cho","Kei","Gai","Jo","Jou","Ko","Kan","Sei","Sai","Gok","Ggs","Asg","Nyt","Fks","Mts"};
       Scanner sc = new Scanner(System.in);
       while(sc.hasNextInt()){
           int m = sc.nextInt();
           int n = sc.nextInt();
           if(m==0 && n==0) break;
           Math.BigInteger b = valueOf(Math.pow(m,n));
           
           String ans = "";
           for(int i=0;i<18;i++){
               String digit = remainder(b,10000);
               ans = digit.concat(unit[i]+ans);
               b = divide(b,10000);
           }
           System.out.println(ans);
       }
   }
}
