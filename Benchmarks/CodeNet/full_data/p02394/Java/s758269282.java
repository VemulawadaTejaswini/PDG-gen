import java.util.Scanner;

public class Main{
   public static void main(String Args[]){
      Scanner sc = new Scanner(System.in);
      int  W = sc.nextInt();
      int  H = sc.nextInt();
      int  x = sc.nextInt();
      int  y = sc.nextInt();
      int  r = sc.nextInt();
      
     
      if(x<=W && y<=H && x>=0 && y>=0 && r+x<=W && r+y<=H)
        System.out.println("Yes");
      else
        System.out.println("No");
   }
}
