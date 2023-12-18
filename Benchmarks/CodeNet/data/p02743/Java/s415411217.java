import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
  Scanner kbd = new Scanner(System.in);
   int a=kbd.nextInt();
   int b=kbd.nextInt();
   int c=kbd.nextInt();

   if(c-a-b>0||4*a*b<(c-a-b)*(c-a-b)){
     System.out.println("Yes");
   }else{
     System.out.println("No");
   }
}
}