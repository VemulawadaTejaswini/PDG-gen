import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int n=kbd.nextInt();
   int k=kbd.nextInt();
   int[] A= new int[n+1];


  for(int j=0;j<k;j++){
  int d=kbd.nextInt();
 for(int i=0;i<d;i++){
   A[kbd.nextInt()]++;
 }
}
int a=0;
  for(int j=1;j<=n;j++){
if(A[j]==0){
  a=a+1;
}
}
System.out.println(a);

}
}
