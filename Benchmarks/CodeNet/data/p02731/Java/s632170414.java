import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int l=kbd.nextInt();
   double a=l*l*l/27;
  //double A=a/27;
    System.out.printf("%.6f\n",a);
}
}