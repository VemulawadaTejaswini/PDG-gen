import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
  int n=kbd.nextInt();
    int[] A= new int[n];
    for(int i=0;i<n-1;i++){
      A[i]=kbd.nextInt();
 }
 int x=n-1;
 int l=n-1;
   int[] B= new int[n+1];
   for(int t=n;t>=1;t--){
   for(int i=x;i>=0;i--){
     if(A[i]==t){
      B[t]=B[t]+1;
      l=i;
     }
     x=l;
}
}
for(int t=1;t<=n;t++){
 System.out.println(B[t]);
}
}
}
