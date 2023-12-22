import java.util.Scanner;


class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int A = sc.nextInt();
   int B = sc.nextInt();
   int C = sc.nextInt();
   int D = sc.nextInt();
   
   int E=Math.abs(A*30-B*6);
   
   

   System.out.println((double)((A*A)+(B*B)-(2*A*B*Math.cos(E))));
 
 }
}