import java.util.*;

public class Main{

   public static void main(String[] args){
       Scanner sc =new Scanner(System.in);
       int a,b;
       a=sc.nextInt();
       b=sc.nextInt();
       for(int i=1;i<=3;i++){
           if(a*b*i&1){
               System.out.println("Yes");
               System.exit(0);
           }
       }
       System.out.println("No");
    }
}