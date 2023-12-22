import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int n=kbd.nextInt();
   double a=0;
   double x=1;

   double[] A= new double[n];
   for(int i=0;i<n;i++){
     long c=kbd.nextLong();
     if(c==0){
       x=0;
       a=0;
       i=n;
     }else{
     A[i]=Math.log10(c);
      a=a+A[i];
      x=x*c;
   }
 }

   if(a>18){
     x=-1;
   }
   long k=(long)x;
   System.out.println(k);

 }
}