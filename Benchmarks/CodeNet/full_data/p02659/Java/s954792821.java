import java.util.Scanner;


class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int A = sc.nextInt();
   double B = sc.nextDouble();
   long b = (double) B*100;

   System.out.println(A*b/100);
 
 }
}

