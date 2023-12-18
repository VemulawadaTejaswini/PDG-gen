import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] Ai = new int[N];
   for(int i=0;i<N;i++) Ai[i] = sc.nextInt();
   
   int gcdmem = Ai[0];
   
   for(int i=1;i<N;i++)
   {
     gcdmem = gcd(gcdmem,Ai[i]);     
   }
    System.out.print(gcdmem);   
 }
  static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
}