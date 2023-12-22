import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   long n=kbd.nextLong();
   double m=kbd.nextDouble()*100;
   double a=n*m/100;
   long x=(long)a;
   System.out.println(x);
 }
}
