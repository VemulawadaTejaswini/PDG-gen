import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);

   int n=kbd.nextInt();
   int k=kbd.nextInt();

   int[] A= new int[n+1];
   int[] B= new int[n+1];
    for(int i=1;i<=n;i++){
     A[i]=kbd.nextInt();
     B[i]=1;
    }

   for(int l=0;l<k;l++){
   for(int i=1;i<=n;i++){ //iは座標
     for(int j=1;j<n;j++)//jは照らしている範囲
     if(A[i]>=j){
       if(i+j<=n){
       B[i+j]++;
     }
       if(i-j>=1){
       B[i-j]++;
     }
   }
 }
   for(int i=1;i<=n;i++){
   A[i]=B[i];
   B[i]=1;
   }
 }
   for(int i=1;i<=n-1;i++){
     System.out.print(A[i]+" ");
   }
   System.out.println(A[n]);
 }
}