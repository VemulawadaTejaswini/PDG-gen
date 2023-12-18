import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int X = sc.nextInt();
   
   int[] x=new int[N];
   for(int i=0;i<N;i++) x[i] = Math.abs(X-sc.nextInt());

   int tmpgcd =x[0];
   for(int i=1;i<N;i++) tmpgcd= gcd(tmpgcd,x[i]);
   
   System.out.println(tmpgcd);
 }
  static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
}