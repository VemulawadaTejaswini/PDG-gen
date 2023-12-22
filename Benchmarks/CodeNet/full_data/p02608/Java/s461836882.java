import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int n=kbd.nextInt();
   int[] A= new int[n+1];
   for(int i=1;i<=n;i++){
   for(int f=1;f<n;f++){
     for(int s=1;s<n;s++){
       if(f*f+s*s+f*s<i){
       for(int t=1;t<n;t++){
         if(f*f+s*s+t*t+f*s+s*t+t*f==i){
           A[i]++;
         }
       }
     }
     }
   }
   System.out.println(A[i]);
   }
 }
}
