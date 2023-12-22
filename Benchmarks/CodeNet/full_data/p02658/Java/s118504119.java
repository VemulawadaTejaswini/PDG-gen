import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int n=kbd.nextInt();
   
   int[] A= new int[n];
   for(int i=0;i<n;i++){
     A[i]=kbd.nextInt();
   }
   
   long a=1;
   for(int i=0;i<n;i++){
   a=a*A[i];
   }
   if(a>10*10*10*10*10*10*10*10*10*10*10*10*10*10*10*10*10*10){
   a=-1;
   }
   System.out.println(a);
}
}