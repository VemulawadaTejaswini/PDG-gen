import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
  Scanner kbd = new Scanner(System.in);
   int a=kbd.nextInt();
   int b=kbd.nextInt();
   int c=kbd.nextInt();
   double a2 = Math.sqrt(a);
   double b2 = Math.sqrt(b);
   double c2 = Math.sqrt(c);

   if(a2+b2<c2){
     System.out.println("Yes");
   }else{
     System.out.println("No");
   }
}
}
