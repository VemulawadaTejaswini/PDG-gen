import java.util.Scanner;

public class Main{
public static void main(String[]  args){
  Scanner stdIn = new Scanner(System.in);
   double n = stdIn.nextInt();
   double x = stdIn.nextInt();
   double t = stdIn.nextInt();

  double y = Math.ceil(n/x);
    System.out.print(Math.ceil(t * y));
}
}