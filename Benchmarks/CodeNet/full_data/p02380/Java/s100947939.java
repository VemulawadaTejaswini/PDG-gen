import java.util.Scanner;

   class Main{
      public static void main(String args[]){
       Scanner scan = new Scanner(System.in);

       double a =scan.nextDouble();
       double b =scan.nextDouble();
       double c1 =scan.nextDouble();
       double C = c1*Math.PI/180;

       double s = 0.5*a*b*Math.sin(C);
       double c = Math.sqrt(a*a+b*b-2*a*b*Math.cos(C));
       double l = a+b+c;
       double h = b*Math.sin(C);

       System.out.println(s+" "+l+" "+h);

       }
   }
