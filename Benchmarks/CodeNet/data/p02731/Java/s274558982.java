import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int l=kbd.nextInt();

   double a;
   double b;
   double c;
   double m;
   double max=0;
   for(int i=0;i<l;i++){
     for(int p=0;p<l-i;p++){
       m=i*p*(l-i-p);
       if(m>max){
         max=m;
       }
     }
   }
   System.out.printf("%.6f\n",max);
 }
}
