import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int n =kbd.nextInt();
   int a=n/100;
   int b=(n-100*a)/10;
   int c=(n-100*a-10*b);
   if(a!=7&&b!=7&&c!=7){
     System.out.println("No");
   }else{
     System.out.println("Yes");
   }
 }
}
