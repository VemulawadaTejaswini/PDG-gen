import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   String n=kbd.next();
   System.out.println(n);
   if(n.equals("AAA")||n.equals("BBB"))
   {
     System.out.println("No");
   }else{
     System.out.println("Yes");
   }

}
}
