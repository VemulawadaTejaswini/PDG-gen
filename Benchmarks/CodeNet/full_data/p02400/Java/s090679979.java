import java.util.Scanner;
class Main
 {
   public static void main(String[] args)
  	{
   Scanner S = new Scanner(System.in);
  	double r = S.nextDouble();
  	System.out.printf("%.6f %.6f\n", r * r * Math.PI, r * 2 * Math.PI);
}
}
