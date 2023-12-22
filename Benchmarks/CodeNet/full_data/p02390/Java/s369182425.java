import java.util.*;

public class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       
       int s=n%60;
       int m=n/60;
       int h=m/60;
       m =m%60;
       System.out.printf("%d",h);
       System.out.printf(":%d",m);
       System.out.printf(":%d\n",s);
 }
   }