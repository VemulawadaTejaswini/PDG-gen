import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int n=kbd.nextInt();
   int[] X= new int[n];
   for(int i=0;i<n;i++){
     X[i]=kbd.nextInt();
   }
   long a=0;
   long b=1000000;
   for(int i=1;i<=100;i++){
     for(int j=0;j<n;j++){
     int m=Math.abs(X[j]-i);
     a=m*m+a;
   }
   b=Math.min(a,b);
   a=0;
   }

System.out.println(b);
 }
}
