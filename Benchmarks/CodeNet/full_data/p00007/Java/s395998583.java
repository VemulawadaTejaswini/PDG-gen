import java.util.*;

public class Main{
   public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
   int money =100000;
   for(; n>0; n--) money+=money*0.05;
   if(money/10000*10000<money)money=money/10000*10000+10000;
   System.out.println(money);
   }
   }