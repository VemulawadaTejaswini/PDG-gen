import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int l=kbd.nextInt();
   double x=l/3;
    System.out.printf("%.6f\n",x*x*x);
}
}