import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int n=kbd.nextInt();
   int m=kbd.nextInt();

   int[] A= new int[n+1];
   int[] B= new int[n+1];//個数
   A[1]=1;//左から１番目が０ではないように。
     for(int i=0;i<m;i++){
       int k=kbd.nextInt();
       int l=kbd.nextInt();
       if(A[k]!=l){
       B[k]++;
     }
     A[k]=l;
  }
  int x=0;
  for(int i=0;i<n;i++){
  if(B[i]>1){
   x=-1;
  }
}
if(n!=1&&A[1]==0){
  x=-1;
}
if(x==0){
  for(int i=1;i<=n;i++){
  System.out.print(A[i]);
}
}else{
  System.out.println(-1);
}
}
}