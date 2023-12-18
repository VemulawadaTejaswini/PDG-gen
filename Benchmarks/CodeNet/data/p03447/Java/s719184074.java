import java.util.*;
public class BuyingSweets {
      public static void main(String[]args) {
    	  Scanner scan=new Scanner(System.in);
    	  int x=scan.nextInt();
    	  int a=scan.nextInt();
    	  int b=scan.nextInt();
    	  System.out.print((x-a)%b);
      }
}