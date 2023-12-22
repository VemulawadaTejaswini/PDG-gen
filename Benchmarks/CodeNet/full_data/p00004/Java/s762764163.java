 import java.util.Scanner;
 
 public class Main{
     public static void main(String[] args){
 
         Scanner scan = new Scanner(System.in);
 
         while(scan.hasNextInt()){
 
             int a = scan.nextInt();
             int b = scan.nextInt();
             int c = scan.nextInt();
             int d = scan.nextInt();
             int e = scan.nextInt();
             int f = scan.nextInt();
 
             double tmp = a*e-b*d;
             double x = (double)(c*e-b*f)/tmp;
             double y = (double)(-c*d+a*f)/tmp;
 
       System.out.println(String.format("%.3f",x) +" "+String.format("%.3f",y));

         }
      }
  }