import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
  Scanner kbd = new Scanner(System.in);
   int a=kbd.nextInt();
   int b=kbd.nextInt();
   int c=kbd.nextInt();
   long a2 = (long)Math.sqrt(a);
   long b2 = (long)Math.sqrt(b);
   long c2 = (long)Math.sqrt(c);

   if(a2+b2<c2){
     System.out.println("Yes");
   }else{
     System.out.println("No");
   }
}
}
